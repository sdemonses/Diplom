package com.nure.bus.service

import com.nure.bus.model.Station
import com.nure.bus.repository.StationRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class StationService @Autowired constructor(
        val stationRepository: StationRepository) {

    fun add(station: Station) {
        stationRepository.save(station)
    }
}