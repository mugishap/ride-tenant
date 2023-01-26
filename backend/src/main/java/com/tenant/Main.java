package com.tenant;


import com.tenant.models.Car;
import com.tenant.models.Request;
import com.tenant.models.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.time.LocalDate;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        User user1 = new User("Mugisha Precieux", "precieuxmugisha@gmail.com", "KK 105 St", "2345673842543", "+250782307144", User.ROLES.ADMIN, "password");
        User user2 = new User("Ishimwe Sugira Yvan", "phoenixnavyn@gmail.com", "KK 105 St", "2345673842543", "+250782307144", User.ROLES.ADMIN, "password");
        User user3 = new User("Gisingizo Gloria", "gisingizo012@gmail.com", "KK 105 St", "2345673842543", "+250782307144", User.ROLES.ADMIN, "password");
        User user4 = new User("Dukundane Furaha Yves Derrick", "yvesdericks@gmail.com", "KK 105 St", "2345673842543", "+250782307144", User.ROLES.ADMIN, "password");
        User user5 = new User("Kalisa Ineza Giovanni", "kalisathecoder@gmail.com", "KK 105 St", "2345673842543", "+250782307144", User.ROLES.ADMIN, "password");

        Car car1 = new Car("Lamborghini Aventador", 500, "USD", false);
        Car car2 = new Car("Toyota Carina", 500, "USD", false);
        Car car3 = new Car("Mercedes EQS", 500, "USD", false);
        Car car4 = new Car("TOYOTA V8", 500, "USD", false);
        Car car5 = new Car("Avensis 600", 500, "USD", false);

        Request request1 = new Request(user1, car1, LocalDate.of(2023, 1, 30), LocalDate.of(2023, 3, 30), LocalDate.now(), Request.STATUS.PENDING);
        Request request2 = new Request(user2, car2, LocalDate.of(2023, 1, 31), LocalDate.of(2023, 3, 31), LocalDate.now(), Request.STATUS.PENDING);
        Request request3 = new Request(user3, car3, LocalDate.of(2023, 2, 1), LocalDate.of(2023, 4, 2), LocalDate.now(), Request.STATUS.PENDING);
        Request request4 = new Request(user4, car4, LocalDate.of(2023, 3, 3), LocalDate.of(2023, 4, 3), LocalDate.now(), Request.STATUS.PENDING);
        Request request5 = new Request(user5, car5, LocalDate.of(2023, 2, 2), LocalDate.of(2023, 4, 3), LocalDate.now(), Request.STATUS.PENDING);


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

            session.saveOrUpdate(car1);
            session.saveOrUpdate(car2);
            session.saveOrUpdate(car3);
            session.saveOrUpdate(car4);
            session.saveOrUpdate(car5);

            session.saveOrUpdate(request1);
            session.saveOrUpdate(request2);
            session.saveOrUpdate(request3);
            session.saveOrUpdate(request4);
            session.saveOrUpdate(request5);

            session.getTransaction().commit();
            session.close();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage());

        }
    }
}