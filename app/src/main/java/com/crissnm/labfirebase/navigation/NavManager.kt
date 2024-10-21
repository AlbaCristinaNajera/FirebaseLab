package com.crissnm.labfirebase.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.crissnm.labfirebase.view.Login.BlankView
import com.crissnm.labfirebase.view.Login.LoginView
import com.crissnm.labfirebase.view.Login.TabsView
import com.crissnm.labfirebase.view.notas.HomeView
import com.crissnm.labfirebase.viewmodel.LoginViewModel
import com.crissnm.labfirebase.viewmodel.NotesViewModel

@Composable
fun NavManager(loginViewModel: LoginViewModel,
               notesViewModel: NotesViewModel
){
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "blank") {
        composable("blank") {
            BlankView(navController = navController)
        }
        composable("login") {
            TabsView(navController = navController, loginViewModel = loginViewModel)
        }
        composable("home") {
            HomeView(navController = navController, viewModel = NotesViewModel())

        }
    }
}