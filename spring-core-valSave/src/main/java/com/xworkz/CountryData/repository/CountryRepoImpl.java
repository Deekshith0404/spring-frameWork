package com.xworkz.CountryData.repository;

import com.xworkz.CountryData.entity.CountryEntity;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
@Component
public class CountryRepoImpl implements CountryRepo{
    @Override
    public boolean save(CountryEntity countryEntity) {

        EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("mypersist");
        EntityManager entityManager=entityManagerFactory.createEntityManager();
        try {
            if (countryEntity!=null) {
                entityManager.getTransaction().begin();
                entityManager.persist(countryEntity);
                entityManager.getTransaction().commit();
                entityManager.close();
                return true;
            }
            return false;
        } catch (Exception e) {
            System.out.println(e.getMessage());
           return false;
        }
    }
}
