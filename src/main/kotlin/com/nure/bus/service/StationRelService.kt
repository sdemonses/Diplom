package com.nure.bus.service

import com.nure.bus.model.StationRel
import com.nure.bus.repository.StationRelRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class StationRelService @Autowired constructor(
        val stationRepository: StationRelRepository) {

    fun add(stationRel: StationRel) {
        stationRepository.save(stationRel)
    }
}