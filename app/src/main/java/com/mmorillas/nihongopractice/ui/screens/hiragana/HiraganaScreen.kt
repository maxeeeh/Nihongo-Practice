package com.mmorillas.nihongopractice.ui.screens.hiragana

import androidx.annotation.StringRes
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyListScope
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import com.mmorillas.nihongopractice.R
import com.mmorillas.nihongopractice.domain.model.Syllabary
import com.mmorillas.nihongopractice.domain.model.SyllableDefinition
import com.mmorillas.nihongopractice.domain.syllabaries.Hiragana
import com.mmorillas.nihongopractice.ui.shared.model.ScaffoldConfiguration
import com.mmorillas.nihongopractice.ui.theme.AppTheme

@Composable
fun HiraganaScreen(
    viewModel: HiraganaViewModel = hiltViewModel(),
    buildScaffoldConfiguration: (ScaffoldConfiguration) -> Unit,
) {
    val items = viewModel.syllabary

    List(items)
}

@Composable
private fun List(syllabary: Syllabary) {
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
    ) {
        syllableList(syllabary.vowels, R.string.vowels)
        syllableList(syllabary.k, R.string.k)
        syllableList(syllabary.s, R.string.s)
        syllableList(syllabary.t, R.string.t)
        syllableList(syllabary.n, R.string.n)
        syllableList(syllabary.h, R.string.h)
        syllableList(syllabary.m, R.string.m)
        syllableList(syllabary.y, R.string.y)
        syllableList(syllabary.r, R.string.r)
        syllableList(syllabary.w, R.string.w)
        syllableList(syllabary.consonants, R.string.consonants)
        syllableList(syllabary.kDakuten, R.string.kDakuten)
        syllableList(syllabary.sDakuten, R.string.sDakuten)
        syllableList(syllabary.tDakuten, R.string.tDakuten)
        syllableList(syllabary.hDakuten, R.string.hDakuten)
        syllableList(syllabary.hHandakuten, R.string.hHandakuten)
    }
}

@OptIn(ExperimentalFoundationApi::class)
private fun LazyListScope.syllableList(
    list: List<SyllableDefinition>,
    @StringRes headerRes: Int
) {
    stickyHeader {
        Text(
            text = stringResource(headerRes),
            style = MaterialTheme.typography.titleLarge,
            modifier = Modifier
                .fillMaxWidth()
                .background(MaterialTheme.colorScheme.primaryContainer)
        )
    }

    items(list) {
        HiraganaItem(it)
    }
}

@Composable
private fun HiraganaItem(item: SyllableDefinition) {
    ElevatedCard(
        modifier = Modifier
            .padding(4.dp)
            .fillMaxSize()
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
            modifier = Modifier.fillMaxSize()
        ) {
            Text(
                text = item.character,
                style = MaterialTheme.typography.bodyLarge,
                fontSize = 60.sp
            )
            Text(
                text = item.romaji,
                style = MaterialTheme.typography.bodyLarge,
                fontSize = 60.sp
            )
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
private fun Preview() {
    val items = Hiragana.syllabary

    AppTheme {
        List(items)
    }
}