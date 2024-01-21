package com.trainning.amphibians.network

import com.trainning.amphibians.model.Amphibian
import retrofit2.http.GET

/**
 * A public interface that exposes the [getAmphibians] method
 */
interface AmphibianService {
    @GET("amphibians")
    suspend fun getAmphibians(): List<Amphibian>
}