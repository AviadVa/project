package hackeru.lesson.project.service.dto

import com.google.gson.annotations.SerializedName


// dto = data transfer object
// this is how we get the data from the API
//עושים את זה במצבים שאני לא רוצה לשמור ישר את המידע מהAPI אלא אני רוצה לעשות קודם שינוים ואז לשמור
//  אז המידע מהAPI נמצע ב- class Movie בתוך entity

data class MovieDTO(
    val adult: Boolean,
    @SerializedName("backdrop_path")
    val backdropPath: String,
    @SerializedName("genre_ids")
    val genreIds: List<Int>,
    val id: Int,
    @SerializedName("original_language")
    val originalLanguage: String,
    @SerializedName("original_title")
    val originalTitle: String,
    val overview: String,
    val popularity: Double,
    @SerializedName("poster_path")
    val posterPath: String,
    @SerializedName("release_date")
    val releaseDate: String,
    val title: String,
    val video: Boolean,
    @SerializedName("vote_average")
    val voteAverage: Double,
    @SerializedName("vote_count")
    val voteCount: Int
)