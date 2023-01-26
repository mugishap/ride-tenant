package com.tenant.models;

import org.springframework.context.annotation.Configuration;

import javax.persistence.*;
import java.util.Date;
import java.util.UUID;

@Entity
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID id;

    @Column(nullable = false)
    private String plateNumber;

    @Column(nullable=false)
    private String owner;

    @Column(nullable=false)
    private String borrower;

    @Column(nullable=false)
    private Boolean isBooked;

    @JoinColumn
    @ManyToOne(cascade = CascadeType.ALL)
    private String brand;

    @Column(nullable=false)
    private String description;

    @Column(nullable=false)
    private String imgUrl;

    @Column(nullable=false)
    private Date added = new Date();
    @Column(nullable=false)
    private String price;

    @JoinColumn
    @OneToOne(cascade = CascadeType.ALL)
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

    public Boolean getIsBooked() {
        return isBooked;
    }

    public void setIsBooked(Boolean isBooked) {
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