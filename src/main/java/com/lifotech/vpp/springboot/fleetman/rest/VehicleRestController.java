package com.lifotech.vpp.springboot.fleetman.rest;

import com.lifotech.vpp.springboot.fleetma.data.VehicleRepository;
import com.lifotech.vpp.springboot.fleetma.domain.Vehicle;
import com.lifotech.vpp.springboot.fleetma.domain.VehicleList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class VehicleRestController {

    @Autowired
    private VehicleRepository data;

    @RequestMapping("/vehicles")
    public VehicleList allVehicles() {
        List<Vehicle> lists = data.findAll();
        return new VehicleList(lists);

    }

    @RequestMapping(value = "/vehicle", method = RequestMethod.POST)
    public ResponseEntity<Vehicle> createANewVehicle(@RequestBody Vehicle vehicle) {
        data.save(vehicle);
        return new ResponseEntity(vehicle, HttpStatus.CREATED);

    }

}
