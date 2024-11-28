package tv.vizbee.vizbeeinternaltplayapp.ui.viewmodel

import android.content.Context
import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import tv.vizbee.tplay.StartVideoError
import tv.vizbee.tplay.StartVideoResult
import tv.vizbee.tplay.TPlayVideoInfo
import tv.vizbee.tplay.VizbeeTPlay
import tv.vizbee.vizbeeinternaltplayapp.data.model.Video
import tv.vizbee.vizbeeinternaltplayapp.data.repository.VideoRepository

class VideoViewModel : ViewModel() {
    private val repository = VideoRepository()
    
    private val _videos = MutableStateFlow<List<Video>>(emptyList())
    val videos: StateFlow<List<Video>> = _videos.asStateFlow()

    private val _playbackState = MutableStateFlow<StartVideoResult?>(null)
    val playbackState: StateFlow<StartVideoResult?> = _playbackState.asStateFlow()

    init {
        loadVideos()
    }

    private fun loadVideos() {
        _videos.value = repository.getSampleVideos()
    }

    fun startVideoPlayback(context: Context, video: Video) {
        viewModelScope.launch {
            try {
                val videoInfo = createVideoInfo(video)
                val result = startVideo(context, videoInfo)
                _playbackState.value = result
                handlePlaybackResult(result)
            } catch (e: Exception) {
                Log.e("VideoViewModel", "Error starting video", e)
                // Handle any unexpected errors
            }
        }
    }

    private fun createVideoInfo(video: Video): TPlayVideoInfo {
        return TPlayVideoInfo(
            title = video.title,
            subtitle = video.subtitle,
            mobileDeepLinkUrl = video.id,
            imageUrl = video.thumbnailUrl
        )
    }

    private suspend fun startVideo(context: Context, videoInfo: TPlayVideoInfo): StartVideoResult {
        return VizbeeTPlay.getInstance().startVideo(context, videoInfo)
    }

    private fun handlePlaybackResult(result: StartVideoResult) {
        when (result) {
            is StartVideoResult.Success -> handleSuccessResult(result)
            is StartVideoResult.Failure -> handleFailureResult(result)
        }
    }

    private fun handleSuccessResult(result: StartVideoResult.Success) {
        when (result.destination) {
            StartVideoResult.Destination.TV -> {
                Log.d("VideoViewModel", "Video playing on TV")
            }
            StartVideoResult.Destination.MOBILE -> {
                Log.d("VideoViewModel", "Video playing on mobile")
            }
        }
    }

    private fun handleFailureResult(result: StartVideoResult.Failure) {
        when (result.error) {
            is StartVideoError.DeviceSelectionError -> {
                Log.e("VideoViewModel", "Device selection error: ${result.error.message}")
            }
            is StartVideoError.DeviceConnectionError -> {
                val connectionError = result.error as StartVideoError.DeviceConnectionError
                Log.e(
                    "VideoViewModel",
                    "Connection error: ${connectionError.message}, reason: ${connectionError.reason}"
                )
            }
            is StartVideoError.DeviceConnectionCancelled -> {
                Log.e("VideoViewModel", "Connection cancelled: ${result.error.message}")
            }
            is StartVideoError.UnknownError -> {
                Log.e("VideoViewModel", "Unknown error: ${result.error.message}")
            }
        }
    }
}