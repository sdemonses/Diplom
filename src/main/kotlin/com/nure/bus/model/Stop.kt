package com.nure.bus.model

import org.neo4j.ogm.annotation.GeneratedValue
import org.neo4j.ogm.annotation.Id
import org.neo4j.ogm.annotation.Relationship
import java.util.*

data class Stop(
        @Id @GeneratedValue
        var id: Long? = null,
        @Relationship(type = "ON_STATION", direction = Relationship.OUTGOING)
        var station: Station? = null,
        @Relationship(type = "NEXT_STATION", direction = Relationship.OUTGOING)
        var nexStop: Stop? = null,
        var arriveTime: Date? = null,
        var departureTime: Date? = null)