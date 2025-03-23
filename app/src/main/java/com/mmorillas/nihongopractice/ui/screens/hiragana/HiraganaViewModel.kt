package com.mmorillas.nihongopractice.ui.screens.hiragana

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import com.mmorillas.nihongopractice.domain.usecase.hiragana.GetHiraganaSyllabaryUseCase
import javax.inject.Inject

class HiraganaViewModel @Inject constructor(
    private val getHiraganaSyllabaryUseCase: GetHiraganaSyllabaryUseCase
) {
    val syllabary by mutableStateOf(getHiraganaSyllabaryUseCase(true))
}