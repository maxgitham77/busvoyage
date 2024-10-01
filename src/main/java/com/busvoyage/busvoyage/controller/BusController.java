package com.busvoyage.busvoyage.controller;

import com.busvoyage.busvoyage.entities.Bus;
import com.busvoyage.busvoyage.models.ResponseModel;
import com.busvoyage.busvoyage.services.BusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/bus")
@CrossOrigin("*")
public class BusController {

    @Autowired
    private BusService busService;

    @PostMapping("/add")
    public ResponseModel<Bus> addBus(@RequestBody Bus bus) {
        final Bus savedBus = busService.addBus(bus);
        return new ResponseModel<>(HttpStatus.OK.value(), "Bus saved successfully", savedBus);
    }

    @GetMapping("/all")
    public ResponseEntity<List<Bus>> getAllBus() {
        return ResponseEntity.ok(busService.getAllBus());
    }

}
