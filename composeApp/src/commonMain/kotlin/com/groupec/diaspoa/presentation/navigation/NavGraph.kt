package com.groupec.sampleapp.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.groupec.sampleapp.ui.detail.DetailScreen
import com.groupec.sampleapp.ui.home.HomeScreen

@Composable
fun AppNavHost(
    navController: NavHostController,
    startDestination: String = NavigationItem.Home.route
) {
    NavHost(
        navController = navController,
        startDestination = startDestination
    ) {
        composable(route = NavigationItem.Home.route) {
            HomeScreen(
                navigateToDetails = {
                    navController.navigate(NavigationItem.Detail.route)
                }
            )
        }
        composable(route = NavigationItem.Detail.route) {
            DetailScreen(
                navigateToHome = {
                    navController.popBackStack()
                }
            )
        }
    }
}