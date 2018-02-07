package com.nure.bus.repository

import com.nure.bus.model.Station
import org.springframework.data.neo4j.repository.Neo4jRepository

interface StationRepository : Neo4jRepository<Station, Long>