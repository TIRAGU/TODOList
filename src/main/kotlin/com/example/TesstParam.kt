package com.example

import io.ktor.server.locations.*

@Location("/{test1}/{test2}")
data class TesstParam(val test1: String, val test2: String)