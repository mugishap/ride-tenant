package com.tenant.dao;

import com.tenant.models.Request;

import java.util.UUID;

public interface RequestDAO {

    public void save(Request request);

    public Request findById(UUID id);

    public String grantRequest(UUID id);

    public String declineRequest(UUID id);

}