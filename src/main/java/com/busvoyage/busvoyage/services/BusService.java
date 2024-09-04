package com.busvoyage.busvoyage.services;

import com.busvoyage.busvoyage.entities.Bus;

import java.util.List;

public interface BusService {

    Bus addBus(Bus bus);

    List<Bus> getAllBus();
}
