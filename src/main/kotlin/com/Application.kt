package com

import com.example.TesstParam
import com.service.TodoListService
import io.ktor.serialization.kotlinx.json.*
import io.ktor.server.application.*
import io.ktor.server.locations.*
import io.ktor.server.plugins.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Application.main() {
    install(ContentNegotiation) {
        json()
    }

    install(Locations) {
    }

    val todoList = TodoListService()



    routing {

        get<TesstParam> {
                testParam -> 1
            call.respondText(testParam.test1+ " " +testParam.test2)
        }
    }
}
