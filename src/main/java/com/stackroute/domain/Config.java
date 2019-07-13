package com.stackroute.domain;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages = "com.stackroute")
public class Config {

    @Bean
    public Actor actor()
    {
        Actor actor =new Actor();
        actor.setAge(22);
        actor.setGender("male");
        actor.setName("Tom Holland");
        return actor;
    }
    @Bean("movie1")
    public Movie makeMovieObject()
    {
        Movie movie =new Movie(actor());
        return movie;
    }



}
