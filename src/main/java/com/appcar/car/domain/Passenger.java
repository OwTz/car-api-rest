package com.appcar.car.domain;


import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Data
public class Passenger {

    @Id
    @GeneratedValue
    Long id;

    String name;


}
