package com.tenant.controllers;


import com.tenant.dao.UserDAO;

public class UserController {
    private UserDAO userDAO;

    public UserController(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    public void createUser() {
    }
}