package tv.vizbee.vizbeeinternaltplayapp.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.items
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import tv.vizbee.vizbeeinternaltplayapp.ui.components.VideoCard
import tv.vizbee.vizbeeinternaltplayapp.ui.viewmodel.VideoViewModel

@Composable
fun HomeScreen(
    modifier: Modifier = Modifier,
    viewModel: VideoViewModel = viewModel()
) {
    val videos by viewModel.videos.collectAsState()
    val context = LocalContext.current

    LazyColumn(
        modifier = modifier.fillMaxSize(),
        contentPadding = PaddingValues(16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        items(videos) { video ->
            VideoCard(
                video = video,
                onPlayClick = { selectedVideo ->
                    viewModel.startVideoPlayback(context, selectedVideo)
                }
            )
        }

    }
}