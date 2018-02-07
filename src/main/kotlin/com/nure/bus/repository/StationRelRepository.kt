package com.nure.bus.repository

import com.nure.bus.model.StationRel
import org.springframework.data.neo4j.repository.Neo4jRepository

interface StationRelRepository : Neo4jRepository<StationRel, Long>