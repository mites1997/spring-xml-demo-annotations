package com.stackroute.domain;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration

public class Config {

    @Bean
    public Actor actor()
    {
        return new Actor("Tom","male",42);
    }

    @Bean
    public Actor actor1()
    {
        return new Actor("John","male",32);
    }

    @Bean
    public Actor actor2() {
        return new Actor("Ron", "male", 22);
    }


}