package com.sample.kofu

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document
data class User(
        @Id val login: String,
        val firstName: String,
        val lastName: String
)