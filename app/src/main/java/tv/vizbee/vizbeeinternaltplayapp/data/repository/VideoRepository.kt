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
        Video(
            id = "https://watch.plex.tv/show/weeds/season/5/episode/10",
            title = "Weeds S5 E10",
            subtitle = "Plex • Show",
            thumbnailUrl = "https://images.plex.tv/photo?size=medium-360&scale=2&url=https%3A%2F%2Fimage.tmdb.org%2Ft%2Fp%2Foriginal%2F4tw4uoXdhmOaHSxzNHWpFv9jGvl.jpg",
            contentType = ContentType.TV_SHOW
        ),
        Video(
            id = "https://watch.plex.tv/show/mythbusters/season/2/episode/7",
            title = "MythBusters S2 E7",
            subtitle = "Plex • Show",
            thumbnailUrl = "https://images.plex.tv/photo?size=medium-360&scale=2&url=https%3A%2F%2Fmetadata-static.plex.tv%2F8%2Fgracenote%2F8645e0ab7fea21f57afed262695bfe75.jpg",
            contentType = ContentType.TV_SHOW
        ),
        Video(
            id = "https://watch.plex.tv/show/spartacus/season/1/episode/1",
            title = "Spartacus S1 E1",
            subtitle = "Plex • Show",
            thumbnailUrl = "https://images.plex.tv/photo?size=medium-360&scale=2&url=https%3A%2F%2Fmetadata-static.plex.tv%2F5%2Fgracenote%2F56170662a6ad3c74d307dd231b15cd8a.jpg",
            contentType = ContentType.TV_SHOW
        ),

        // TBS Content
        Video(
            id = "https://tbs.app.link/LwvNLbpFj8",
            title = "Lost Resort (S1E1)",
            subtitle = "TBS • Show",
            thumbnailUrl = "https://images.plex.tv/photo?size=medium-360&scale=2&url=https%3A%2F%2Fimage.tmdb.org%2Ft%2Fp%2Foriginal%2FdIlcEDZNo6fBjPqbfOypCeaHd2w.jpg",
            contentType = ContentType.TV_SHOW
        ),
        Video(
            id = "https://tbs.app.link/QyCVj8czCS",
            title = "Friends",
            subtitle = "TBS • Show",
            thumbnailUrl = "https://images.plex.tv/photo?size=medium-360&scale=2&url=https%3A%2F%2Fimage.tmdb.org%2Ft%2Fp%2Foriginal%2F2koX1xLkpTQM4IZebYvKysFW1Nh.jpg",
            contentType = ContentType.TV_SHOW
        ),
        Video(
            id = "https://tbs.app.link/Ln2XTeYvojb",
            title = "Ready Player One",
            subtitle = "TBS • Movie",
            thumbnailUrl = "https://images.plex.tv/photo?size=medium-360&scale=2&url=https%3A%2F%2Fmetadata-static.plex.tv%2F3%2Fgracenote%2F3b12c25bdfba029dafc2fbad954f9ac5.jpg",
            contentType = ContentType.MOVIE
        ),
        Video(
            id = "https://tbs.app.link/Nlf03PMrdNb",
            title = "The Goonies",
            subtitle = "TBS • Movie",
            thumbnailUrl = "https://images.plex.tv/photo?size=medium-360&scale=2&url=https%3A%2F%2Fmetadata-static.plex.tv%2Fe%2Fgracenote%2Fefbb6903d012147d22d5a1f9c701ba79.jpg",
            contentType = ContentType.MOVIE
        ),
        Video(
            id = "https://tbs.app.link/3WBd8kdi61",
            title = "The Wizard of Oz",
            subtitle = "TBS • Movie",
            thumbnailUrl = "https://images.plex.tv/photo?size=medium-360&scale=2&url=https%3A%2F%2Fmetadata-static.plex.tv%2Fe%2Fgracenote%2Fefbb6903d012147d22d5a1f9c701ba79.jpg",
            contentType = ContentType.MOVIE
        ),

        Video(
            id = "https://tbs.app.link/2qtkGJkdY0",
            title = "A Christmas Story",
            subtitle = "TBS • Movie",
            thumbnailUrl = "https://images.plex.tv/photo?size=medium-360&scale=2&url=https%3A%2F%2Fmetadata-static.plex.tv%2F3%2Fgracenote%2F3a4f1936dca41b08c0518aec1347b05b.jpg",
            contentType = ContentType.MOVIE
        ),
        Video(
            id = "https://tbs.app.link/sfQ79CcqkBb",
            title = "My Spy",
            subtitle = "TBS • Movie",
            thumbnailUrl = "https://images.plex.tv/photo?size=medium-360&scale=2&url=https%3A%2F%2Fmetadata-static.plex.tv%2Fe%2Fgracenote%2Fea032a80c35ae7f663b60fa93e8ccdbd.jpg",
            contentType = ContentType.MOVIE
        ),

        // TNT Content
        Video(
            id = "https://tnt.app.link/BSEl6gDZJ5",
            title = "The Alienist S1 E1 The Boy on the Bridge",
            subtitle = "TNT • TV Show",
            thumbnailUrl = "https://images.plex.tv/photo?size=medium-360&scale=2&url=https%3A%2F%2Fimage.tmdb.org%2Ft%2Fp%2Foriginal%2F1qzuS7b2XjiVcWwmDkOyE5hIxUM.jpg",
            contentType = ContentType.TV_SHOW
        ),
        Video(
            id = "https://tnt.app.link/BfSpMekyFrb",
            title = "Creed II",
            subtitle = "TNT • Movie",
            thumbnailUrl = "https://images.plex.tv/photo?size=medium-360&scale=2&url=https%3A%2F%2Fmetadata-static.plex.tv%2F8%2Fgracenote%2F80c056ac7e6281be234c94abb48480db.jpg",
            contentType = ContentType.MOVIE
        ),
        Video(
            id = "https://tnt.app.link/XqntkkTj4tb",
            title = "The Lazarus Project S1 E1",
            subtitle = "TNT • Show",
            thumbnailUrl = "https://images.plex.tv/photo?size=medium-360&scale=2&url=https%3A%2F%2Fimage.tmdb.org%2Ft%2Fp%2Foriginal%2FilfIn5DGgZMJbJi9rwfJp3wKc0C.jpg",
            contentType = ContentType.TV_SHOW
        ),
        Video(
            id = "https://tnt.app.link/g59DjIQ3Dcb",
            title = "Avengers: End Game",
            subtitle = "TNT • Movie",
            thumbnailUrl = "https://images.plex.tv/photo?size=medium-360&scale=2&url=https%3A%2F%2Fmetadata-static.plex.tv%2Fa%2Fgracenote%2Fa607d7f6f2d86d5b99b57d70e46102c1.jpg",
            contentType = ContentType.MOVIE
        ),
        Video(
            id = "https://tnt.app.link/JZTAidR0pJb",
            title = "Die Hard",
            subtitle = "TNT • Movie",
            thumbnailUrl = "https://images.plex.tv/photo?size=medium-360&scale=2&url=https%3A%2F%2Fmetadata-static.plex.tv%2F5%2Fgracenote%2F5295f9b6a1ff36985135ea39189f33f1.jpg",
            contentType = ContentType.MOVIE
        ),
    )
}