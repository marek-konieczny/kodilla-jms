package com.example.kodillajms.domain;


import org.springframework.stereotype.Component;

import java.io.Serializable;

public class Order implements Serializable {

    private long id;
    private PhoneCategory phoneCategory;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public PhoneCategory getPhoneCategory() {
        return phoneCategory;
    }

    public void setPhoneCategory(PhoneCategory phoneCategory) {
        this.phoneCategory = phoneCategory;
    }

    public Order(long id, PhoneCategory phoneCategory) {
        this.id = id;
        this.phoneCategory = phoneCategory;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", phoneCategory=" + phoneCategory +
                '}';
    }
}
