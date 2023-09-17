package hackeru.lesson.project.data

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import hackeru.lesson.project.entity.Movie


const val DB_VERSION = 1 // this is the name of our Database version
const val DB_NAME = "appdb" // this is the name of our Database

// @Database: this is our Database
@Database(entities = [Movie::class], version = DB_VERSION)
abstract class AppDatabase: RoomDatabase() {

    abstract fun movieDao(): MovieDao

    companion object {
        fun create (context: Context) =
            Room.
            databaseBuilder(context, AppDatabase::class.java, DB_NAME).
            build()
    }
}