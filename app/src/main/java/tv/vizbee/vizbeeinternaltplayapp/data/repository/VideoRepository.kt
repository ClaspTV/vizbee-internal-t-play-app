package tv.vizbee.vizbeeinternaltplayapp.data.repository

import tv.vizbee.vizbeeinternaltplayapp.data.model.ContentType
import tv.vizbee.vizbeeinternaltplayapp.data.model.Video

class VideoRepository {
    fun getSampleVideos(): List<Video> = listOf(

        // Plex Content
        Video(
            id = "https://watch.plex.tv/movie/wind-river-2017",
            title = "Wind River",
            subtitle = "Plex • Movie",
            thumbnailUrl = "https://images.plex.tv/photo?size=medium-360&scale=2&url=https%3A%2F%2Fmetadata-static.plex.tv%2F2%2Fgracenote%2F280a74dc94608b76fd7c8332bbadfb2d.jpg",
            contentType = ContentType.MOVIE
        ),
        Video(
            id = "https://watch.plex.tv/movie/the-pianist",
            title = "The Pianist",
            subtitle = "Plex • Movie",
            thumbnailUrl = "https://images.plex.tv/photo?size=medium-360&scale=2&url=https%3A%2F%2Fmetadata-static.plex.tv%2F7%2Fgracenote%2F77f9da0ff74fdec95df93cb9214bce44.jpg",
            contentType = ContentType.MOVIE
        ),
        Video(
            id = "https://watch.plex.tv/movie/the-founder",
            title = "The Founder",
            subtitle = "Plex • Movie",
            thumbnailUrl = "https://images.plex.tv/photo?size=medium-360&scale=2&url=https%3A%2F%2Fmetadata-static.plex.tv%2Fc%2Fgracenote%2Fc556c4a2dc265cfa5ee451a83a34bccd.jpg",
            contentType = ContentType.MOVIE
        ),

        // TBS Content
        Video(
            id = "https://tbs.app.link/2qtkGJkdY0",
            title = "A Christmas Story",
            subtitle = "TBS • Movie",
            thumbnailUrl = "https://images.plex.tv/photo?size=medium-360&scale=2&url=https%3A%2F%2Fmetadata-static.plex.tv%2F3%2Fgracenote%2F3a4f1936dca41b08c0518aec1347b05b.jpg",
            contentType = ContentType.MOVIE
        ),
        Video(
            id = "https://tbs.app.link/3WBd8kdi61",
            title = "Thor: Ragnarok",
            subtitle = "TBS • Movie",
            thumbnailUrl = "https://images.plex.tv/photo?size=medium-360&scale=2&url=https%3A%2F%2Fmetadata-static.plex.tv%2F3%2Fgracenote%2F3379d8ba00680490afed55f725cf04e1.jpg",
            contentType = ContentType.MOVIE
        ),
        Video(
            id = "https://tbs.app.link/sfQ79CcqkBb",
            title = "My Spy",
            subtitle = "TBS • Movie",
            thumbnailUrl = "https://images.plex.tv/photo?size=medium-360&scale=2&url=https%3A%2F%2Fmetadata-static.plex.tv%2Fe%2Fgracenote%2Fea032a80c35ae7f663b60fa93e8ccdbd.jpg",
            contentType = ContentType.MOVIE
        ),
        Video(
            id = "https://tbs.app.link/VRLNChjknNb",
            title = "Impractical Jokers S11 E9 One for the books",
            subtitle = "TBS • TV Show",
            thumbnailUrl = "https://images.plex.tv/photo?size=medium-360&scale=2&url=https%3A%2F%2Fimage.tmdb.org%2Ft%2Fp%2Foriginal%2F7ZGhfLbGUijD9OxPtBuA8xAE7Bi.jpg",
            contentType = ContentType.TV_SHOW
        ),

        // TNT Content
        Video(
            id = "https://tnt.app.link/PV4S6SbYtN",
            title = "The Alienist S1 E1 The Boy on the Bridge",
            subtitle = "TNT • TV Show",
            thumbnailUrl = "https://images.plex.tv/photo?size=medium-360&scale=2&url=https%3A%2F%2Fimage.tmdb.org%2Ft%2Fp%2Foriginal%2F1qzuS7b2XjiVcWwmDkOyE5hIxUM.jpg",
            contentType = ContentType.TV_SHOW
        ),
        Video(
            id = "https://tnt.app.link/dAUfOVWCw8",
            title = "Ant-Man and the Wasp",
            subtitle = "TNT • Movie",
            thumbnailUrl = "https://images.plex.tv/photo?size=medium-360&scale=2&url=https%3A%2F%2Fmetadata-static.plex.tv%2Fa%2Fgracenote%2Fa376b5578f1970bc88af148477338dcc.jpg",
            contentType = ContentType.MOVIE
        ),
    )
}