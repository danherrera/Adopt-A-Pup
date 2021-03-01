/*
 * Copyright 2021 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
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
