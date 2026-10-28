package com.example.flightanalysis.service;


import com.example.flightanalysis.model.Flight;
import com.example.flightanalysis.repository.FlightRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class FlightService {


    @Autowired
    private FlightRepository repository;



    // Add Flight

    public Flight addFlight(Flight flight){

        return repository.save(flight);

    }



    // View All Flights

    public List<Flight> getAllFlights(){

        return repository.findAll();

    }



    // View Flight By ID

    public Flight getFlightById(int id){

        return repository.findById(id).orElse(null);

    }



    // Update Flight

    public Flight updateFlight(Flight flight){

        return repository.save(flight);

    }



    // Delete Flight

    public void deleteFlight(int id){

        repository.deleteById(id);

    }

}