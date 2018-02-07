package com.nure.bus.model

import org.neo4j.ogm.annotation.GeneratedValue
import org.neo4j.ogm.annotation.Id
import java.util.*

data class User(
        @Id @GeneratedValue
        var id: Long? = null,
        var firstName: String? = null,
        var lastName: String? = null,
        var primaryPhone: String? = null,
        var secondaryPhone: String? = null,
        var emailAddress: String? = null,
        var dateOfBirth: Date? = null

)