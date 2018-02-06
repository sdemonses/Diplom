package com.nure.bus.model

import org.neo4j.ogm.annotation.EndNode
import org.neo4j.ogm.annotation.RelationshipEntity
import org.neo4j.ogm.annotation.StartNode

@RelationshipEntity(type = "STATION_REL")
data class StationRel(
        val id: Long,
        val distance: Double,
        @StartNode
        val startStation: Station,
        @EndNode
        val secondStation: Station
)