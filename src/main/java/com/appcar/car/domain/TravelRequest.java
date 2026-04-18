package com.appcar.car.domain;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Data
@Entity
public class TravelRequest {

    @Id
    @GeneratedValue
    Long id;


    @ManyToOne
    Passenger passenger;
    String origin, destination;


}
