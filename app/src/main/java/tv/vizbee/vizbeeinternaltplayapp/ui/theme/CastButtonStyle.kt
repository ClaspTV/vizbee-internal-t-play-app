package tv.vizbee.vizbeeinternaltplayapp.ui.theme

import android.content.Context
import android.view.ContextThemeWrapper
import androidx.compose.ui.graphics.toArgb
import tv.vizbee.tplay.CastButton
import tv.vizbee.vizbeeinternaltplayapp.R

fun createStyledCastButton(context: Context): CastButton {
    // Create a custom theme wrapper
    val themeWrapper = ContextThemeWrapper(context, R.style.Custom_RemoteButton_TMobilePlay)
    
    return CastButton(themeWrapper).apply {
        // Additional runtime customization if needed
        setDrawableTintColor("#FFE20074")
    }
}