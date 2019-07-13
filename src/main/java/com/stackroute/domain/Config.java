package com.stackroute.domain;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
//@ComponentScan(basePackages = "com.stackroute")
public class Config {

    @Bean
    public Actor actor()
    {
        return new Actor("Tom","male",42);
    }

    @Bean
    public Actor actor1()
    {
        return new Actor("Tim","male",32);
    }

    @Bean
    public Actor actor2() {
        return new Actor("John", "male", 25);
    }

    @Bean({"movie1","movie2"})
    @Scope("prototype")
    public Movie makeMovieObject()
    {
        Movie movie =new Movie(actor());
        return movie;
    }
}