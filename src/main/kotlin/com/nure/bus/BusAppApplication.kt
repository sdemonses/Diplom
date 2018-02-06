package com.nure.bus

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.domain.EntityScan

@SpringBootApplication
@EntityScan("com.nure.bus.model")
class BusAppApplication

fun main(args: Array<String>) {
    SpringApplication.run(BusAppApplication::class.java, *args)
}



