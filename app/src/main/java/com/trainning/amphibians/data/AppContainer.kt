package com.trainning.amphibians.data

import com.jakewharton.retrofit2.converter.kotlinx.serialization.asConverterFactory
import com.trainning.amphibians.network.AmphibianService
import kotlinx.serialization.json.Json
import okhttp3.MediaType.Companion.toMediaType
import retrofit2.Retrofit

/**
 * Dependency Injection container at the application level.
 */
interface AppContainer {
    val amphibiansRepository: AmphibiansRepository
}

/**
 * Implementation for the Dependency Injection container at the application level.
 *
 * Variables are initialized lazily and the same instance is shared across the whole app.
 */
class DefaultAppContainer : AppContainer {

    private val BASE_URL = "https://android-kotlin-fun-mars-server.appspot.com"

    /**
     * Use the Retrofit builder to build a retrofit object using a kotlinx.serialization converter
     */
    private val retrofit = Retrofit.Builder()
        .addConverterFactory(Json.asConverterFactory("application/json".toMediaType()))
        .baseUrl(BASE_URL)
        .build()

    /**
     * Retrofit service object for creating api calls
     */
    private val retrofitService: AmphibianService by lazy {
        retrofit.create(AmphibianService::class.java)
    }

    /**
     * DI implementation for amphibians repository
     */
    override val amphibiansRepository: AmphibiansRepository by lazy {
        NetworkAmphibiansRepository(retrofitService)
    }
}