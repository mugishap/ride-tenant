package com.tenant.dao;

import com.tenant.models.Order;

import java.util.UUID;

public interface RequestDAO {

    public void save(Order order);

    public Order findById(UUID id);

    public String grantRequest(UUID id);

    public String declineRequest(UUID id);

}