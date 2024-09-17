// plugins {
//     id("com.android.application") version "8.6.0" apply false
//     id("com.android.library") version "8.6.0" apply false
//     id("org.jetbrains.kotlin.android") version "1.9.24" apply false
// }



plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.android.library) apply false
    alias(libs.plugins.org.jetbrains.kotlin.android) apply false
    alias(libs.plugins.compose.compiler) apply false
}
