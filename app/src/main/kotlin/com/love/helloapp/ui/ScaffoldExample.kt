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
import androidx.compose.ui.unit.dp

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
                    你说得对，Flutter 的 Hot Reload 功能与简单的自动执行代码不同。Flutter 的 Hot Reload 是通过将更新后的源代码注入到运行中的 Dart 虚拟机（VM）中来实现的1。以下是它的工作原理：

Flutter Hot Reload 原理
代码注入：当你保存文件时，Flutter 会将更新后的 Dart 代码注入到运行中的 Dart VM 中。
类更新：Dart VM 会用新版本的字段和函数更新类。
重建 Widget 树：Flutter 框架会自动重建 Widget 树，从而立即显示代码更改的效果12。
这种方法允许开发者在不重启应用的情况下，快速查看 UI 更改的效果，同时保留应用的当前状态。

在 Kotlin Compose 中实现类似功能
Jetpack Compose 提供了类似的功能，称为 Live Edit，但在 Linux 和 Vim 环境下，原生支持可能有限。你可以尝试以下方法来实现类似的效果：

使用 entr 和 rsync
安装 entr：确保你已经安装了 entr 工具。
创建同步脚本：创建一个脚本文件（例如 sync_and_run.sh），用于同步代码并运行应用：
#!/bin/bash

# 同步代码到设备
rsync -avz --exclude 'build/' . user@device:/path/to/project

# 在设备上执行构建和运行命令
ssh user@device 'cd /path/to/project && ./gradlew clean && ./gradlew assembleDebug && ./gradlew installDebug && adb shell am start -n com.love.helloapp/.MainActivity'

监视文件变化：使用 entr 工具监视项目文件的变化，并在变化时执行同步脚本：
find . -name "*.kt" | entr -r ./sync_and_run.sh

这种方法可以在文件变化时自动同步代码并重新运行应用，虽然不完全等同于 Flutter 的 Hot Reload，但可以在一定程度上提高开发效率。

如果你有更多问题或需要进一步的帮助，随时告诉我哦！😊

                    You have pressed the floating action button $presses times.
                """.trimIndent(),
            )
        }
    }
}

