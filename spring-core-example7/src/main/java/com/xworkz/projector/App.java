package com.xworkz.projector;

import com.xworkz.projector.dto.ProjectorDto;

/**
 * Hello world!
 *
 */
public class App 
{
    private static ProjectorDto projectorDto=new ProjectorDto();
    public static void main( String[] args )
    {

        projectorDto.setId(10);
        projectorDto.setBrand("gdfsd");
        projectorDto.setPrice(6512);

        projectorDto.setId(150);
        projectorDto.setPrice(512);
        projectorDto.setBrand("gfds");
        System.out.println(projectorDto);
        System.out.println(projectorDto);


    }
}
