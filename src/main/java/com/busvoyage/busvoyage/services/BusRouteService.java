package com.busvoyage.busvoyage.services;

import com.busvoyage.busvoyage.entities.BusRoute;

import java.util.List;

public interface BusRouteService {

    BusRoute addRoute(BusRoute busRoute);

    List<BusRoute> getAllBusRoutes();

    BusRoute getRouteByRouteName(String routeName);

    BusRoute getRouteByCityFromAndCityTo(String cityFrom, String cityTo);

}
