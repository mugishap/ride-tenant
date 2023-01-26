package com.tenant;


import com.tenant.models.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        User user1 = new User("Mugisha Precieux", "precieuxmugisha@gmail.com", "KK 105 St", LocalDate.now(), "+250782307144", User.ROLES.ADMIN, "password");
        User user2 = new User("Ishimwe Sugira Yvan", "phoenixnavyn@gmail.com", "KK 105 St", LocalDate.now(), "+250782307144", User.ROLES.ADMIN, "password");
        User user3 = new User("Gisingizo Gloria", "gisingizo012@gmail.com", "KK 105 St", LocalDate.now(), "+250782307144", User.ROLES.ADMIN, "password");
        User user4 = new User("Dukundane Furaha Yves Derrick", "yvesdericks@gmail.com", "KK 105 St", LocalDate.now(), "+250782307144", User.ROLES.ADMIN, "password");
        User user5 = new User("Kalisa Ineza Giovanni", "kalisathecoder@gmail.com", "KK 105 St", LocalDate.now(), "+250782307144", User.ROLES.ADMIN, "password");

        List<User> users = new ArrayList<>();
        Collections.addAll(users, user1, user2, user3, user4, user5);

        Brand brand1 = new Brand("Toyota", "Japan");
        Brand brand2 = new Brand("BMW", "Germany");
        Brand brand3 = new Brand("Mercedes", "Germany");
        Brand brand4 = new Brand("Audi", "Germany");
        Brand brand5 = new Brand("Honda", "Japan");
        Brand brand6 = new Brand("Mazda", "Japan");
        Brand brand7 = new Brand("Nissan", "Japan");
        Brand brand8 = new Brand("KIA", "South Korea");
        Brand brand9 = new Brand("Hyundai", "South Korea");
        Brand brand10 = new Brand("Suzuki", "Japan");

        List<Brand> brands = new ArrayList<>();
        Collections.addAll(brands, brand1, brand2, brand3, brand4, brand5, brand6, brand7, brand8, brand9, brand10);

        Car car1 = new Car("RAB 442 P", false, brand1, "Toyota Corolla 2019", "https://www.toyota.com/images/tfsi/vehicle-images/2019/Corolla/LE/Exterior/2019-Corolla-LE-Exterior-1.jpg", new Date(), "100", "USD");
        Car car2 = new Car("RAB 443P", false, brand2, "Toyota Corolla 2019", "https://www.toyota.com/images/tfsi/vehicle-images/2019/Corolla/LE/Exterior/2019-Corolla-LE-Exterior-1.jpg", new Date(), "100", "USD");
        Car car3 = new Car("RAB 444P", false, brand3, "Toyota Corolla 2019", "https://www.toyota.com/images/tfsi/vehicle-images/2019/Corolla/LE/Exterior/2019-Corolla-LE-Exterior-1.jpg", new Date(), "100", "USD");
        Car car4 = new Car("RAB 445P", false, brand4, "Toyota Corolla 2019", "https://www.toyota.com/images/tfsi/vehicle-images/2019/Corolla/LE/Exterior/2019-Corolla-LE-Exterior-1.jpg", new Date(), "100", "USD");
        Car car5 = new Car("RAB 446P", false, brand5, "Toyota Corolla 2019", "https://www.toyota.com/images/tfsi/vehicle-images/2019/Corolla/LE/Exterior/2019-Corolla-LE-Exterior-1.jpg", new Date(), "100", "USD");
        Car car6 = new Car("RAB 447P", false, brand6, "Toyota Corolla 2019", "https://www.toyota.com/images/tfsi/vehicle-images/2019/Corolla/LE/Exterior/2019-Corolla-LE-Exterior-1.jpg", new Date(), "100", "USD");
        Car car7 = new Car("RAB 448P", false, brand7, "Toyota Corolla 2019", "https://www.toyota.com/images/tfsi/vehicle-images/2019/Corolla/LE/Exterior/2019-Corolla-LE-Exterior-1.jpg", new Date(), "100", "USD");
        Car car8 = new Car("RAB 449P", false, brand8, "Toyota Corolla 2019", "https://www.toyota.com/images/tfsi/vehicle-images/2019/Corolla/LE/Exterior/2019-Corolla-LE-Exterior-1.jpg", new Date(), "100", "USD");
        Car car9 = new Car("RAB 450P", false, brand9, "Toyota Corolla 2019", "https://www.toyota.com/images/tfsi/vehicle-images/2019/Corolla/LE/Exterior/2019-Corolla-LE-Exterior-1.jpg", new Date(), "100", "USD");
        Car car10 = new Car("RAB 451P", false, brand10, "Toyota Corolla 2019", "https://www.toyota.com/images/tfsi/vehicle-images/2019/Corolla/LE/Exterior/2019-Corolla-LE-Exterior-1.jpg", new Date(), "100", "USD");
        Car car11 = new Car("RAB 452P", false, brand1, "Toyota Corolla 2019", "https://www.toyota.com/images/tfsi/vehicle-images/2019/Corolla/LE/Exterior/2019-Corolla-LE-Exterior-1.jpg", new Date(), "100", "USD");
        Car car12 = new Car("RAB 453P", false, brand2, "Toyota Corolla 2019", "https://www.toyota.com/images/tfsi/vehicle-images/2019/Corolla/LE/Exterior/2019-Corolla-LE-Exterior-1.jpg", new Date(), "100", "USD");
        Car car13 = new Car("RAB 454P", false, brand3, "Toyota Corolla 2019", "https://www.toyota.com/images/tfsi/vehicle-images/2019/Corolla/LE/Exterior/2019-Corolla-LE-Exterior-1.jpg", new Date(), "100", "USD");
        Car car14 = new Car("RAB 455P", false, brand4, "Toyota Corolla 2019", "https://www.toyota.com/images/tfsi/vehicle-images/2019/Corolla/LE/Exterior/2019-Corolla-LE-Exterior-1.jpg", new Date(), "100", "USD");
        Car car15 = new Car("RAB 456P", false, brand5, "Toyota Corolla 2019", "https://www.toyota.com/images/tfsi/vehicle-images/2019/Corolla/LE/Exterior/2019-Corolla-LE-Exterior-1.jpg", new Date(), "100", "USD");
        Car car16 = new Car("RAB 457P", false, brand6, "Toyota Corolla 2019", "https://www.toyota.com/images/tfsi/vehicle-images/2019/Corolla/LE/Exterior/2019-Corolla-LE-Exterior-1.jpg", new Date(), "100", "USD");
        Car car17 = new Car("RAB 458P", false, brand7, "Toyota Corolla 2019", "https://www.toyota.com/images/tfsi/vehicle-images/2019/Corolla/LE/Exterior/2019-Corolla-LE-Exterior-1.jpg", new Date(), "100", "USD");
        Car car18 = new Car("RAB 459P", false, brand8, "Toyota Corolla 2019", "https://www.toyota.com/images/tfsi/vehicle-images/2019/Corolla/LE/Exterior/2019-Corolla-LE-Exterior-1.jpg", new Date(), "100", "USD");
        Car car19 = new Car("RAB 460P", false, brand9, "Toyota Corolla 2019", "https://www.toyota.com/images/tfsi/vehicle-images/2019/Corolla/LE/Exterior/2019-Corolla-LE-Exterior-1.jpg", new Date(), "100", "USD");
        Car car20 = new Car("RAB 461P", false, brand10, "Toyota Corolla 2019", "https://www.toyota.com/images/tfsi/vehicle-images/2019/Corolla/LE/Exterior/2019-Corolla-LE-Exterior-1.jpg", new Date(), "100", "USD");

        List<Car> cars = new ArrayList<>();
        Collections.addAll(cars, car1, car2, car3, car4, car5, car6, car7, car8, car9, car10, car11, car12, car13, car14, car15, car16, car17, car18, car19, car20);

        Order order1 = new Order(user1, car1, LocalDate.of(2023, 1, 30), LocalDate.of(2023, 3, 30), LocalDate.now(), Order.STATUS.PENDING);
        Order order2 = new Order(user2, car2, LocalDate.of(2023, 1, 31), LocalDate.of(2023, 3, 31), LocalDate.now(), Order.STATUS.PENDING);
        Order order3 = new Order(user3, car3, LocalDate.of(2023, 2, 1), LocalDate.of(2023, 4, 2), LocalDate.now(), Order.STATUS.PENDING);
        Order order4 = new Order(user4, car4, LocalDate.of(2023, 3, 3), LocalDate.of(2023, 4, 3), LocalDate.now(), Order.STATUS.PENDING);
        Order order5 = new Order(user5, car5, LocalDate.of(2024, 2, 2), LocalDate.of(2023, 4, 3), LocalDate.now(), Order.STATUS.PENDING);
        Order order6 = new Order(user1, car6, LocalDate.of(2025, 2, 2), LocalDate.of(2023, 4, 3), LocalDate.now(), Order.STATUS.PENDING);
        Order order7 = new Order(user2, car7, LocalDate.of(2026, 2, 2), LocalDate.of(2023, 4, 3), LocalDate.now(), Order.STATUS.PENDING);
        Order order8 = new Order(user3, car8, LocalDate.of(2021, 2, 2), LocalDate.of(2023, 4, 3), LocalDate.now(), Order.STATUS.PENDING);
        Order order9 = new Order(user4, car9, LocalDate.of(2022, 2, 2), LocalDate.of(2023, 4, 3), LocalDate.now(), Order.STATUS.PENDING);
        Order order10 = new Order(user5, car10, LocalDate.of(2023, 3, 2), LocalDate.of(2023, 4, 3), LocalDate.now(), Order.STATUS.PENDING);
        Order order11 = new Order(user1, car11, LocalDate.of(2023, 4, 2), LocalDate.of(2023, 4, 3), LocalDate.now(), Order.STATUS.PENDING);
        Order order12 = new Order(user2, car12, LocalDate.of(2023, 5, 2), LocalDate.of(2023, 4, 3), LocalDate.now(), Order.STATUS.PENDING);
        Order order13 = new Order(user3, car13, LocalDate.of(2023, 6, 2), LocalDate.of(2023, 4, 3), LocalDate.now(), Order.STATUS.PENDING);
        Order order14 = new Order(user4, car14, LocalDate.of(2023, 2, 2), LocalDate.of(2023, 4, 3), LocalDate.now(), Order.STATUS.PENDING);
        Order order15 = new Order(user5, car15, LocalDate.of(2023, 2, 2), LocalDate.of(2023, 4, 3), LocalDate.now(), Order.STATUS.PENDING);

        List<Order> orderList = new ArrayList<Order>();
        Collections.addAll(orderList, order1, order2, order3, order4, order5, order6, order7, order8, order9, order10, order11, order12, order13, order14, order15);

        Payment payment1 = new Payment(2300, "USD", "PayPal", order1);
        Payment payment2 = new Payment(2400, "USD", "PayPal", order2);
        Payment payment3 = new Payment(2500, "USD", "PayPal", order3);
        Payment payment4 = new Payment(2600, "USD", "PayPal", order4);
        Payment payment5 = new Payment(2700, "USD", "PayPal", order5);
        Payment payment6 = new Payment(2800, "USD", "PayPal", order6);
        Payment payment7 = new Payment(2900, "USD", "PayPal", order7);
        Payment payment8 = new Payment(3300, "USD", "PayPal", order8);
        Payment payment9 = new Payment(4300, "USD", "PayPal", order9);
        Payment payment10 = new Payment(52300, "USD", "PayPal", order10);
        Payment payment11 = new Payment(6300, "USD", "PayPal", order11);
        Payment payment12 = new Payment(7300, "USD", "PayPal", order12);
        Payment payment13 = new Payment(8300, "USD", "PayPal", order13);
        Payment payment14 = new Payment(9300, "USD", "PayPal", order14);
        Payment payment15 = new Payment(1300, "USD", "PayPal", order15);

        List<Payment> paymentList = new ArrayList<Payment>();
        Collections.addAll(paymentList, payment1, payment2, payment3, payment4, payment5, payment6, payment7, payment8, payment9, payment10, payment11, payment12, payment13, payment14, payment15);

        Configuration config = new Configuration();
        config.configure("hibernate.cfg.xml");

        try {
            @SuppressWarnings("deperecation")
            SessionFactory factory = config.buildSessionFactory();
            Session session = factory.openSession();
            session.beginTransaction();
            users.forEach(user -> session.save(user));
            cars.forEach(car -> session.save(car));
            orderList.forEach(order -> session.save(order));
            session.getTransaction().commit();
            session.close();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage());

        }
    }
}