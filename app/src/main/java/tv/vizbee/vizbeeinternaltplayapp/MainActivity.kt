package tv.vizbee.vizbeeinternaltplayapp

import android.os.Bundle
import android.os.StrictMode
import android.os.StrictMode.ThreadPolicy
import android.os.StrictMode.VmPolicy
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import org.json.JSONObject
import tv.vizbee.api.VizbeeContext
import tv.vizbee.tplay.VizbeeTPlay
import tv.vizbee.tplay.VizbeeTPlayOptions
import tv.vizbee.vizbeeinternaltplayapp.analytics.VizbeeTPlayAnalyticsHandler
import tv.vizbee.vizbeeinternaltplayapp.ui.components.TMobilePlayTopBar
import tv.vizbee.vizbeeinternaltplayapp.ui.screens.HomeScreen
import tv.vizbee.vizbeeinternaltplayapp.ui.theme.TMobilePlayTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        StrictMode.setThreadPolicy(
            ThreadPolicy.Builder()
                .detectDiskReads()
                .detectDiskWrites()
                .detectAll()
                .penaltyLog()
//                .penaltyDeath() // This will crash the app - use carefully
                .build()
        )

        StrictMode.setVmPolicy(
            VmPolicy.Builder()
                .detectAll()
                .penaltyLog()
                .build()
        )

        val tPlayOptions = VizbeeTPlayOptions()
        tPlayOptions.debugMode = true
        VizbeeTPlay.init(
            application,
            "vzb2379701350",
            tPlayOptions
        )
        VizbeeTPlayAnalyticsHandler()
        VizbeeContext.getInstance().addCustomEventAttributes(JSONObject().apply {
            put("TMobile_SubscriberId", "tmobile-test-subscriber-id-12345")
        })
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