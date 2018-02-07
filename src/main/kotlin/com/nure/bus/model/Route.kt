package com.nure.bus.model

import org.neo4j.ogm.annotation.GeneratedValue
import org.neo4j.ogm.annotation.Id
import org.neo4j.ogm.annotation.Relationship

data class Route(
        @Id @GeneratedValue
        var id: Long? = null,
        var title: String? = null,
        @Relationship(type = "LAST_STOP", direction = Relationship.OUTGOING)
        var lastStop: Stop? = null,
        @Relationship(type = "START_FROM", direction = Relationship.OUTGOING)
        var firstStop: Stop? = null,
        @Relationship(type = "CONTAINS", direction = Relationship.OUTGOING)
        var stops: Set<Stop>? = null,
        var bus: Bus? = null
)