package com.nure.bus.service

import com.nure.bus.model.Route
import com.nure.bus.repository.RouteRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class RouteService(@Autowired
                   var routeRepository: RouteRepository) {

    fun add(route:Route){
        routeRepository.save(route)
    }
}