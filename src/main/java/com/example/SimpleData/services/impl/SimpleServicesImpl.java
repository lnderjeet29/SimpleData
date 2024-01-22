package com.example.SimpleData.services.impl;

import com.example.SimpleData.Entity.SimpleData;
import com.example.SimpleData.repository.Repo;
import com.example.SimpleData.services.SimpleServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SimpleServicesImpl implements SimpleServices {

    @Autowired
    private Repo repository;
    @Override
    public List<SimpleData> getAllData() {
        return repository.findAll();
    }

    @Override
    public SimpleData getDataByName() {
        return null;
    }
}
