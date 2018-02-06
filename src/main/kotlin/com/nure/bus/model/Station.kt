package com.nure.bus.model

import org.neo4j.ogm.annotation.GraphId
import org.neo4j.ogm.annotation.NodeEntity
import org.neo4j.ogm.annotation.Relationship

@NodeEntity(label = "Station")
data class Station(
        @GraphId
        val id: Long,

        @Relationship(type = "PLACED_IN", direction = Relationship.OUTGOING)
        val town: Town,

        @Relationship(type = "STATION_REL", direction = Relationship.UNDIRECTED)
        val stations: Set<StationRel> = HashSet(),
        val longitude: Double,
        val latitude: Double
)