package tv.vizbee.vizbeeinternaltplayapp.analytics

import tv.vizbee.tplay.analytics.VizbeeTPlayAnalyticsEvent
import tv.vizbee.tplay.analytics.VizbeeTPlayAnalyticsListener
import tv.vizbee.tplay.analytics.VizbeeTPlayAnalyticsManager
import tv.vizbee.utils.Logger

/**
 * Handler for T-Play Analytics events that provides detailed logging
 * and can be extended for custom analytics integrations.
 */
class VizbeeTPlayAnalyticsHandler : VizbeeTPlayAnalyticsListener {
    private val tag = "VZBTPLAY::Analytics"

    init {
        VizbeeTPlayAnalyticsManager.getInstance().addListener(this)
    }

    override fun onEvent(event: VizbeeTPlayAnalyticsEvent) {
        when (event) {
            // Device Selection Events
            is VizbeeTPlayAnalyticsEvent.DeviceSelectionDialogShown -> {
                Logger.i(tag, "Device selection dialog shown with ${event.devices.size} devices:")
                event.devices.forEach { device ->
                    Logger.i(tag, "- ${device.friendlyName} (${device.modelName}, ${device.manufacturer})")
                }
            }

            is VizbeeTPlayAnalyticsEvent.DeviceSelectionDialogUpdated -> {
                Logger.i(tag, "Device selection dialog updated with ${event.devices.size} devices:")
                event.devices.forEach { device ->
                    Logger.i(tag, "- ${device.friendlyName} (${device.modelName}, ${device.manufacturer})")
                }
            }

            is VizbeeTPlayAnalyticsEvent.DeviceSelectionDialogDismissed -> {
                Logger.i(tag, "Device selection dialog dismissed")
            }

            // User Selection Events
            is VizbeeTPlayAnalyticsEvent.UserSelection.TVSelected -> {
                Logger.i(tag, "User selected TV device: " +
                        "${event.device.friendlyName} (${event.device.modelName}, ${event.device.manufacturer})")
            }

            is VizbeeTPlayAnalyticsEvent.UserSelection.MobileSelected -> {
                Logger.i(tag, "User selected to watch on mobile")
            }

            // TV Connection Events
            is VizbeeTPlayAnalyticsEvent.TVConnection.Connecting -> {
                Logger.i(tag, "Connecting to TV device: " +
                        "${event.device.friendlyName} (${event.device.modelName}, ${event.device.manufacturer})")
            }

            is VizbeeTPlayAnalyticsEvent.TVConnection.Connected -> {
                Logger.i(tag, "Connected to TV device: " +
                        "${event.device.friendlyName} (${event.device.modelName}, ${event.device.manufacturer})")
            }

            is VizbeeTPlayAnalyticsEvent.TVConnection.Disconnected -> {
                Logger.i(tag, "Disconnected from TV device: " +
                        "${event.device.friendlyName} (${event.device.modelName}, ${event.device.manufacturer})")
            }

            is VizbeeTPlayAnalyticsEvent.TVConnection.Failed -> {
                Logger.e(tag, "Failed to connect to TV device: " +
                        "${event.device.friendlyName} (${event.device.modelName}, ${event.device.manufacturer}). Error: ${event.error}")
            }

            // Video Playback Events
            is VizbeeTPlayAnalyticsEvent.VideoStateChanged -> {
                val timeInfo = if (event.duration > 0) {
                    " [${formatTime(event.position)}/${formatTime(event.duration)}]"
                } else ""

                when (event.state) {
                    VizbeeTPlayAnalyticsEvent.VideoState.STARTED -> {
                        Logger.i(tag, "Video started: [${event.videoTitle}] (${event.videoDeepLink})$timeInfo")
                    }
                    VizbeeTPlayAnalyticsEvent.VideoState.PLAYING -> {
                        Logger.i(tag, "Video playing: [${event.videoTitle}]$timeInfo")
                    }
                    VizbeeTPlayAnalyticsEvent.VideoState.PAUSED -> {
                        Logger.i(tag, "Video paused: [${event.videoTitle}]$timeInfo")
                    }
                    VizbeeTPlayAnalyticsEvent.VideoState.LOADING -> {
                        Logger.i(tag, "Video loading: [${event.videoTitle}]$timeInfo")
                    }
                    VizbeeTPlayAnalyticsEvent.VideoState.BUFFERING -> {
                        Logger.i(tag, "Video buffering: [${event.videoTitle}]$timeInfo")
                    }
                    VizbeeTPlayAnalyticsEvent.VideoState.ENDED -> {
                        Logger.i(tag, "Video ended: [${event.videoTitle}]$timeInfo")
                    }
                    VizbeeTPlayAnalyticsEvent.VideoState.STOPPED -> {
                        Logger.i(tag, "Video stopped: [${event.videoTitle}]$timeInfo")
                    }
                    VizbeeTPlayAnalyticsEvent.VideoState.STOPPED_ON_DISCONNECT -> {
                        Logger.i(tag, "Video stopped on disconnect: [${event.videoTitle}]$timeInfo")
                    }
                    VizbeeTPlayAnalyticsEvent.VideoState.ERROR -> {
                        Logger.e(tag, "Video error: [${event.videoTitle}]. Error: ${event.error}$timeInfo")
                    }
                    VizbeeTPlayAnalyticsEvent.VideoState.UNKNOWN -> {
                        Logger.w(tag, "Unknown video state: [${event.videoTitle}]$timeInfo")
                    }
                }
            }
        }
    }

    private fun formatTime(milliseconds: Long): String {
        val seconds = milliseconds / 1000
        val minutes = seconds / 60
        val hours = minutes / 60
        return if (hours > 0) {
            String.format("%d:%02d:%02d", hours, minutes % 60, seconds % 60)
        } else {
            String.format("%02d:%02d", minutes, seconds % 60)
        }
    }
}