package com.busvoyage.busvoyage.services.impl;

import com.busvoyage.busvoyage.entities.Bus;
import com.busvoyage.busvoyage.repository.BusRepository;
import com.busvoyage.busvoyage.services.BusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BusServiceImpl implements BusService {

    @Autowired
    private BusRepository busRepository;

    @Override
    public Bus addBus(Bus bus) {
        return busRepository.save(bus);
    }

    @Override
    public List<Bus> getAllBus() {
        return busRepository.findAll();
    }
}
