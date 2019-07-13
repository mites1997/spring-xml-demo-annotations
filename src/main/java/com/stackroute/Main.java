package com.stackroute;

import com.stackroute.domain.Config;
import com.stackroute.domain.Movie;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionReader;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class Main {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(Config.class);
        context.scan("com.stackroute");
        Movie mv=context.getBean("movie", Movie.class);
        mv.printAboutMovieActor();
        Movie mv1=context.getBean("movie",Movie.class);
        System.out.println(mv==mv1);

    }

}