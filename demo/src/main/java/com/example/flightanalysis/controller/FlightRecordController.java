package com.example.flightanalysis.controller;

import com.example.flightanalysis.model.FlightRecord;
import com.example.flightanalysis.service.FlightRecordService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/records")
@CrossOrigin("*")
public class FlightRecordController {


    @Autowired
    private FlightRecordService service;



    // Add Record
    @PostMapping
    public FlightRecord addRecord(@RequestBody FlightRecord record){

        return service.addRecord(record);

    }



    // View All Records
    @GetMapping
    public List<FlightRecord> getAllRecords(){

        return service.getAllRecords();

    }



    // View Record By ID
    @GetMapping("/{id}")
    public FlightRecord getRecord(@PathVariable int id){

        return service.getRecordById(id);

    }



    // Update Record
    @PutMapping
    public FlightRecord updateRecord(@RequestBody FlightRecord record){

        return service.updateRecord(record);

    }



    // Delete Record
    @DeleteMapping("/{id}")
    public String deleteRecord(@PathVariable int id){

        service.deleteRecord(id);

        return "Record Deleted Successfully";

    }

}