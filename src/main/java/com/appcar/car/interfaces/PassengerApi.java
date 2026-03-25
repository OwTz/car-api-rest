package com.appcar.car.interfaces;


import com.appcar.car.domain.PassengerRepository;
import com.appcar.car.domain.Passenger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@Service
@RestController
@RequestMapping(path = "/passagers", produces = MediaType.APPLICATION_JSON_VALUE)
public class PassengerApi {

    @Autowired
    PassengerRepository passengerRepository;

    @GetMapping()
    public List<Passenger> listAllPassenger(){
        return passengerRepository.findAll();
    }

    @GetMapping("/{id}")
    public Passenger findPassenger(@PathVariable("id") Long id) {
        return passengerRepository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
    }

    @PostMapping
    public Passenger createPassenger(@RequestBody Passenger passenger) {
        return passengerRepository.save(passenger);
    }

    @PutMapping("/{id}")
    public Passenger fullUpdatePassenger(@PathVariable("id") Long id, @RequestBody Passenger passenger) {
        Passenger p = findPassenger(id);
        p.setName(passenger.getName());
        return passengerRepository.save(p);
    }

    @PatchMapping("/{id}")
    public Passenger incrementalUpdatePassenger(@PathVariable("id") Long id, @RequestBody Passenger passenger) {
        Passenger foundPassenger = findPassenger(id);
        foundPassenger.setName(Optional.ofNullable(passenger.getName()).orElse(foundPassenger.getName()));
        return passengerRepository.save(foundPassenger);
    }

    @DeleteMapping("/{id}")
    public void deletePassenger(@PathVariable("id") Long id) {
        passengerRepository.delete(findPassenger(id));
    }

}
