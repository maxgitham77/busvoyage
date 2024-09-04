package com.busvoyage.busvoyage.repository;

import com.busvoyage.busvoyage.entities.BusSchedule;
import com.busvoyage.busvoyage.entities.Customer;
import com.busvoyage.busvoyage.entities.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {

    Optional<List<Reservation>> findByCustomer(Customer customer);

    Optional<List<Reservation>> findByBusScheduleAndDepartureDate(BusSchedule busSchedule, String departureDate);

}