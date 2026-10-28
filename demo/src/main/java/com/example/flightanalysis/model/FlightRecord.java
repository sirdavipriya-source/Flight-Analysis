package com.example.flightanalysis.model;

import jakarta.persistence.*;

@Entity
@Table(name="flightrecord")
public class FlightRecord {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;


    private int flightId;

    private String passengerName;

    private String seatNo;

    private String travelDate;



    public FlightRecord(){}



    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id=id;
    }


    public int getFlightId() {
        return flightId;
    }


    public void setFlightId(int flightId) {
        this.flightId=flightId;
    }


    public String getPassengerName() {
        return passengerName;
    }


    public void setPassengerName(String passengerName) {
        this.passengerName=passengerName;
    }


    public String getSeatNo() {
        return seatNo;
    }


    public void setSeatNo(String seatNo) {
        this.seatNo=seatNo;
    }


    public String getTravelDate() {
        return travelDate;
    }


    public void setTravelDate(String travelDate) {
        this.travelDate=travelDate;
    }

}