package com.example.demorest.repositry;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demorest.entity.Train;

public interface TrainRepositry extends JpaRepository<Train, Integer> {}