package com.nure.bus.model

import org.neo4j.ogm.annotation.GeneratedValue
import org.neo4j.ogm.annotation.Id

data class Town(
        @Id @GeneratedValue
        var id: Long? = null,
        var title: String? = null
)