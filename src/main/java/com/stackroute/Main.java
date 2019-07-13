package com.stackroute;


import com.stackroute.domain.Config;
import com.stackroute.domain.Movie;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String args[])
    {

                ApplicationContext context=new AnnotationConfigApplicationContext(Config.class);
                Movie mv=context.getBean("movie1", Movie.class);
                mv.printAboutMovieActor();
            }

        }



