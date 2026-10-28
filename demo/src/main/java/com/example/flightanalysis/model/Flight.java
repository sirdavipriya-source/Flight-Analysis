package com.example.flightanalysis.model;

import jakarta.persistence.*;

@Entity
@Table(name="flight")
public class Flight {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;


    private String flightName;

    private String source;

    private String destination;

    private double price;



    public Flight(){}



    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }


    public String getFlightName() {
        return flightName;
    }


    public void setFlightName(String flightName) {
        this.flightName = flightName;
    }


    public String getSource() {
        return source;
    }


    public void setSource(String source) {
        this.source = source;
    }


    public String getDestination() {
        return destination;
    }


    public void setDestination(String destination) {
        this.destination = destination;
    }


    public double getPrice() {
        return price;
    }


    public void setPrice(double price) {
        this.price = price;
    }

}