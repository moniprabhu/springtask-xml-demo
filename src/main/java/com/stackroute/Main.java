package com.stackroute;

import com.stackroute.domain.Movie;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class Main {
    public  static void main(String[] args) {


        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("autowirebean.xml");
        Movie movie1=(Movie)applicationContext.getBean("movie1");
        System.out.println(movie1.toString());


    }




    }


