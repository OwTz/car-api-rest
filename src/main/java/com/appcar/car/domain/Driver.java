package com.appcar.car.domain;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

import java.util.Date;


@Entity
@Data
public class Driver {


    @Id
    @GeneratedValue
    Long id;

    String name;

    Date birthDate;
}
