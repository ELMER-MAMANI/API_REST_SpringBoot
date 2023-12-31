package rest.spr.api.infra.security;
/**CREATED BY Elmer Mamani
 * Backend Developer*/
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

@Configuration //le digo que es una configuracion.
@EnableWebSecurity //habilita web security.
public class SecurityConfiguration {

    @Autowired
    private SecurityFilter securityFilter;
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity)throws Exception{
      return httpSecurity.csrf().disable().sessionManagement()
              .sessionCreationPolicy(SessionCreationPolicy.STATELESS)
              .and().authorizeRequests()
              .requestMatchers(HttpMethod.POST,"/autors")
              .permitAll()
              .anyRequest()
              .authenticated()
              .and()
              .addFilterBefore(securityFilter, UsernamePasswordAuthenticationFilter.class)
              .build();
    }

    @Bean
    public AuthenticationManager authenticationManager(AuthenticationConfiguration authenticationConfiguration)
            throws  Exception{
    return authenticationConfiguration.getAuthenticationManager();
    }
    @Bean
    public PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }
    //Metodo para convertir la clave Bycryp
}
