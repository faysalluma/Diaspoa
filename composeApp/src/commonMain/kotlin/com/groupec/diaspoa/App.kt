
import androidx.compose.runtime.Composable
import com.groupec.diaspoa.AppTheme
import com.groupec.diaspoa.presentation.MainScreen
import org.jetbrains.compose.ui.tooling.preview.Preview


@Composable
@Preview
fun App(
    darkTheme: Boolean,
    dynamicColor: Boolean
) {
    AppTheme(
        darkTheme = darkTheme,
        dynamicColor = dynamicColor
    ) {
        /*Scaffold(topBar = {
//            AppBar(
//                title = stringResource(Res.string.app_name),
//                canNavigateBack = navController.previousBackStackEntry != null,
//                navigateUp = { navController.navigateUp() }
//            )
//        })
//        {
//            AppNavHost(navController)
//        }*/

        MainScreen()
    }
}