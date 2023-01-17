package com.tenant.models;

import org.springframework.context.annotation.Configuration;

import javax.persistence.*;
import java.util.Date;
import java.util.UUID;

@Entity
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.ID)
    private UUID id;

    @Column
    private String plateNumber;

    @Column
    private String owner;

    @Column
    private String borrower;

    @Column
    private bool isBooked;

    @Column
    private String brand;

    @Column
    private String description;

    @Column
    private String imgUrl;

    @Column
    private Date added = new Date();
    @Column
    private String price;

    @Column
    private String Currency;
}