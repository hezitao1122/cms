package com.yuxin.config.secrityCondig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class SecrutyConfiguation extends WebSecurityConfigurerAdapter {
    @Autowired
    private SecuritySettings settings;


    @Override
    protected void configure(HttpSecurity http) throws Exception {
        //http.formLogin().loginPage("/login").permitAll().successForwardUrl(loginSuccessHandler())
       // .and().auth;
    }
}
