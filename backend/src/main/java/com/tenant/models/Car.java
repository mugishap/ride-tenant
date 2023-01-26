package com.tenant.models;

import org.springframework.context.annotation.Configuration;

import javax.persistence.*;
import java.util.Date;


@Entity
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false)
    private String plateNumber;

    @Column(nullable = false)
    private Boolean isBooked;

    @ManyToOne(cascade = CascadeType.ALL)
    private Brand brandId;

    @Column(nullable = false)
    private String description;

    @Column(nullable = false)
    private String imgUrl;

    @Column(nullable = false)
    private Date added = new Date();

    @Column(nullable = false)
    private String price;

    @Column
    private String currency;

    public Car() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    public Boolean getBooked() {
        return isBooked;
    }

    public void setBooked(Boolean booked) {
        isBooked = booked;
    }

    public Brand getBrandId() {
        return brandId;
    }

    public void setBrandId(Brand brandId) {
        this.brandId = brandId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public Date getAdded() {
        return added;
    }

    public void setAdded(Date added) {
        this.added = added;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Car(String plateNumber, Boolean isBooked, Brand brandId, String description, String imgUrl, Date added, String price, String currency) {
        this.plateNumber = plateNumber;
        this.isBooked = isBooked;
        this.brandId = brandId;
        this.description = description;
        this.imgUrl = imgUrl;
        this.added = added;
        this.price = price;
        this.currency = currency;
    }
}


