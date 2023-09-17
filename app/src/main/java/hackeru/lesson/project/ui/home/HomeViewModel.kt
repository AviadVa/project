package hackeru.lesson.project.ui.home

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.viewModelScope
import hackeru.lesson.project.data.AppDatabase
import hackeru.lesson.project.repository.MovieRepository
import kotlinx.coroutines.launch



// we changed HomeViewModel: ViewModel to HomeViewModel: AndroidViewModel because we need access to the
// context for the class AppDatabase in the function create
class HomeViewModel(private val context: Application) : AndroidViewModel(context) {

    //init the database:
    private val db = AppDatabase.create(context)

    //get Dap
    private val dao = db.movieDao()

    //init the repo:
    private val repo = MovieRepository(dao)

    //LiveData from the database we got from a fun in MovieRepository:
    val movies = repo.getMovies() //we have in hand LiveData from the database from MovieDao

    init {
        viewModelScope.launch {
            //refresh from the api:
            repo.refreshMovies()
        }
    }
}