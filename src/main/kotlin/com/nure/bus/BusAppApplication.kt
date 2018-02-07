package com.nure.bus

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.domain.EntityScan
import org.springframework.data.neo4j.repository.config.EnableNeo4jRepositories
import org.springframework.transaction.annotation.EnableTransactionManagement

@SpringBootApplication
@EnableNeo4jRepositories("com.nure.bus.repository")
@EntityScan("com.nure.bus.model")
@EnableTransactionManagement
class BusAppApplication

fun main(args: Array<String>) {
    SpringApplication.run(BusAppApplication::class.java, *args)
}



