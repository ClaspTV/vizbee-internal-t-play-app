package tv.vizbee.vizbeeinternaltplayapp.ui.theme

import android.content.Context
import android.view.ContextThemeWrapper
import tv.vizbee.tplay.CastButton
import tv.vizbee.vizbeeinternaltplayapp.R

fun createStyledCastButton(context: Context): CastButton {

    val themeWrapper = ContextThemeWrapper(context, R.style.Custom_RemoteButton_TMobilePlay)
    
    return CastButton(themeWrapper).apply {}
}