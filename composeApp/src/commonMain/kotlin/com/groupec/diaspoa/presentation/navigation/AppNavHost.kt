package com.groupec.sampleapp.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.groupec.diaspoa.presentation.navigation.Graph
import com.groupec.diaspoa.presentation.navigation.Routes
import com.groupec.diaspoa.presentation.screens.account.AccountScreen
import com.groupec.diaspoa.presentation.screens.home.HomeScreen
import com.groupec.diaspoa.presentation.screens.shopping.ShoppingScreen


// Define the main structure for navigation
@Composable
fun AppNavHost(
    modifier: Modifier,
    navController: NavHostController
) {
    NavHost(
        modifier = modifier,
        navController = navController,
        startDestination = Graph.NAVIGATION_BAR_SCREEN_GRAPH,
    ) {
        mainNavGraph(navController = navController)
        /*composable(
            route = Routes.HomeDetail.route,
        ) {
            rootNavController.previousBackStackEntry?.savedStateHandle?.get<String>("name")?.let { name ->
                HomeDetailScreen(rootNavController = rootNavController, name = name)
            }
        }*/
    }
}

// Handle the individual navigation routes. (for BottomBar)
fun NavGraphBuilder.mainNavGraph(
    navController: NavHostController
) {
    navigation(
        startDestination = Routes.Home.route,
        route = Graph.NAVIGATION_BAR_SCREEN_GRAPH
    ) {
        composable(route = Routes.Home.route) {
            HomeScreen(
                navigateToOneTimeShoppingDetails = {
                    // navController.navigate(NavigationItem.Detail.route)
                },
                navigateToProjectTrackingDetails = {

                }
            )
        }
        composable(route = Routes.Shopping.route) {
            ShoppingScreen()
        }
        composable(route = Routes.Project.route) {
            ShoppingScreen()
        }
        composable(route = Routes.Account.route) {
            AccountScreen()
        }
    }
}