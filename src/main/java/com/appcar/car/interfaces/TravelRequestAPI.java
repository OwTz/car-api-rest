package com.appcar.car.interfaces;


import com.appcar.car.domain.TravelRequest;
import com.appcar.car.domain.TravelRequestInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Service
@RequestMapping(value = "/travelRequests", produces = MediaType.APPLICATION_JSON_VALUE)
public class TravelRequestAPI {

    @Autowired
    TravelRequestInterface repository;

    @PostMapping
    public void makeTravelRequest (@RequestBody TravelRequest travelRequest) {

    }
}
