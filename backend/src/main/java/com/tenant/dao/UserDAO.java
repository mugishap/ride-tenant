package com.tenant.dao;

import com.tenant.models.User;

import java.util.UUID;

public interface UserDAO {

    public void save(User user);

    public User findById(UUID id);

    public void update(User user);

    public void delete(User user);

}
