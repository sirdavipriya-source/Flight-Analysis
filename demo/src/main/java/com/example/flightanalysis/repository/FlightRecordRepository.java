package com.example.flightanalysis.repository;


import com.example.flightanalysis.model.FlightRecord;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface FlightRecordRepository extends JpaRepository<FlightRecord,Integer>{

}