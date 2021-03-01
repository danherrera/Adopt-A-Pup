package com.example.androiddevchallenge.data

import com.example.androiddevchallenge.model.Breed
import com.example.androiddevchallenge.model.Gender
import com.example.androiddevchallenge.model.Pup

class PupRepository {

    private fun description(pupName: String): String {
        return """
            $pupName is a very loving and friendly pup. $pupName would love to join a wonderful family.
        """.trimIndent()
    }

    private val pups = listOf(
        Pup(1, "Fido", 4.0, Gender.MALE, Breed("Terrier"), "https://upload.wikimedia.org/wikipedia/commons/6/64/The_Puppy.jpg", description("Fido")),
        Pup(2, "Ava", 7.0, Gender.FEMALE, Breed("Spaniel"), "https://upload.wikimedia.org/wikipedia/en/0/09/Cavalier_King_Charles_Spaniel_puppy.jpg", description("Ava")),
        Pup(3, "Peluche", 1.5, Gender.MALE, Breed("Retriever"), "https://upload.wikimedia.org/wikipedia/commons/6/6e/Golde33443.jpg", description("Peluche")),
        Pup(4, "Marvelle", 2.5, Gender.FEMALE, Breed("Siberian Husky"), "https://upload.wikimedia.org/wikipedia/commons/c/cf/Keeshond_Sibirian_Husky_crossbreed_puppy.jpg", description("Marvelle")),
        Pup(5, "Piper", 2.5, Gender.MALE, Breed("Golden Retriever"), "https://pixy.org/src/466/4665650.jpg", description("Piper")),
    )

    fun all(): List<Pup> = pups

    fun findById(id: Long): Pup? = pups.find { it.id == id }
}