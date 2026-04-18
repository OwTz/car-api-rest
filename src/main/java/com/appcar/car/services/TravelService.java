package com.appcar.car.services;

import com.appcar.car.domain.TravelRequest;
import com.appcar.car.domain.TravelRequestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TravelService {

    @Autowired
    TravelRequestRepository travelRequestRepository;

    public TravelRequest saveTravelRequest(TravelRequest travelRequest) {
        return travelRequestRepository.save(travelRequest);
    }

}
