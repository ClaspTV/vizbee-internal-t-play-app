package tv.vizbee.vizbeeinternaltplayapp.ui.theme

import android.app.Activity
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.platform.LocalView
import androidx.core.view.WindowCompat

private val DarkColorScheme = darkColorScheme(
    primary = TMobileMagenta,
    secondary = PurpleGrey80,
    tertiary = Pink80,
    background = Color(0xFF000000),
    surface = Color(0xFF1C1C1C)
)

@Composable
fun TMobilePlayTheme(
    content: @Composable () -> Unit
) {
    val view = LocalView.current
    SideEffect {
        val window = (view.context as Activity).window
        window.statusBarColor = Color.Black.toArgb()
        WindowCompat.getInsetsController(window, view).isAppearanceLightStatusBars = false
    }

    MaterialTheme(
        colorScheme = DarkColorScheme,
        content = content
    )
}