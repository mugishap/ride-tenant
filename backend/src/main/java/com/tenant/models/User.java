package com.tenant.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {

    @Id
    private int id;

    @Column()
    private String names;

    @Column()
    private String email;

    @Column()
    private String address;

    @Column()
    private String joined;

    @Column()
    private String telephone;

    @Column()
    private ROLES role;

    @Column()
    private String password;

    public User(String names, String email, String address, String joined, String telephone, ROLES role, String password) {
        this.names = names;
        this.email = email;
        this.address = address;
        this.joined = joined;
        this.telephone = telephone;
        this.role = role;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public String getNames() {
        return names;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    public String getJoined() {
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

    public void setNames(String names) {
        this.names = names;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setJoined(String joined) {
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
