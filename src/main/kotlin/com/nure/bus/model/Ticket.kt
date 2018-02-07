package com.nure.bus.model

import org.neo4j.ogm.annotation.GeneratedValue
import org.neo4j.ogm.annotation.Id

data class Ticket(@Id @GeneratedValue
                  var id: Long? = null,
                  var bus: Bus? = null,
                  var route: Route? = null
)