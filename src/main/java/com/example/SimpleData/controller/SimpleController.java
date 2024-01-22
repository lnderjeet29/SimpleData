package com.example.SimpleData.controller;

import com.example.SimpleData.Entity.SimpleData;
import com.example.SimpleData.services.SimpleServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/data")
public class SimpleController {
    @Autowired
    SimpleServices simpleServices;

    @GetMapping("/getAll")
    public ResponseEntity<List<SimpleData>> getAllData(){
        return new ResponseEntity<>(simpleServices.getAllData(), HttpStatus.OK);
    }
}
