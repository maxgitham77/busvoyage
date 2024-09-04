package com.busvoyage.busvoyage.repository;

import com.busvoyage.busvoyage.entities.Bus;
import com.busvoyage.busvoyage.entities.BusRoute;
import com.busvoyage.busvoyage.entities.BusSchedule;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface BusScheduleRepository extends JpaRepository<BusSchedule, Long> {


    Optional<List<BusSchedule>> findByBusRoute(BusRoute busRoute);

    Boolean existsByBusAndBusRouteAndDepartureTime(Bus bus, BusRoute busRoute, String date);

}
