package com.tenant.controllers;


import com.tenant.dao.impl.UserDAOImpl;

public class UserController {
    private UserDAOImpl userDAO;

    public UserController(UserDAOImpl userDAO) {
        this.userDAO = userDAO;
    }

    public void createUser() {
    }
}