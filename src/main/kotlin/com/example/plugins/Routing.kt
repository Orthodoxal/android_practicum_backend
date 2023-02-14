package com.example.plugins

import com.example.dto.FilterCategoriesReceiveDto
import com.example.repository.CategoryRepository
import com.example.repository.EventRepository
import io.ktor.server.application.*
import io.ktor.server.request.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Application.configureRouting() {
    routing {
        get("/categories") {
            call.respond(CategoryRepository().categories)
        }

        post("/events") {
            val filterCategoryDto = call.receive(FilterCategoriesReceiveDto::class)
            call.respond(EventRepository().filterEvents(filterCategoryDto))
        }
    }
}
