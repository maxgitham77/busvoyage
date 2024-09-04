package com.busvoyage.busvoyage.services;

import com.busvoyage.busvoyage.entities.Reservation;

import java.util.List;

public interface ReservationService {

    Reservation addReservation(Reservation reservation);

    List<Reservation> getAllReservations();

    List<Reservation> getReservationsByScheduleAndDepartureDate(Long schedule, String departureDate);

    List<Reservation> getReservationByMobile(String mobile);

}
