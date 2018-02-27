package com.nure.bus.model

import com.fasterxml.jackson.annotation.JsonIgnore
import org.neo4j.ogm.annotation.EndNode
import org.neo4j.ogm.annotation.Relationship
import org.neo4j.ogm.annotation.RelationshipEntity
import org.neo4j.ogm.annotation.StartNode

@RelationshipEntity(type = "STATION_REL")
class StationRel(
        var id: Long? = null,
        var distance: Double? = null,
        @JsonIgnore
        @StartNode
        var startStation: Station? = null,
        @JsonIgnore
        @EndNode
        var secondStation: Station? = null,
        @Relationship(type = "HAVE", direction = Relationship.OUTGOING)
        var routes: List<Route>? = ArrayList()

)