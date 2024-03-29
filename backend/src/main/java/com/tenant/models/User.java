package com.tenant.models;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.UUID;

import org.apache.poi.hssf.record.formula.functions.True;

import javax.persistence.GeneratedValue;
import java.util.Date;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name="name",  nullable= false )
    private String name;

    @Column(name="email",  nullable=false)
    private String email;

    @Column(name="address",  nullable=false)
    private String address;

    @Column(name="joined", nullable=false)
    private LocalDate joined;

    @Column(nullable=false)
    private String telephone;

    @Column( nullable=false)
    private ROLES role;

    @Column( nullable=false)
    private String password;

    public User(String name, String email, String address, LocalDate joined, String telephone, ROLES role, String password) {
        this.name = name;
        this.email = email;
        this.address = address;
        this.joined = joined;
        this.telephone = telephone;
        this.role = role;
        this.password = password;
    }

    public User() {

    }

    public int getId() {
        return id;
    }

    public String getNames() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    public LocalDate getJoined() {
        return joined;
    }

    public String getTelephone() {
        return telephone;
    }

    public ROLES getRole() {
        return role;
    }

    public String getPassword() {
        return password;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setJoined(LocalDate joined) {
        this.joined = joined;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public void setRole(ROLES role) {
        this.role = role;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    public enum ROLES{
        USER,
        ADMIN
    }
}
