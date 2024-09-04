package com.busvoyage.busvoyage.services.impl;

import com.busvoyage.busvoyage.entities.BusRoute;
import com.busvoyage.busvoyage.models.ReservationApiException;
import com.busvoyage.busvoyage.repository.BusRouteRepository;
import com.busvoyage.busvoyage.services.BusRouteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BusRouteServiceImpl implements BusRouteService {

    @Autowired
    private BusRouteRepository busRouteRepository;

    @Override
    public BusRoute addRoute(BusRoute busRoute) {
        return busRouteRepository.save(busRoute);
    }

    @Override
    public List<BusRoute> getAllBusRoutes() {
        return busRouteRepository.findAll();
    }

    @Override
    public BusRoute getRouteByRouteName(String routeName) {
        return busRouteRepository.findByRouteName(routeName).orElseThrow(()
                -> new ReservationApiException(HttpStatus.BAD_REQUEST, "Such route name is not found!"));
    }

    @Override
    public BusRoute getRouteByCityFromAndCityTo(String cityFrom, String cityTo) {
        return busRouteRepository.findByCityFromAndCityTo(cityFrom, cityTo).orElseThrow(()
                -> new ReservationApiException(HttpStatus.BAD_REQUEST, "This cityFrom and cityTo is no found!"));
    }
}
