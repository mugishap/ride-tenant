package com.tenant.dao;

import com.tenant.models.Car;

import java.util.List;
import java.util.UUID;

public interface CarDAO {

    public void save(Car car);
    public Car findById(int id);
    public void update(Car car);
    public void delete(Car car);
    public List<Car> getCars();

}
