package com.nure.bus.model

import org.neo4j.ogm.annotation.GraphId
import java.time.LocalDateTime

data class Stop(
        @GraphId
        val id: Long,
        val station: Station,
        val nexStop: Stop,
        val arriveTime: LocalDateTime,
        val departureTime: LocalDateTime)