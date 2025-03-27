package com.example.social_network.repository;

import com.example.social_network.entities.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
@Transactional
public class UserRepositoryDAO implements UserRepository{

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<User> findAll() {
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("FROM Accounts", User.class).getResultList();
    }

    @Override
    public User findById(int id) {
        Session session = sessionFactory.getCurrentSession();
        return session.get(User.class, id);
    }

    @Override
    public void save(User user) {
        Session session = sessionFactory.getCurrentSession();
        session.save(user);
    }

    public void update(User user) {
        Session session = sessionFactory.getCurrentSession();
        session.update(user);
    }

    @Override
    public void deleteById(int id) {
        Session session = sessionFactory.getCurrentSession();
        User user = session.get(User.class, id);
        if (user != null) {
            session.delete(user);
        }
    }
}
