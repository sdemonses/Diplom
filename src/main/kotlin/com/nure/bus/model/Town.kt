package com.nure.bus.model

import org.neo4j.ogm.annotation.GraphId

data class Town(
        @GraphId
        val id: Long,
        val title: String
)