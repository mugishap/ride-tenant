package com.tenant.models;

import org.springframework.context.annotation.Configuration;

import javax.persistence.*;
import java.util.UUID;

@Entity
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private String name;

    @Column
    private int price;

    @Column
    private String currency;

    @Column
    private boolean isBooked;

    public Car(String name, int price, String currency, boolean isBooked) {
        this.name = name;
        this.price = price;
        this.currency = currency;
        this.isBooked = isBooked;
    }

    public Car() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public boolean isBooked() {
        return isBooked;
    }

    public void setBooked(boolean booked) {
        isBooked = booked;
    }
}


