package com.xworkz.dInjection;

import com.xworkz.dInjection.config.SpringConfig;
import com.xworkz.dInjection.*;
import com.xworkz.dInjection.county.Country;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.naming.ldap.Control;
import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext applicationContext=new AnnotationConfigApplicationContext(SpringConfig.class);
//        Country country=applicationContext.getBean("oldcountry",Country.class);
//        System.out.println(country);
//
//        com.xworkz.dInjection.politician.Country country1=applicationContext.getBean(com.xworkz.dInjection.politician.Country.class);
//        System.out.println(country1);


//        Hotel hotel=applicationContext.getBean(Hotel.class);
//        System.out.println(hotel);

        List<Integer> list=applicationContext.getBean("list",ArrayList.class);
        list.add(100);
        System.out.println(list);

        Integer integer=applicationContext.getBean(Integer.class);
        System.out.println(integer);

        Byte byt=applicationContext.getBean(Byte.class);
        System.out.println(byt);

        Short shot=applicationContext.getBean(Short.class);
        System.out.println(shot);

        Long lon=applicationContext.getBean(Long.class);
        System.out.println(lon);


        Boolean bool=applicationContext.getBean(Boolean.class);
        System.out.println(bool);

        Float flt=applicationContext.getBean(Float.class);
        System.out.println(flt);

        Double dbl=applicationContext.getBean(Double.class);
        System.out.println(dbl);

        char ch=applicationContext.getBean(char.class);
        System.out.println(ch);

        List<Country> list1=applicationContext.getBean("getCountryList",List.class);
        System.out.println(list1);
    }
}
