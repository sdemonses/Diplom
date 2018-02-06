package com.nure.bus.model

import org.neo4j.ogm.annotation.GraphId

data class Bus(
        @GraphId
        val id: Long,
        val countPlace: Int,
        val busMap: Int) {
    enum class BusType {
        COMFORT, ECO
    }
}