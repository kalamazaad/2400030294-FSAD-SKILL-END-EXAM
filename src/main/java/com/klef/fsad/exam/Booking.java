package com.klef.fsad.exam;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="booking_table")

public class Booking
{
    @Id
    private int id;

    private String name;
    private String date;
    private String status;
    private String location;
    private double amount;

    public Booking()
    {

    }

    public Booking(int id, String name, String date,
                   String status, String location,
                   double amount)
    {
        this.id = id;
        this.name = name;
        this.date = date;
        this.status = status;
        this.location = location;
        this.amount = amount;
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getDate()
    {
        return date;
    }

    public void setDate(String date)
    {
        this.date = date;
    }

    public String getStatus()
    {
        return status;
    }

    public void setStatus(String status)
    {
        this.status = status;
    }

    public String getLocation()
    {
        return location;
    }

    public void setLocation(String location)
    {
        this.location = location;
    }

    public double getAmount()
    {
        return amount;
    }

    public void setAmount(double amount)
    {
        this.amount = amount;
    }
}