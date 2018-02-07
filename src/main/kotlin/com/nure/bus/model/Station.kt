package com.nure.bus.model

import org.neo4j.ogm.annotation.GeneratedValue
import org.neo4j.ogm.annotation.Id
import org.neo4j.ogm.annotation.NodeEntity
import org.neo4j.ogm.annotation.Relationship
import org.springframework.data.neo4j.annotation.Depth

@NodeEntity(label = "Station")
data class Station(
        @Id @GeneratedValue
        var id: Long? = null,

        @Relationship(type = "PLACED_IN", direction = Relationship.OUTGOING)
        var town: Town? = null,
        @Depth
        @Relationship(type = "STATION_REL", direction = Relationship.UNDIRECTED)
        var stations: Set<StationRel>? = HashSet(),
        var longitude: Double? = null,
        var latitude: Double? = null
)