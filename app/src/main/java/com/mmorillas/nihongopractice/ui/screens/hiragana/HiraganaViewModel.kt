package com.mmorillas.nihongopractice.ui.screens.hiragana

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import com.mmorillas.nihongopractice.domain.usecase.hiragana.GetHiraganaSyllabaryUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class HiraganaViewModel @Inject constructor(
    private val getHiraganaSyllabaryUseCase: GetHiraganaSyllabaryUseCase
) : ViewModel() {
    val syllabary by mutableStateOf(getHiraganaSyllabaryUseCase())

}