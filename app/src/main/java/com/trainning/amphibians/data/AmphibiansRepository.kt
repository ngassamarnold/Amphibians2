package com.trainning.amphibians.data

import com.trainning.amphibians.model.Amphibian
import com.trainning.amphibians.network.AmphibianService

/**
 * Repository that fetch amphibians list from amphibiansApi.
 */
interface AmphibiansRepository {
    suspend fun getAmphibians(): List<Amphibian>
}

/**
 * Network Implementation of Repository that fetch amphibians list from amphibiansApi.
 */
class NetworkAmphibiansRepository(private val amphibianService: AmphibianService) :
    AmphibiansRepository {
    override suspend fun getAmphibians(): List<Amphibian> = amphibianService.getAmphibians()
}