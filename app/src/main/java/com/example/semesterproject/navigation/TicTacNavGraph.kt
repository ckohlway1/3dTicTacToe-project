package com.example.semesterproject.navigation

import com.example.semesterproject.screens.highScore.HighScoreScreen
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.runtime.Composable
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.semesterproject.screens.login.AccountView
import com.example.semesterproject.screens.SettingView
import com.example.semesterproject.screens.gameSelect.GameSelectView
import com.example.semesterproject.screens.gameSelect.GameSelectViewModel
import com.example.semesterproject.screens.mainMenu.MainMenuView

@ExperimentalComposeUiApi
@ExperimentalFoundationApi
@Composable
fun TicTacNavGraph (navController: NavHostController = rememberNavController(), ){
    val vm: GameSelectViewModel = viewModel()
    NavHost(
        navController = navController,
        startDestination = Routes.Login.route
    )
    {
        composable(Routes.Login.route){
            AccountView(navController)
        }
        composable(Routes.MainMenu.route){
            MainMenuView(navController)
        }
        composable(Routes.HighScores.route){
            HighScoreScreen()
        }
        composable(Routes.SettingScreen.route){
            SettingView()
        }
        composable(Routes.GameSelect.route){
            GameSelectView(
                vm.games,
                addGame = {vm.addGame(it)}
            )
        }
        //TODO-Add paths for game modes
    }
}