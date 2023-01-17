package com.tenant;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {

            System.out.println("Hello world!");
            Configuration config=new Configuration();
            config.configure("hibernate.cfg.xml");
            try{
                @SuppressWarnings("deperecation")
                SessionFactory factory = config.buildSessionFactory();
                Session session = factory.openSession();
                Transaction transaction = session.beginTransaction();

                transaction.commit();
                session.close();
                factory.close();
            }
            catch (Exception e){
                System.out.println(e.getMessage());
            }
    }
}