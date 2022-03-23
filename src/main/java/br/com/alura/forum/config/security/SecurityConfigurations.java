package br.com.alura.forum.config.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@EnableWebSecurity
@Configuration
public class SecurityConfigurations extends WebSecurityConfigurerAdapter{
    
    @Override //configurações de autenticação
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        
    }

    @Override // configurações de recursos estáticos, tecnologias de view(jsp, js, css, img, etc)
    public void configure(WebSecurity web) throws Exception {
        
    }

    @Override //configurações de autorização
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
        .antMatchers(HttpMethod.GET,"/topicos").permitAll()
        .antMatchers(HttpMethod.GET,"/topicos/*").permitAll()
        .anyRequest().authenticated()
        .and().formLogin();
    }

}
