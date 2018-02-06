package com.nure.bus

import org.neo4j.ogm.session.SessionFactory
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Configuration
import org.springframework.data.neo4j.repository.config.EnableNeo4jRepositories
import org.springframework.transaction.annotation.EnableTransactionManagement
import org.springframework.data.neo4j.transaction.Neo4jTransactionManager



@Configuration
@EnableNeo4jRepositories("org.neo4j.cineasts.repository")
@EnableTransactionManagement
@ComponentScan("org.neo4j.cineasts")
class Neo4jConfig {
    @Bean
    fun getSessionFactory(): SessionFactory {
        return SessionFactory(configuration(), "org.neo4j.cineasts.domain")
    }

    @Bean
    @Throws(Exception::class)
    fun transactionManager(): Neo4jTransactionManager {
        return Neo4jTransactionManager(getSessionFactory())
    }

    @Bean
    fun configuration(): org.neo4j.ogm.config.Configuration {
        return org.neo4j.ogm.config.Configuration("bolt://localhost")
    }
}