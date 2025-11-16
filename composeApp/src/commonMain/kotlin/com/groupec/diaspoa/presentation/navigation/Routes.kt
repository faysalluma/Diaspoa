package com.groupec.diaspoa.presentation.navigation
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.Assignment
import androidx.compose.material.icons.automirrored.outlined.Assignment
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material.icons.outlined.AccountCircle
import androidx.compose.material.icons.outlined.Assessment
import androidx.compose.material.icons.outlined.Assignment
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.Person
import androidx.compose.material.icons.outlined.ShoppingCart
import diaspoa.composeapp.generated.resources.Res
import diaspoa.composeapp.generated.resources.account
import diaspoa.composeapp.generated.resources.shopping
import diaspoa.composeapp.generated.resources.home
import diaspoa.composeapp.generated.resources.projects

object Graph {
    const val NAVIGATION_BAR_SCREEN_GRAPH = "navigationBarScreenGraph"
}

sealed class Routes(var route: String) {
    data object Home : Routes("home")
    data object Shopping : Routes("shopping")
    data object Project : Routes("project")
    data object Account : Routes("account")
    data object HomeDetail : Routes("homeDetail")
    data object SettingDetail : Routes("settingDetail")
}

val navigationItemsLists = listOf(
    NavigationItem(
        unSelectedIcon = Icons.Outlined.Home,
        selectedIcon = Icons.Filled.Home,
        title = Res.string.home ,
        route = Routes.Home.route,
    ),
    NavigationItem(
        unSelectedIcon = Icons.Outlined.ShoppingCart,
        selectedIcon = Icons.Filled.ShoppingCart,
        title = Res.string.shopping,
        route = Routes.Shopping.route,
    ),
    NavigationItem(
        unSelectedIcon = Icons.AutoMirrored.Outlined.Assignment,
        selectedIcon =  Icons.AutoMirrored.Filled.Assignment,
        title = Res.string.projects,
        route = Routes.Project.route,
    ),
    NavigationItem(
        unSelectedIcon = Icons.Outlined.Person,
        selectedIcon = Icons.Filled.Person,
        title = Res.string.account,
        route = Routes.Account.route,
    ),
)