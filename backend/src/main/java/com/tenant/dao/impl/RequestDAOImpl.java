package com.tenant.dao.impl;

import com.tenant.dao.RequestDAO;
import com.tenant.models.Order;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.UUID;

public class RequestDAOImpl implements RequestDAO {

    private SessionFactory sessionFactory;

    public RequestDAOImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public void save(Order order) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(order);
        transaction.commit();
        session.close();
    }

    public Order findById(UUID id) {
        Session session = sessionFactory.openSession();
        Order order = (Order) session.get(Order.class, id);
        session.close();
        return order;
    }

    public String grantRequest(UUID id) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        Order order = (Order) session.get(Order.class, id);
        order.setStatus(Order.STATUS.GRANTED);
        session.update(order);
        transaction.commit();
        session.close();
        return "Request Granted";
    }

    public String declineRequest(UUID id){
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        Order order = (Order) session.get(Order.class, id);
        order.setStatus(Order.STATUS.DECLINED);
        session.update(order);
        transaction.commit();
        session.close();
        return "Request Denied";
    }

}
