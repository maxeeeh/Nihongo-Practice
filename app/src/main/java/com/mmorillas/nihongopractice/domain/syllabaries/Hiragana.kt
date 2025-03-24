package com.mmorillas.nihongopractice.domain.syllabaries

import com.mmorillas.nihongopractice.domain.model.Syllabary
import com.mmorillas.nihongopractice.domain.model.SyllableDefinition

object Hiragana {
    val syllabary: Syllabary = Syllabary(
        vowels = listOf(
            SyllableDefinition("あ", "a"),
            SyllableDefinition("い", "i"),
            SyllableDefinition("う", "u"),
            SyllableDefinition("え", "e"),
            SyllableDefinition("お", "o")
        ),
        k = listOf(
            SyllableDefinition("か", "ka"),
            SyllableDefinition("き", "ki"),
            SyllableDefinition("く", "ku"),
            SyllableDefinition("け", "ke"),
            SyllableDefinition("こ", "ko")
        ),
        s = listOf(
            SyllableDefinition("さ", "sa"),
            SyllableDefinition("し", "shi"),
            SyllableDefinition("す", "su"),
            SyllableDefinition("せ", "se"),
            SyllableDefinition("そ", "so")
        ),
        t = listOf(
            SyllableDefinition("た", "ta"),
            SyllableDefinition("ち", "chi"),
            SyllableDefinition("つ", "tsu"),
            SyllableDefinition("て", "te"),
            SyllableDefinition("と", "to")
        ),
        n = listOf(
            SyllableDefinition("な", "na"),
            SyllableDefinition("に", "ni"),
            SyllableDefinition("ぬ", "nu"),
            SyllableDefinition("ね", "ne"),
            SyllableDefinition("の", "no")
        ),
        h = listOf(
            SyllableDefinition("は", "ha"),
            SyllableDefinition("ひ", "hi"),
            SyllableDefinition("ふ", "fu"),
            SyllableDefinition("へ", "he"),
            SyllableDefinition("ほ", "ho")
        ),
        m = listOf(
            SyllableDefinition("ま", "ma"),
            SyllableDefinition("み", "mi"),
            SyllableDefinition("む", "mu"),
            SyllableDefinition("め", "me"),
            SyllableDefinition("も", "mo")
        ),
        y = listOf(
            SyllableDefinition("や", "ya"),
            SyllableDefinition("ゆ", "yu"),
            SyllableDefinition("よ", "yo")
        ),
        r = listOf(
            SyllableDefinition("ら", "ra"),
            SyllableDefinition("り", "ri"),
            SyllableDefinition("る", "ru"),
            SyllableDefinition("れ", "re"),
            SyllableDefinition("ろ", "ro")
        ),
        w = listOf(
            SyllableDefinition("わ", "wa"),
            SyllableDefinition("を", "wo")
        ),

        consonants = listOf(SyllableDefinition("ん", "n")),

        kDakuten = listOf(
            SyllableDefinition("が", "ga"),
            SyllableDefinition("ぎ", "gi"),
            SyllableDefinition("ぐ", "gu"),
            SyllableDefinition("げ", "ge"),
            SyllableDefinition("ご", "go")
        ),
        sDakuten = listOf(
            SyllableDefinition("ざ", "za"),
            SyllableDefinition("じ", "ji"),
            SyllableDefinition("ず", "zu"),
            SyllableDefinition("ぜ", "ze"),
            SyllableDefinition("ぞ", "zo")
        ),
        tDakuten = listOf(
            SyllableDefinition("だ", "da"),
            SyllableDefinition("ぢ", "ji"),
            SyllableDefinition("づ", "zu"),
            SyllableDefinition("で", "de"),
            SyllableDefinition("ど", "do")
        ),
        hDakuten = listOf(
            SyllableDefinition("ば", "ba"),
            SyllableDefinition("び", "bi"),
            SyllableDefinition("ぶ", "bu"),
            SyllableDefinition("べ", "be"),
            SyllableDefinition("ぼ", "bo")
        ),
        hHandakuten = listOf(
            SyllableDefinition("ぱ", "pa"),
            SyllableDefinition("ぴ", "pi"),
            SyllableDefinition("ぷ", "pu"),
            SyllableDefinition("ぺ", "pe"),
            SyllableDefinition("ぽ", "po")
        ),
    )
}