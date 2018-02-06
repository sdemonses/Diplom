package com.nure.bus

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class BusAppApplication

fun main(args: Array<String>) {
    SpringApplication.run(BusAppApplication::class.java, *args)
}
