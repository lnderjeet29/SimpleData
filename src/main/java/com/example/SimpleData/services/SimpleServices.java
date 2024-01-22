package com.example.SimpleData.services;

import com.example.SimpleData.Entity.SimpleData;

import java.util.List;

public interface SimpleServices {
    List<SimpleData> getAllData();
    SimpleData getDataByName();
}
