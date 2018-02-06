package com.nure.bus.controller

import com.nure.bus.model.Route
import com.nure.bus.service.RouteService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController


@RestController("/")
class RouteController(@Autowired val routeService: RouteService) {

    @RequestMapping("/hello")
    fun graph(@RequestParam(value = "limit", required = false) limit: Int?) {
        println("Hello")
        routeService.add(Route(1, "M-107", null, null, null, null))
    }
}