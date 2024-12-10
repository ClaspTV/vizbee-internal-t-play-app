package tv.vizbee.vizbeeinternaltplayapp.ui.components

import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.viewinterop.AndroidView
import tv.vizbee.vizbeeinternaltplayapp.R
import tv.vizbee.vizbeeinternaltplayapp.ui.theme.TMobileMagenta
import tv.vizbee.vizbeeinternaltplayapp.ui.theme.createStyledCastButton

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TMobilePlayTopBar() {
    TopAppBar(
        title = {
            Image(
                painter = painterResource(id = R.drawable.t_mobile_play_logo),
                contentDescription = "T-Mobile Play Logo",
                modifier = Modifier
                    .height(56.dp)
                    .width(162.dp)
                    .padding(start = 0.dp)
                    .padding(vertical = 8.dp),
                contentScale = ContentScale.Fit
            )
        },
        actions = {
            // Wrap the CastButton in AndroidView
            AndroidView(
                factory = { context ->
                    createStyledCastButton(context)
                }
            )
        }
    )
}
