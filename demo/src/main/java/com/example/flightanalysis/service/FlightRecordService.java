package com.example.flightanalysis.service;


import com.example.flightanalysis.model.FlightRecord;
import com.example.flightanalysis.repository.FlightRecordRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class FlightRecordService {


    @Autowired
    private FlightRecordRepository repository;



    // Add Record

    public FlightRecord addRecord(FlightRecord record){

        return repository.save(record);

    }



    // View All Records

    public List<FlightRecord> getAllRecords(){

        return repository.findAll();

    }



    // View Record By ID

    public FlightRecord getRecordById(int id){

        return repository.findById(id).orElse(null);

    }



    // Update Record

    public FlightRecord updateRecord(FlightRecord record){

        return repository.save(record);

    }



    // Delete Record

    public void deleteRecord(int id){

        repository.deleteById(id);

    }

}