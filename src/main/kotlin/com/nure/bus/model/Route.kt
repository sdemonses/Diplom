package com.nure.bus.model

import org.neo4j.ogm.annotation.GraphId
import org.neo4j.ogm.annotation.Relationship

data class Route(
        @GraphId
        val id: Long,
        val title: String,
        @Relationship(type = "LAST_STOP", direction = Relationship.OUTGOING)
        val lastStop: Stop,
        @Relationship(type = "START_FROM", direction = Relationship.OUTGOING)
        val firstStop: Stop,
        @Relationship(type = "CONTAINS", direction = Relationship.OUTGOING)
        val stops: Set<Stop>,
        val bus: Bus
)