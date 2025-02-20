package com.xworkz.busInfo.repository;

import com.xworkz.busInfo.entity.WatchEntity;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
@Component
public class WatchRepoImpl implements WatchRepo{
    @Override
    public boolean save(WatchEntity watch) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("mypersist");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        try {
            if (watch != null) {
                entityManager.getTransaction().begin();
                entityManager.persist(watch);
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
