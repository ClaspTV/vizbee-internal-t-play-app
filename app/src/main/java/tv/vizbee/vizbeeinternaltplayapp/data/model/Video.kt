package tv.vizbee.vizbeeinternaltplayapp.data.model

data class Video(
    val id: String,
    val title: String,
    val subtitle: String,
    val thumbnailUrl: String,
    val contentType: ContentType
)

enum class ContentType {
    MOVIE, TV_SHOW
}