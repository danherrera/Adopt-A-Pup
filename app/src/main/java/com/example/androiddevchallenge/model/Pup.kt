package com.example.androiddevchallenge.model

data class Pup(
    val id: Long,
    val name: String,
    val age: Double,
    val gender: Gender,
    val breed: Breed,
    val imageUrl: String,
    val description: String,
)
