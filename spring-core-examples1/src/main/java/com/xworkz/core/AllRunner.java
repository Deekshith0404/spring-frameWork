package com.xworkz.core;

import com.xworkz.core.beans.*;
import com.xworkz.core.config.SpringConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AllRunner {
    public static void main(String[] args) {
        ApplicationContext applicationContext=new AnnotationConfigApplicationContext(SpringConfiguration.class);
        Laptop laptop=applicationContext.getBean(Laptop.class);
        System.out.println(laptop);
//
//        Watch wat=applicationContext.getBean(Watch.class);
//        wat.setId(2);
//        wat.setPrice(2500);
//        wat.setBrand("fire bolt");
//        wat.setModel("1.54");
//        System.out.println(wat);
//
//
//        Mobile mobile=applicationContext.getBean(Mobile.class);
//        mobile.setId(3);
//        mobile.setPrice(27000);
//        mobile.setModel("neo 7");
//        mobile.setBrandName("iqoo");
//        System.out.println(mobile);
//
//        Charger charger=applicationContext.getBean(Charger.class);
//        charger.setId(6);
//        charger.setPrice(2500);
//        charger.setWatt("25 watt");
//        charger.setBrand("vivo");
//
//
//        Locker locker=applicationContext.getBean(Locker.class);
//        locker.setBrand("tata");
//        locker.setPrice(120);
//        locker.setStrength("25ps");
//        System.out.println(locker);
//
//        TrafficPolice trafficPolice=applicationContext.getBean(TrafficPolice.class);
//        trafficPolice.setLocation("rajaji nagar ");
//        trafficPolice.setPost("bangalore");
//        trafficPolice.setPincode(014512);
//        System.out.println(trafficPolice);
//
//
//        Human human=applicationContext.getBean(Human.class);
//            human.setGender("male");
//            human.setName("ranjan");
//            human.setHeightInCm(166);
//        System.out.println(human);
//
//
//        Specs specs=applicationContext.getBean(Specs.class);
//        specs.setBrand("lenskart");
//        specs.setId(8);
//        specs.setPower(1.8);
//        System.out.println(specs);
//
//
//        Tire tire=applicationContext.getBean(Tire.class);
//        tire.setSize(40.5);
//        tire.setBrand("tata");
//        tire.setSpikeSize(4);
//        System.out.println(tire);
//
//
//        Shoe shoe=applicationContext.getBean(Shoe.class);
//        shoe.setSize(10.5);
//        shoe.setBrand("Nike");
//        shoe.setPrice(2500);
//        System.out.println(shoe);
//
//        Car car=applicationContext.getBean(Car.class);
//        car.setId(9);
//        car.setBrand("tata");
//        car.setPrice(1000000);
//        car.setModel("b-6");
//        System.out.println(car);
//
//
//        Cloths cloths=applicationContext.getBean(Cloths.class);
//        cloths.setId(9);
//        cloths.setBrand("zara");
//        cloths.setSize(25);
//        cloths.setPrice(2500);
//        System.out.println(cloths);
//
//        Fan fan=applicationContext.getBean(Fan.class);
//        fan.setId(2);
//        fan.setSpeed(5);
//        fan.setCompany("usha");
//        System.out.println(fan);
//
//        Light light=applicationContext.getBean(Light.class);
//        light.setId(2);
//        light.setBrand("cello");
//        light.setPrice(180);
//        System.out.println(light);
//
//        Projecter projecter=applicationContext.getBean(Projecter.class);
//        projecter.setBrand("aser");
//        projecter.setId(11);
//        projecter.setPrice(25000);
//        System.out.println(projecter);
//
//            Chair chair=applicationContext.getBean(Chair.class);
//            chair.setCompany("usha");
//            chair.setId(11);
//            chair.setQuantity(95);
//        System.out.println(chair);
//
//        Cabel cabel=applicationContext.getBean(Cabel.class);
//        cabel.setId(16);
//        cabel.setCompany("storm");
//        cabel.setLength(158);
//        System.out.println(cabel);
//
//      WaterTank waterTank=  applicationContext.getBean(WaterTank.class);
//        waterTank.setId(18);
//        waterTank.setBrand("cather");
//        waterTank.setCapacityInLeters(1000);
//        System.out.println(waterTank);
//
//        Camera camera=applicationContext.getBean(Camera.class);
//        camera.setId(5);
//        camera.setCompany("sony");
//        camera.setModel("a25");
//        camera.setPrice(150000);
//        System.out.println(camera);
//
//        Lens lens=applicationContext.getBean(Lens.class);
//        lens.setId(18);
//        lens.setCompany("sony");
//        lens.setPrice(28962);
//        System.out.println(lens);
//
//        FishTank fishTank=applicationContext.getBean(FishTank.class);
//        fishTank.setId(5);
//        fishTank.setNumOfFish(25);
//        fishTank.setSpecies("fighter");
//        System.out.println(fishTank);
//
//        Iron iron=applicationContext.getBean(Iron.class);
//        iron.setId(22);
//        iron.setStrength(25);
//        iron.setWeight("485466kg");
//        System.out.println(iron);
//
//        SwitchBoard switchBoard=applicationContext.getBean(SwitchBoard.class);
//        switchBoard.setBrand("tata");
//        switchBoard.setId(23);
//        switchBoard.setQuantity("25pices");
//        System.out.println(switchBoard);
//
//        Pipe pipe=applicationContext.getBean(Pipe.class);
//        pipe.setId(24);
//        pipe.setCompany("pvc pipe");
//        pipe.setLength(56);
//        System.out.println(pipe);
//
//        Ups ups=applicationContext.getBean(Ups.class);
//
//        ups.setId(25);
//        ups.setCompany("amaze");
//        ups.setWats(250);
//        System.out.println(ups);
    }
}
