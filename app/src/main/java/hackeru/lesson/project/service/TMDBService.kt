package hackeru.lesson.project.service

import hackeru.lesson.project.service.dto.MovieResponse
import hackeru.lesson.project.utils.TokenInterceptor
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET


// this is my Retrofit file
interface TMDBService {


//https://api.themoviedb.org/3/discover/movie?api_key=b3b1492d3e91e9f9403a2989f3031b0c



    //this is a suspend function so we can later
    @GET("discover/movie")
    suspend fun getMovies(): MovieResponse


    companion object {
        fun create(): TMDBService {
            //תופס את כל הבקשות ומדפיס ללוג
            // לא באמת צריכים את זה, זה רק בשבילי לבדוק שהכל תקין
            val logger = HttpLoggingInterceptor()
            logger.level = HttpLoggingInterceptor.Level.BODY


            // תופס את כל הבקשות ומוסיף את ה- Api Key
            val client = OkHttpClient.Builder()
                .addInterceptor(TokenInterceptor())
                .addInterceptor(logger)
                .build()

            //זה כדי להגדיר את ה- URL
            return Retrofit.Builder()
                .client(client)
                .baseUrl("https://api.themoviedb.org/3/")
                .addConverterFactory(GsonConverterFactory.create())
                .build().create(TMDBService::class.java)
        }
    }
}