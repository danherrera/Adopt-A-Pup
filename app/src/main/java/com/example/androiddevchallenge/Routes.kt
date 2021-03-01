package com.example.androiddevchallenge

object Routes {
    val overview = "overview"
    val details = "details/{${Arguments.pupId}}"

    object Arguments {
        val pupId = "pupId"
    }
}