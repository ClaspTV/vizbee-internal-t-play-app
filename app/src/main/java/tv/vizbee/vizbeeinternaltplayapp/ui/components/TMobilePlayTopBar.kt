package tv.vizbee.vizbeeinternaltplayapp.ui.components

import android.util.Log
import androidx.compose.material3.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Settings
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import androidx.compose.ui.viewinterop.AndroidView
import tv.vizbee.tplay.CastButton

import tv.vizbee.vizbeeinternaltplayapp.ui.theme.TMobileMagenta
import tv.vizbee.vizbeeinternaltplayapp.ui.theme.createStyledCastButton

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TMobilePlayTopBar() {
    TopAppBar(
        title = {
            Text(
                "T MobilePlay",
                color = TMobileMagenta,
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold
            )
        },
//        navigationIcon = {
//            IconButton(onClick = { /* Handle settings click */ }) {
//                Icon(Icons.Default.Settings, contentDescription = "Settings")
//            }
//        },
        actions = {
            // Wrap the CastButton in AndroidView
            AndroidView(
                factory = { context ->
                    createStyledCastButton(context)
                },
                update = { castButton ->
                    // Optional: Update the cast button if needed based on state changes
                    Log.i("VZBTPLAYAPP::CastButton", "Cast button state changed ${castButton.stateDescription}" )
                    castButton.setDrawableTintColor("#FFCCC2DC")
                }
            )
        }
    )
}
