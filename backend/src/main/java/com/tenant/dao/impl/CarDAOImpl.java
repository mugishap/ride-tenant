package com.tenant.dao.impl;


import com.tenant.dao.CarDAO;
import com.tenant.models.Car;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.List;
import java.util.UUID;

public class CarDAOImpl implements CarDAO {
    private SessionFactory sessionFactory;

    public CarDAOImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public void save(Car car) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(car);
        transaction.commit();
        session.close();
    }

    public Car findById(int id) {
        Session session = sessionFactory.openSession();
        Car car = (Car) session.get(Car.class, id);
        session.close();
        return car;
    }

    public void update(Car car) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.update(car);
        transaction.commit();
        session.close();
    }

    public void delete(Car car) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.delete(car);
        transaction.commit();
        session.close();
    }

    public List<Car> getCars() {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        List<Car> cars = session.createQuery("from Car").list();
        transaction.commit();
        session.close();
        return cars;
    }
}
