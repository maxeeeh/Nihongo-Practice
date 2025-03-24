package com.mmorillas.nihongopractice.domain.usecase.hiragana

import com.mmorillas.nihongopractice.domain.syllabaries.Hiragana
import javax.inject.Inject

class GetHiraganaSyllabaryUseCase @Inject constructor() {
    operator fun invoke() = Hiragana.syllabary
}