package com.tenant.dao;

import com.tenant.models.Car;
import com.tenant.models.Request;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.List;
import java.util.UUID;

public class RequestDAO {

    private SessionFactory sessionFactory;

    public RequestDAO(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public void save(Request request) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(request);
        transaction.commit();
        session.close();
    }

    public Request findById(UUID id) {
        Session session = sessionFactory.openSession();
        Request request = (Request) session.get(Request.class, id);
        session.close();
        return request;
    }

    public String grantRequest(UUID id) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        Request request = (Request) session.get(Request.class, id);
        request.setStatus(Request.STATUS.GRANTED);
        session.update(request);
        transaction.commit();
        session.close();
        return "Request Granted";
    }

    public String declineRequest(UUID id){
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        Request request = (Request) session.get(Request.class, id);
        request.setStatus(Request.STATUS.DECLINED);
        session.update(request);
        transaction.commit();
        session.close();
        return "Request Denied";
    }

}
