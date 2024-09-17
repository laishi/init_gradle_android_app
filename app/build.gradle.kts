// apply(from="./app-properties.kts")

plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.org.jetbrains.kotlin.android)
    alias(libs.plugins.compose.compiler)
}


android {
    namespace = "com.love.helloapp"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.love.helloapp"
        targetSdk = 34
        minSdk = 21
        versionCode = 1
        versionName = "1.0"
    }

    composeOptions {
        kotlinCompilerExtensionVersion = "1.5.14"
    }

     buildTypes {
        getByName("release") {
            isMinifyEnabled = true // Enables code shrinking for the release build type.
            proguardFiles(
                getDefaultProguardFile("proguard-android.txt"),
                "proguard-rules.pro"
            )
        }
    }

    buildFeatures {
        compose = true
    }
}

kotlin {
    jvmToolchain(17)
}

dependencies {
    // Activity 支持
    implementation("androidx.activity:activity-compose:1.9.0")

    // 基础 UI 组件
    val composeBom = platform("androidx.compose:compose-bom:2024.09.00")
    implementation(composeBom)
    androidTestImplementation(composeBom)
    implementation("androidx.compose.ui:ui")

    // 预览和调试工具
    implementation("androidx.compose.ui:ui-tooling-preview")
    debugImplementation("androidx.compose.ui:ui-tooling")

    // Material Design 组件
    implementation("androidx.compose.material3:material3")

    // 兼容性支持
    val appcompat_version = "1.7.0"
    implementation("androidx.appcompat:appcompat:$appcompat_version")
    implementation("androidx.appcompat:appcompat-resources:$appcompat_version")
}



// dependencies {
//     implementation("androidx.activity:activity-compose:1.9.0")
//     implementation("androidx.lifecycle:lifecycle-viewmodel-compose:2.6.1")

//     implementation("androidx.compose.runtime:runtime-livedata")
//     implementation("androidx.compose.runtime:runtime-rxjava2")

//     val composeBom = platform("androidx.compose:compose-bom:2024.06.00")
//     implementation(composeBom)
//     androidTestImplementation(composeBom)

//     val appcompat_version = "1.7.0"
//     implementation("androidx.appcompat:appcompat:$appcompat_version")
//     implementation("androidx.appcompat:appcompat-resources:$appcompat_version")

//     // 实际安装具体的库
//     implementation("androidx.compose.material3:material3")
//     implementation("androidx.compose.foundation:foundation")

//     implementation("androidx.compose.ui:ui")
//     implementation("androidx.compose.ui:ui-tooling-preview")
//     debugImplementation("androidx.compose.ui:ui-tooling")
//     androidTestImplementation("androidx.compose.ui:ui-test-junit4")
//     debugImplementation("androidx.compose.ui:ui-test-manifest")


// }


// dependencies {

//     implementation(libs.androidx.core.ktx)
//     implementation(libs.androidx.lifecycle.runtime.ktx)
//     implementation(libs.androidx.activity.compose)
//     implementation(platform(libs.androidx.compose.bom))
//     implementation(libs.androidx.ui)
//     implementation(libs.androidx.ui.graphics)
//     implementation(libs.androidx.ui.tooling.preview)
//     implementation(libs.androidx.material3)
//     testImplementation(libs.junit)
//     androidTestImplementation(libs.androidx.junit)
//     androidTestImplementation(libs.androidx.espresso.core)
//     androidTestImplementation(platform(libs.androidx.compose.bom))
//     androidTestImplementation(libs.androidx.ui.test.junit4)
//     debugImplementation(libs.androidx.ui.tooling)
//     debugImplementation(libs.androidx.ui.test.manifest)

//     implementation("androidx.appcompat:appcompat:1.7.0")
// }
