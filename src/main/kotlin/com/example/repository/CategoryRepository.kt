package com.example.repository

import com.example.dto.CategoryDto

class CategoryRepository {
    val categories = listOf(
        CategoryDto(
            id = 0L,
            name = "Дети",
            image = "child"
        ),
        CategoryDto(
            id = 1L,
            name = "Взрослые",
            image = "child"
        ),
        CategoryDto(
            id = 2L,
            name = "Пожилые",
            image = "child"
        ),
        CategoryDto(
            id = 3L,
            name = "Животные",
            image = "child"
        ),
        CategoryDto(
            id = 4L,
            name = "Мероприятия",
            image = "child"
        ),
    )
}