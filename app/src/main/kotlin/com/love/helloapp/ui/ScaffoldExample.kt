package com.love.helloapp.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

// @OptIn(ExperimentalMaterial3Api::class)
@Preview
@Composable
fun ScaffoldExample() {
    var presses by remember { mutableIntStateOf(0) }

    Scaffold(
        topBar = { CustomTopAppBar() },
        bottomBar = { CustomBottomAppBar() },
        floatingActionButton = { CustomFloatingActionButton { presses++ } }
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .padding(innerPadding),
            verticalArrangement = Arrangement.spacedBy(16.dp),
        ) {
            Text(
                modifier = Modifier.padding(8.dp),
                text =
                """
                    将军令

                    旌旗猎猎风云动，
                    铁骑铮铮踏九州。
                    沙场点兵豪气壮，
                    万里江山一剑收。

                    长枪如龙破敌阵，
                    战鼓如雷震山河。
                    血染征袍不言退，
                    将军令下定乾坤。

                    You have pressed the floating action button $presses times.
                """.trimIndent(),
            )
        }
    }
}

