package com.nure.bus.model

import org.neo4j.ogm.annotation.GraphId
import java.time.LocalDate

data class User(
        @GraphId
        val id: Long,
        val firstName: String,
        val lastName: String,
        val primaryPhone: String,
        val secondaryPhone: String,
        val emailAddress: String,
        val dateOfBirth: LocalDate

)