package com.example.dto

@kotlinx.serialization.Serializable
data class EventDto(
    val id: Long,
    val title: String,
    val description: String,
    val descriptionFull: String,
    val organisation: String,
    val address: String,
    val phones: String,
    val categories: List<Long>,
    val dateStart: String,
    val dateEnd: String,
    val photos: List<String>,
)
