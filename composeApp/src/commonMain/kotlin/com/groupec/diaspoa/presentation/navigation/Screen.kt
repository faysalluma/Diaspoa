package com.groupec.sampleapp.navigation

enum class Screen {
    Home,
    Detail
}
sealed class NavigationItem(val route: String) {
    data object Home : NavigationItem(Screen.Home.name)
    data object Detail : NavigationItem(Screen.Detail.name)
}