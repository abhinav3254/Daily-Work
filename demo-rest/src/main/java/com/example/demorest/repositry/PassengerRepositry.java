package com.example.demorest.repositry;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demorest.entity.Passengers;

public interface PassengerRepositry extends JpaRepository<Passengers,Integer>{

}
