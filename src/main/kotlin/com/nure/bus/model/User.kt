package com.nure.bus.model

import java.time.LocalDate
import javax.persistence.Id

data class User(
        @Id
        val id: Long,
        val firstName: String,
        val lastName: String,
        val primaryPhone: String,
        val secondaryPhone: String,
        val emailAddress: String,
        val dateOfBirth: LocalDate

)