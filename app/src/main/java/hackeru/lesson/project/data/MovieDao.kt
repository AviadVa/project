package hackeru.lesson.project.data

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import hackeru.lesson.project.entity.Movie


//Dao - Data Access Object
//שמירה לדטה-בייס מקומי:
@Dao
interface MovieDao {

    //OnConflictStrategy.REPLACE = update db from cloud if the movie is already inside
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun add(movies: List<Movie>)


    //this so we can get the movies from our SQL file
    @Query("SELECT * FROM Movie")
    fun getMovies(): LiveData<List<Movie>>

}