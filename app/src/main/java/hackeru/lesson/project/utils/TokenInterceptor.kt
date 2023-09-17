package hackeru.lesson.project.utils

import okhttp3.Interceptor
import okhttp3.Response



// this class is so we can add our api_key to the URL at the end
class TokenInterceptor : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {

        //the original request:
        //https://api.themoviedb.org/3/discover/movie
        val original = chain.request()

        val url = original.url.newBuilder()
            .addQueryParameter("api_key", "b3b1492d3e91e9f9403a2989f3031b0c")
            .build()

        val request = original.newBuilder().url(url).build()

        return chain.proceed(request)
    }
}