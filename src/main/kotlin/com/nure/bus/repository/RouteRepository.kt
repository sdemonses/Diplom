package com.nure.bus.repository

import com.nure.bus.model.Route
import org.springframework.data.neo4j.repository.Neo4jRepository
import org.springframework.stereotype.Repository

@Repository
interface RouteRepository : Neo4jRepository<Route, Long>
