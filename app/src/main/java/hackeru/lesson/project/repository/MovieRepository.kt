package hackeru.lesson.project.repository

import androidx.lifecycle.LiveData
import hackeru.lesson.project.data.MovieDao
import hackeru.lesson.project.entity.Movie
import hackeru.lesson.project.mapper.toMovie
import hackeru.lesson.project.service.TMDBService
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


// here we combine the file of Entity and the file of Database
class MovieRepository(private val movieDao: MovieDao) {


// here we want access to the local Database, and we do this so that HomeViewModel won't touch our Database directly,
//  meaning we want it to go through our Repository first
    fun getMovies() : LiveData<List<Movie>> {
        return movieDao.getMovies()
    }

    //this is for when we refresh the movies in case we add some movie
    suspend fun refreshMovies(){
        withContext(Dispatchers.IO){
            val movieResponse = TMDBService.create().getMovies()
            movieDao.add(movieResponse.movies.map { dto -> dto.toMovie() })
        }
    }
}