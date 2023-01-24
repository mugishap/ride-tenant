package com.tenant;


import com.tenant.models.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {

        User user1 = new User("Mugisha Precieux", "precieuxmugisha@gmail.com", "KK 105 St", "2345673842543", "+250782307144", User.ROLES.ADMIN, "password");
        User user2 = new User("Ishimwe Sugira Yvan", "phoenixnavyn@gmail.com", "KK 105 St", "2345673842543", "+250782307144", User.ROLES.ADMIN, "password");
        User user3 = new User("Gisingizo Gloria", "gisingizo012@gmail.com", "KK 105 St", "2345673842543", "+250782307144", User.ROLES.ADMIN, "password");
        User user4 = new User("Dukundane Furaha Yves Derrick", "yvesdericks@gmail.com", "KK 105 St", "2345673842543", "+250782307144", User.ROLES.ADMIN, "password");
        User user5 = new User("Kalisa Ineza Giovanni", "kalisathecoder@gmail.com", "KK 105 St", "2345673842543", "+250782307144", User.ROLES.ADMIN, "password");

        Configuration config = new Configuration();
        config.configure("hibernate.cfg.xml");

        try {
            @SuppressWarnings("deperecation")
            SessionFactory factory = config.buildSessionFactory();
            Session session = factory.openSession();
            session.beginTransaction();

            session.saveOrUpdate(user1);
            session.saveOrUpdate(user2);
            session.saveOrUpdate(user3);
            session.saveOrUpdate(user4);
            session.saveOrUpdate(user5);

            session.getTransaction().commit();
            session.close();
        } catch (Exception e) {
            System.out.println(e.getStackTrace());
            System.out.println(e.getMessage());

        }

    }
}