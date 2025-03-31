package com.example.social_network.repository;


import com.example.social_network.entities.User;
import jakarta.transaction.Transactional;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public class RegistrationRepository implements RegistrationDAO{

    private final SessionFactory sessionFactory;

    public RegistrationRepository(SessionFactory sessionFactory){
        this.sessionFactory = sessionFactory;
    }

    @Override
    public void save(User user) {
        Session session = sessionFactory.getCurrentSession();
        try {
            session.merge(user);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
