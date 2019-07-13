package com.stackroute.demo;


import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
@Component
public class BeanLifeCycleDemoBean implements InitializingBean, DisposableBean {
    public void destroy() throws Exception {
        System.out.println("destroy");
    }

    public void afterPropertiesSet() throws Exception {
        System.out.println("afterPropertiesSet");
    }

    public void customInit()
    {
        System.out.println("customInit");
    }

    public void customDestroy()
    {
        System.out.println("customDestroy");
    }

}