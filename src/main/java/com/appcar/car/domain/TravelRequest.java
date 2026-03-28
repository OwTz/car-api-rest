package com.appcar.car.domain;


import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Data
@Entity
public class TravelRequest {

    Long id;


    @ManyToOne
    Passenger passenger;
    String origin, destination;


}
