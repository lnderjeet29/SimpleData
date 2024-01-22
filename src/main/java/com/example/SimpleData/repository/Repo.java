package com.example.SimpleData.repository;

import com.example.SimpleData.Entity.SimpleData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Repo extends JpaRepository<SimpleData,Integer> {
}
