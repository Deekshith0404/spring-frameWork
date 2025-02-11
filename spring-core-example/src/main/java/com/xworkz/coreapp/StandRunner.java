package com.xworkz.coreapp;

import com.xworkz.coreapp.beans.*;
import com.xworkz.coreapp.config.SpringConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class StandRunner {
    public static void main(String[] args) {


        int[] hello={10,20,30,40,50,60};
        int n=hello.length;
        int j=n-1;
        int[] reversed=new int[n];



        for(int i=0;i<n;i++){

            reversed[i]=hello[j];
            j--;
        }

            System.out.println(reversed[])





//        ApplicationContext applicationContext=new AnnotationConfigApplicationContext(SpringConfiguration.class);
//
//
//        Stand stand=applicationContext.getBean(Stand.class);
//        stand.setId(1);
//        stand.setPrice(35.50);
//        stand.setProductName("cell");
//        System.out.println(stand);
//
//        Laptop laptop=applicationContext.getBean(Laptop.class);
//        laptop.setId(1);
//        laptop.setName("asus");
//        System.out.println(laptop);
//
//        Laptop laptop1=applicationContext.getBean(Laptop.class);
//        laptop1.setName("dfghjk");
//        laptop1.setId(2);
//
//        Fan fan=applicationContext.getBean(Fan.class);
//        fan.setId(1);
//        fan.setPrice(5620);
//        fan.setBrand("usha");
//
//        Projecter projecter=applicationContext.getBean(Projecter.class);
//        projecter.setId(2);
//        projecter.setName("lenovo");
//        projecter.setPrice(48568);
//
//        Mobile mobile=applicationContext.getBean(Mobile.class);
//        mobile.setId(2);
//        mobile.setName("iqoo");
//        mobile.setPrice(27000);
//
//        System.out.println(projecter);
//        System.out.println(mobile);
//        System.out.println(fan);
//        System.out.println(laptop1);

    }
}
