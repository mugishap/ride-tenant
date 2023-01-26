package com.tenant.models;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;
import java.util.UUID;

@Entity
public class Request {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @JoinColumn 
    @ManyToOne(cascade = CascadeType.ALL)
    private User userId;

    @JoinColumn
    @OneToOne(cascade = CascadeType.ALL)
    private Car carId;

    @Column(nullable = false)
    private LocalDate startDate;

    @Column(nullable = false)
    private LocalDate endDate;

    @Column(nullable = false)
    private LocalDate timeRequested;

    @Column(nullable = false, columnDefinition = "")
    private STATUS status;

    public Request(User userId, Car carId, LocalDate startDate, LocalDate endDate, LocalDate timeRequested, STATUS status) {
        this.userId = userId;
        this.carId = carId;
        this.startDate = startDate;
        this.endDate = endDate;
        this.timeRequested = timeRequested;
        this.status = status;
    }

    public Request() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User getUserId() {
        return userId;
    }

    public void setUserId(User userId) {
        this.userId = userId;
    }

    public Car getCarId() {
        return carId;
    }

    public void setCarId(Car carId) {
        this.carId = carId;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public LocalDate getTimeRequested() {
        return timeRequested;
    }

    public void setTimeRequested(LocalDate timeRequested) {
        this.timeRequested = timeRequested;
    }

    public STATUS getStatus() {
        return status;
    }

    public void setStatus(STATUS status) {
        this.status = status;
    }


    public enum STATUS {
        PENDING,
        DECLINED,
        GRANTED
    }


}
