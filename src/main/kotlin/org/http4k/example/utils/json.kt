package org.http4k.example.utils

import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper

fun Any.toJson(pretty: Boolean = false): String =
    if (pretty) jacksonObjectMapper().writerWithDefaultPrettyPrinter().writeValueAsString(this)
    else jacksonObjectMapper().writeValueAsString(this)