package com.lifotech.vpp.springboot.fleetma.data;

import com.lifotech.vpp.springboot.fleetma.domain.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;


@Component
public interface VehicleRepository extends JpaRepository<Vehicle, Long> {
    public Vehicle findByName(String name);
} 
