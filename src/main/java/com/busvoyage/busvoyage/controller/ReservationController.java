package com.busvoyage.busvoyage.controller;

import com.busvoyage.busvoyage.entities.Reservation;
import com.busvoyage.busvoyage.models.ResponseModel;
import com.busvoyage.busvoyage.services.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/reservation")
@CrossOrigin("*")
public class ReservationController {

    @Autowired
    private ReservationService reservationService;

    @PostMapping("/add")
    public ResponseModel<Reservation> addReservation(@RequestBody Reservation reservation) {
        final Reservation reservation1 = reservationService.addReservation(reservation);
        return new ResponseModel<>(HttpStatus.OK.value(), "Reservation saved", reservation1);
    }

    @GetMapping("/all")
    public ResponseEntity<List<Reservation>> getAllReservation() {
        return ResponseEntity.ok(reservationService.getAllReservations());
    }

    @GetMapping("/query")
    public ResponseEntity<List<Reservation>> getReservationByScheduleAndDepartureDate(
            @RequestParam Long scheduleId,
            @RequestParam String departureDate
    ) {
        return  ResponseEntity.ok(reservationService.getReservationsByScheduleAndDepartureDate(scheduleId, departureDate));
    }

    @GetMapping("/all/{mobile}")
    public ResponseEntity<List<Reservation>> getReservationsByMobile(@PathVariable(name = "mobile") String mobile) {
        return ResponseEntity.ok(reservationService.getReservationByMobile(mobile));
    }

}
