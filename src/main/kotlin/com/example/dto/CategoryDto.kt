package com.example.dto

@kotlinx.serialization.Serializable
data class CategoryDto(
    val id: Long,
    val name: String,
    val image: String,
)
