package tv.vizbee.vizbeeinternaltplayapp.data.repository

import tv.vizbee.vizbeeinternaltplayapp.data.model.ContentType
import tv.vizbee.vizbeeinternaltplayapp.data.model.Video

class VideoRepository {
    fun getSampleVideos(): List<Video> = listOf(

        // Plex Content
        Video(
            id = "https://watch.plex.tv/show/spartacus/season/1/episode/1",
            title = "Spartacus S1 E1",
            subtitle = "Plex • Show",
            thumbnailUrl = "https://images.plex.tv/photo?size=medium-360&scale=2&url=https%3A%2F%2Fmetadata-static.plex.tv%2F5%2Fgracenote%2F56170662a6ad3c74d307dd231b15cd8a.jpg",
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
            id = "https://watch.plex.tv/show/weeds/season/5/episode/10",
            title = "Weeds S5 E10",
            subtitle = "Plex • Show",
            thumbnailUrl = "https://images.plex.tv/photo?size=medium-360&scale=2&url=https%3A%2F%2Fimage.tmdb.org%2Ft%2Fp%2Foriginal%2F4tw4uoXdhmOaHSxzNHWpFv9jGvl.jpg",
            contentType = ContentType.TV_SHOW
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
            id = "https://watch.plex.tv/show/the-drew-carey-show/season/1/episode/1",
            title = "The Drew Carey Show S1E1",
            subtitle = "Plex • Show",
            thumbnailUrl = "https://images.plex.tv/photo?size=medium-360&scale=2&url=https%3A%2F%2Fmetadata-static.plex.tv%2Fd%2Fgracenote%2Fd31913ccc1c931400d20eeeaaa4c2c42.jpg",
            contentType = ContentType.TV_SHOW
        ),
        Video(
            id = "https://watch.plex.tv/movie/the-best-of-enemies-2019",
            title = "The Best of Enemies",
            subtitle = "Plex • Movie",
            thumbnailUrl = "https://images.plex.tv/photo?size=medium-360&scale=2&url=https%3A%2F%2Fmetadata-static.plex.tv%2F2%2Fgracenote%2F2aa65b00cde47a4e08105223a4c14c87.jpg",
            contentType = ContentType.MOVIE
        ),
        Video(
            id = "https://watch.plex.tv/movie/limitless",
            title = "Limitless",
            subtitle = "Plex • Movie",
            thumbnailUrl = "https://images.plex.tv/photo?size=medium-360&scale=2&url=https%3A%2F%2Fimage.tmdb.org%2Ft%2Fp%2Foriginal%2F1Zst36lKbFqK6YFLFRRtJodKajs.jpg",
            contentType = ContentType.MOVIE
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
            id = "https://tbs.app.link/orvitTXCf0",
            title = "Friends (S5E8)",
            subtitle = "TBS • Show",
            thumbnailUrl = "https://images.plex.tv/photo?size=medium-360&scale=2&url=https%3A%2F%2Fimage.tmdb.org%2Ft%2Fp%2Foriginal%2F2koX1xLkpTQM4IZebYvKysFW1Nh.jpg",
            contentType = ContentType.TV_SHOW
        ),
        Video(
            id = "https://tbs.app.link/ISQZopO0v7",
            title = "Avengers: Infinity War",
            subtitle = "TBS • Movie",
            thumbnailUrl = "https://images.plex.tv/photo?size=medium-360&scale=2&url=https%3A%2F%2Fmetadata-static.plex.tv%2Ff%2Fgracenote%2Ff96f07ec630498331baea1793794342f.jpg",
            contentType = ContentType.MOVIE
        ),
        Video(
            id = "https://tbs.app.link/8TH3hy0WScb",
            title = "Avengers: Endgame",
            subtitle = "TBS • Movie",
            thumbnailUrl = "https://images.plex.tv/photo?size=medium-360&scale=2&url=https%3A%2F%2Fmetadata-static.plex.tv%2Fa%2Fgracenote%2Fa607d7f6f2d86d5b99b57d70e46102c1.jpg",
            contentType = ContentType.MOVIE
        ),
        Video(
            id = "https://tbs.app.link/EtepnoqzCS",
            title = "The Wizard of Oz",
            subtitle = "TBS • Movie",
            thumbnailUrl = "https://images.plex.tv/photo?size=medium-360&scale=2&url=https%3A%2F%2Fmetadata-static.plex.tv%2Fe%2Fgracenote%2Fefbb6903d012147d22d5a1f9c701ba79.jpg",
            contentType = ContentType.MOVIE
        ),
        Video(
            id = "https://tbs.app.link/i3Ec0Ks6CO",
            title = "Maleficent",
            subtitle = "TBS • Movie",
            thumbnailUrl = "https://images.plex.tv/photo?size=medium-360&scale=2&url=https%3A%2F%2Fmetadata-static.plex.tv%2F5%2Fgracenote%2F51e0fffcb5873c27b4c502327bf637e7.jpg",
            contentType = ContentType.MOVIE
        ),
        Video(
            id = "https://tbs.app.link/Igistrn9Ixb",
            title = "Mortal Combat",
            subtitle = "TBS • Movie",
            thumbnailUrl = "https://m.media-amazon.com/images/M/MV5BZmZmNjAxNmQtZjZlNS00YmZhLWJlMzgtNmYzZjYyMjQ0MmZhXkEyXkFqcGc@._V1_.jpg",
            contentType = ContentType.MOVIE
        ),
        Video(
            id = "https://tbs.app.link/wrYzsnpaEcb",
            title = "Captain Marvel",
            subtitle = "TBS • Movie",
            thumbnailUrl = "https://images.plex.tv/photo?size=medium-360&scale=2&url=https%3A%2F%2Fmetadata-static.plex.tv%2Fc%2Fgracenote%2Fc1b3e31b0fc32591cc3d56034200efed.jpg",
            contentType = ContentType.MOVIE
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
            id = "https://tnt.app.link/BfSpMekyFrb",
            title = "Creed II",
            subtitle = "TNT • Movie",
            thumbnailUrl = "https://images.plex.tv/photo?size=medium-360&scale=2&url=https%3A%2F%2Fmetadata-static.plex.tv%2F8%2Fgracenote%2F80c056ac7e6281be234c94abb48480db.jpg",
            contentType = ContentType.MOVIE
        ),
        Video(
            id = "https://tnt.app.link/deapgPo1v7",
            title = "Avengers: Infinity",
            subtitle = "TNT • Show",
            thumbnailUrl = "https://images.plex.tv/photo?size=medium-360&scale=2&url=https%3A%2F%2Fmetadata-static.plex.tv%2Ff%2Fgracenote%2Ff96f07ec630498331baea1793794342f.jpg",
            contentType = ContentType.MOVIE
        ),
        Video(
            id = "https://tnt.app.link/g59DjIQ3Dcb",
            title = "Avengers: End Game",
            subtitle = "TNT • Movie",
            thumbnailUrl = "https://images.plex.tv/photo?size=medium-360&scale=2&url=https%3A%2F%2Fmetadata-static.plex.tv%2Fa%2Fgracenote%2Fa607d7f6f2d86d5b99b57d70e46102c1.jpg",
            contentType = ContentType.MOVIE
        ),
        Video(
            id = "https://tnt.app.link/Za85uu9MScb",
            title = "Captain Marvel",
            subtitle = "TNT • Movie",
            thumbnailUrl = "https://images.plex.tv/photo?size=medium-360&scale=2&url=https%3A%2F%2Fmetadata-static.plex.tv%2Fc%2Fgracenote%2Fc1b3e31b0fc32591cc3d56034200efed.jpg",
            contentType = ContentType.MOVIE
        ),
        Video(
            id = "https://tnt.app.link/Te7RIDSRr0",
            title = "Maleficent",
            subtitle = "TNT • Movie",
            thumbnailUrl = "https://images.plex.tv/photo?size=medium-360&scale=2&url=https%3A%2F%2Fmetadata-static.plex.tv%2F5%2Fgracenote%2F51e0fffcb5873c27b4c502327bf637e7.jpg",
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