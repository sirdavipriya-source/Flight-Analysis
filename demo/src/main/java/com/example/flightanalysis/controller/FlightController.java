package com.example.flightanalysis.controller;

import com.example.flightanalysis.model.Flight;
import com.example.flightanalysis.service.FlightService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/flights")
@CrossOrigin("*")
public class FlightController {

    @Autowired
    private FlightService service;


    // Add Flight
    @PostMapping
    public Flight addFlight(@RequestBody Flight flight){

        return service.addFlight(flight);

    }


    // View All Flights
    @GetMapping
    public List<Flight> getAllFlights(){

        return service.getAllFlights();

    }


    // View Flight By ID
    @GetMapping("/{id}")
    public Flight getFlight(@PathVariable int id){

        return service.getFlightById(id);

    }


    // Update Flight
    @PutMapping
    public Flight updateFlight(@RequestBody Flight flight){

        return service.updateFlight(flight);

    }


    // Delete Flight
    @DeleteMapping("/{id}")
    public String deleteFlight(@PathVariable int id){

        service.deleteFlight(id);

        return "Flight Deleted Successfully";

    }

}