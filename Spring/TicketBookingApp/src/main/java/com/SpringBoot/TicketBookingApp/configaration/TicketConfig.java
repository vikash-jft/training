package com.SpringBoot.TicketBookingApp.configaration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@EnableWebSecurity
public class TicketConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        //super.configure(http);
       /* http.csrf().disable().authorizeRequests().antMatchers("/user/tickets/**")
                .hasAnyRole("user","admin").and().formLogin();
        http.csrf().disable().authorizeRequests().antMatchers("/admin/tickets/**")
                .hasAnyRole("admin").and().formLogin();*/

       // Comment :- Both are form same work perpose.

        http.csrf().disable().authorizeRequests().antMatchers("/user/tickets/**")
                .hasAnyRole("user","admin").and().authorizeRequests()
                .antMatchers("/admin/tickets/**").hasAnyRole("admin").and().formLogin();
    }
    @Autowired
    public void configureGloble(AuthenticationManagerBuilder auth) throws Exception{
        /*auth.inMemoryAuthentication().withUser("Raja").password("123").roles("user");
        auth.inMemoryAuthentication().withUser("Vikash").password("123").roles("user","admin");*/

        // Same way at above doing that is also write other way to marge two lines of code.

        auth.inMemoryAuthentication().withUser("Raja").password("123").roles("user")
                .and().withUser("Vikash").password("123").roles("user","admin");
    }
}
