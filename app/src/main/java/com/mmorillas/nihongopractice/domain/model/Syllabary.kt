package com.mmorillas.nihongopractice.domain.model

data class Syllabary (
    val vowels: List<SyllableDefinition>,
    val k: List<SyllableDefinition>,
    val s: List<SyllableDefinition>,
    val t: List<SyllableDefinition>,
    val n: List<SyllableDefinition>,
    val h: List<SyllableDefinition>,
    val m: List<SyllableDefinition>,
    val y: List<SyllableDefinition>,
    val r: List<SyllableDefinition>,
    val w: List<SyllableDefinition>,
    val consonants: List<SyllableDefinition>,
    val kDakuten: List<SyllableDefinition>,
    val sDakuten: List<SyllableDefinition>,
    val tDakuten: List<SyllableDefinition>,
    val hDakuten: List<SyllableDefinition>,
    val hHandakuten: List<SyllableDefinition>
)