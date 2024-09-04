package com.busvoyage.busvoyage.services;

import com.busvoyage.busvoyage.entities.BusSchedule;

import java.util.List;

public interface BusScheduleService {

    BusSchedule addSchedule(BusSchedule busSchedule);

    List<BusSchedule> getAllBusSchedules();

    List<BusSchedule> getSchedulesByRoute(String routeName);

}
