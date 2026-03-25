package com.appcar.car.interfaces;

import com.appcar.car.domain.Driver;
import com.appcar.car.domain.DriverRepository;
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
@RequestMapping(produces = MediaType.APPLICATION_JSON_VALUE)
public class DriverAPI {

//    @Autowired
    DriverRepository driverRepository;

    @GetMapping("/drivers")
    public List<Driver> listDrivers(){
        return driverRepository.findAll();
    }

    @PostMapping("/drivers")
    public Driver addnewUser(@RequestBody Driver u){
        driverRepository.save(u);
        return u;
    }

    @GetMapping("/drivers/{ID}")
    public Driver findById(@PathVariable("ID") Long id){
        return driverRepository.findById(id).orElseThrow( () -> new ResponseStatusException(HttpStatus.NOT_FOUND));
    }

    @PutMapping("/drivers/{ID}")
    public Driver fullUpdateDriver(@PathVariable("ID") long id, @RequestBody Driver d){
        Driver foundDriver = findById(id);
        foundDriver.setName(d.getName());
        foundDriver.setBirthDate(d.getBirthDate());

        driverRepository.save(foundDriver);
        return foundDriver;

    }

    @PatchMapping("/drivers/{ID}")
    public Driver alterUpdateDriver(@PathVariable("ID") long id, @RequestBody Driver d){
        Driver foundDriver = findById(id);
        foundDriver = d;
        driverRepository.save(foundDriver);
        return foundDriver;
    }

    @DeleteMapping("/drivers/{ID}")
    public void deleteDriver(@PathVariable("ID") long  id){
         driverRepository.delete(findById(id));
    }



}
