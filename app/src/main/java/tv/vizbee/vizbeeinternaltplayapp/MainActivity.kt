package tv.vizbee.vizbeeinternaltplayapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import tv.vizbee.tplay.VizbeeTPlay
import tv.vizbee.tplay.VizbeeTPlayOptions
import tv.vizbee.vizbeeinternaltplayapp.ui.components.TMobilePlayTopBar
import tv.vizbee.vizbeeinternaltplayapp.ui.screens.HomeScreen
import tv.vizbee.vizbeeinternaltplayapp.ui.theme.TMobilePlayTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val tPlayOptions = VizbeeTPlayOptions()
        tPlayOptions.debugMode = true
        VizbeeTPlay.init(
            application,
            "vzb2379701350",
            tPlayOptions
        )

        setContent {
            TMobilePlayApp()
        }
    }
}

@Composable
fun TMobilePlayApp() {
    TMobilePlayTheme {
        Scaffold(
            topBar = { TMobilePlayTopBar() }
        ) { paddingValues ->
            HomeScreen(Modifier.padding(paddingValues))
        }
    }
}