package com.mmorillas.nihongopractice.domain.usecase.hiragana

import com.mmorillas.nihongopractice.domain.model.SyllableDefinition

class GetHiraganaSyllabaryUseCase {
    operator fun invoke(includeDakutenHandakuten: Boolean) : List<SyllableDefinition> {
        val syllabary = mutableListOf<SyllableDefinition>()

        syllabary.add(SyllableDefinition("あ", "a"))
        syllabary.add(SyllableDefinition("い", "i"))
        syllabary.add(SyllableDefinition("う", "u"))
        syllabary.add(SyllableDefinition("え", "e"))
        syllabary.add(SyllableDefinition("お", "o"))

        syllabary.add(SyllableDefinition("か", "ka"))
        syllabary.add(SyllableDefinition("き", "ki"))
        syllabary.add(SyllableDefinition("く", "ku"))
        syllabary.add(SyllableDefinition("け", "ke"))
        syllabary.add(SyllableDefinition("こ", "ko"))

        syllabary.add(SyllableDefinition("さ", "sa"))
        syllabary.add(SyllableDefinition("し", "shi"))
        syllabary.add(SyllableDefinition("す", "su"))
        syllabary.add(SyllableDefinition("せ", "se"))
        syllabary.add(SyllableDefinition("そ", "so"))

        syllabary.add(SyllableDefinition("た", "ta"))
        syllabary.add(SyllableDefinition("ち", "chi"))
        syllabary.add(SyllableDefinition("つ", "tsu"))
        syllabary.add(SyllableDefinition("て", "te"))
        syllabary.add(SyllableDefinition("と", "to"))

        syllabary.add(SyllableDefinition("な", "na"))
        syllabary.add(SyllableDefinition("に", "ni"))
        syllabary.add(SyllableDefinition("ぬ", "nu"))
        syllabary.add(SyllableDefinition("ね", "ne"))
        syllabary.add(SyllableDefinition("の", "no"))

        syllabary.add(SyllableDefinition("は", "ha"))
        syllabary.add(SyllableDefinition("ひ", "hi"))
        syllabary.add(SyllableDefinition("ふ", "fu"))
        syllabary.add(SyllableDefinition("へ", "he"))
        syllabary.add(SyllableDefinition("ほ", "ho"))

        syllabary.add(SyllableDefinition("ま", "ma"))
        syllabary.add(SyllableDefinition("み", "mi"))
        syllabary.add(SyllableDefinition("む", "mu"))
        syllabary.add(SyllableDefinition("め", "me"))
        syllabary.add(SyllableDefinition("も", "mo"))

        syllabary.add(SyllableDefinition("や", "ya"))
        syllabary.add(SyllableDefinition("ゆ", "yu"))
        syllabary.add(SyllableDefinition("よ", "yo"))

        syllabary.add(SyllableDefinition("ら", "ra"))
        syllabary.add(SyllableDefinition("り", "ri"))
        syllabary.add(SyllableDefinition("る", "ru"))
        syllabary.add(SyllableDefinition("れ", "re"))
        syllabary.add(SyllableDefinition("ろ", "ro"))

        syllabary.add(SyllableDefinition("わ", "wa"))
        syllabary.add(SyllableDefinition("を", "wo"))
        syllabary.add(SyllableDefinition("ん", "n"))

        if (includeDakutenHandakuten) {
            syllabary.add(SyllableDefinition("が", "ga"))
            syllabary.add(SyllableDefinition("ぎ", "gi"))
            syllabary.add(SyllableDefinition("ぐ", "gu"))
            syllabary.add(SyllableDefinition("げ", "ge"))
            syllabary.add(SyllableDefinition("ご", "go"))

            syllabary.add(SyllableDefinition("ざ", "za"))
            syllabary.add(SyllableDefinition("じ", "ji"))
            syllabary.add(SyllableDefinition("ず", "zu"))
            syllabary.add(SyllableDefinition("ぜ", "ze"))
            syllabary.add(SyllableDefinition("ぞ", "zo"))

            syllabary.add(SyllableDefinition("だ", "da"))
            syllabary.add(SyllableDefinition("ぢ", "ji"))  // Rare, usually replaced with じ
            syllabary.add(SyllableDefinition("づ", "zu"))  // Rare, usually replaced with ず
            syllabary.add(SyllableDefinition("で", "de"))
            syllabary.add(SyllableDefinition("ど", "do"))

            syllabary.add(SyllableDefinition("ば", "ba"))
            syllabary.add(SyllableDefinition("び", "bi"))
            syllabary.add(SyllableDefinition("ぶ", "bu"))
            syllabary.add(SyllableDefinition("べ", "be"))
            syllabary.add(SyllableDefinition("ぼ", "bo"))
        }

        return  syllabary
    }
}