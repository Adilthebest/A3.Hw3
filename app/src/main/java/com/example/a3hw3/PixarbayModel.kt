package com.example.a3hw3

data class PixarModel (
val total:Int,
val totalHits:Int,
val hits:List<ImageModel>
)

data class ImageModel (
        val largeImageUrl:String,

        )


