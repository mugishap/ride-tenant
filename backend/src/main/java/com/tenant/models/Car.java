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
    @
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

    public String getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getBorrower() {
        return borrower;
    }

    public void setBorrower(String borrower) {
        this.borrower = borrower;
    }

    public bool getIsBooked() {
        return isBooked;
    }

    public void setIsBooked(bool isBooked) {
        this.isBooked = isBooked;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
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
        return Currency;
    }

    public void setCurrency(String currency) {
        Currency = currency;
    }
}