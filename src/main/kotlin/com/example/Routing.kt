package com.example

import com.example.TesstParam
import io.ktor.server.routing.*
import io.ktor.server.locations.*
import io.ktor.server.application.*
import io.ktor.server.response.*

fun Application.configureRouting() {

    install(Locations) {
    }

    routing {

        get<TesstParam> {
            testParam -> 1
            call.respondText(testParam.test1+ " " +testParam.test2)
        }
    }
}

