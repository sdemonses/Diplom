package com.nure.bus.model

import org.neo4j.ogm.annotation.GraphId

data class Ticket(@GraphId
                  val id: Long,
                  val bus: Bus,
                  val route: Route
)