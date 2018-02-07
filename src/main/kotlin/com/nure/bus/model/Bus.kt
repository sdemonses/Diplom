package com.nure.bus.model

import org.neo4j.ogm.annotation.GeneratedValue
import org.neo4j.ogm.annotation.Id

data class Bus(
        @Id @GeneratedValue
        var id: Long? = null,
        var countPlace: Int? = null,
        var busMap: Int ? = null){
    enum class BusType {
        COMFORT, ECO
    }
}