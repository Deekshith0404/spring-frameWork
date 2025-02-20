package com.xworkz.busInfo;

import com.xworkz.busInfo.config.SpringConfig;
import com.xworkz.busInfo.dto.WatchDto;
import com.xworkz.busInfo.service.WatchServ;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext applicationContext=new AnnotationConfigApplicationContext(SpringConfig.class);
        WatchServ watchServ=applicationContext.getBean(WatchServ.class);
        WatchDto watchDto=new WatchDto();
        watchDto.setBrand("Firebolt");
        watchDto.setModel("special edition");
        watchDto.setPrice(1790);
        watchServ.save(watchDto);
    }
}
