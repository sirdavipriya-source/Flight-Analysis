package com.example.flightanalysis.repository;


import com.example.flightanalysis.model.Flight;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface FlightRepository extends JpaRepository<Flight,Integer>{

}