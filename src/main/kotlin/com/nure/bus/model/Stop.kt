package com.nure.bus.model

import org.neo4j.ogm.annotation.GeneratedValue
import org.neo4j.ogm.annotation.Id
import java.util.*

data class Stop(
        @Id @GeneratedValue
        var id: Long? = null,
        var station: Station? = null,
        var nexStop: Stop? = null,
        var arriveTime: Date? = null,
        var departureTime: Date? = null)