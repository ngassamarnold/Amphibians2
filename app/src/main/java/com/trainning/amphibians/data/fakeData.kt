package com.trainning.amphibians.data

import com.trainning.amphibians.network.Amphibian

val amphibians: List<Amphibian> =
    listOf(
        Amphibian(
            name = "Grenouille",
            type = "Anoure",
            description = "Une petite grenouille verte",
            imgSrc = "https://developer.android.com/codelabs/basic-android-kotlin-compose-amphibians-app/img/great-basin-spadefoot.png"
        ),
        Amphibian(
            name = "Salamandre",
            type = "Urodèle",
            description = "Une salamandre tachetée",
            imgSrc = "https://developer.android.com/codelabs/basic-android-kotlin-compose-amphibians-app/img/blue-jeans-frog.png"
        ),
        Amphibian(
            name = "Trirème",
            type = "Aristote",
            description = "Une amphibie énigmatique",
            imgSrc = "https://developer.android.com/codelabs/basic-android-kotlin-compose-amphibians-app/img/tiger-salamander.png"
        )
    )
