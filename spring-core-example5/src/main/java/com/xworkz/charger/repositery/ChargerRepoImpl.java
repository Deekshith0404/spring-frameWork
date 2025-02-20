package com.xworkz.charger.repositery;

import com.xworkz.charger.entity.CarEntity;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
@Component
public class CarRepoImpl implements CarRepo{
    @Override
    public boolean save(CarEntity carEntity) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("mypersist");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        try {
            if (carEntity != null) {
                entityManager.getTransaction().begin();
                entityManager.persist(carEntity);
                entityManager.getTransaction().commit();
                entityManager.close();
                System.out.println("data saved");
                return true;
            }
            return false;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }
}
