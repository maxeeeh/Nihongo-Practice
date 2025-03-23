package com.mmorillas.nihongopractice.domain.model

import androidx.annotation.RawRes

data class SyllableDefinition (
    val character: String,
    val romaji: String,
    @RawRes val soundRes: Int? = null
)