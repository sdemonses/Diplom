package com.nure.bus.controller

import com.nure.bus.model.Route
import com.nure.bus.service.RouteService
import com.nure.bus.service.StationRelService
import com.nure.bus.service.StationService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController


@RestController
class RouteController @Autowired constructor(
        val routeService: RouteService,
        val stationService: StationService,
        val stationRelService: StationRelService) {

    @RequestMapping("/hello")
    fun graph(@RequestParam(value = "limit", required = false) limit: Int?) {
        println("Hello")
        routeService.add(Route(title = "M-107"))

    }

    @RequestMapping("/Bye")
    fun graphs() {
        println("Bye")
        val st = stationService.stationRepository.findById(1).orElse(null)
        val st1 = stationService.stationRepository.findById(2).orElse(null)
      //  println(st)
        println("asda")
        /*val stR = StationRel(startStation = st, secondStation = st1, distance = 100.2)
        stationRelService.add(stR)
        *//*stationService.add(st)
        stationService.add(st1)*/
    }
}