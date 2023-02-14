package com.example.dto

@kotlinx.serialization.Serializable
data class FilterCategoriesReceiveDto(
    val categoryIds: List<Long>
)
