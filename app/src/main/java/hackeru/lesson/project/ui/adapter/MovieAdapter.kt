package hackeru.lesson.project.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import hackeru.lesson.project.databinding.MovieItemBinding
import hackeru.lesson.project.entity.Movie


class MovieAdapter(private val movies: List<Movie>, val onClick: (Movie) -> Unit) :
    RecyclerView.Adapter<MovieAdapter.MovieItem>() {

    //what we want to happen when the ViewHolder is created
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieItem {
        val context = parent.context
        val inflater = LayoutInflater.from(context)
        val binding = MovieItemBinding.inflate(inflater, parent, false)
        return MovieItem(binding)

        //or this is the same as:
        //return  MovieItem(MovieItemBinding.inflate(LayoutInflater.from(parent.context), parent, false))
        //I only broke it apart to make it more understandable

    }

    //how many movies we got?
    override fun getItemCount():Int {
        return movies.size
    }

    //what we want to show in our ViewHolder
    override fun onBindViewHolder(holder: MovieItem, position: Int) {


        val movie = movies[position]
        with(holder.binding) {
            //this if else condition is so we won't go out of bounds of the screen
            if (movie.title.length>10){
                textTitle.text = "${movie.title.subSequence(0,10)}..."
            }

            else{
                textTitle.text = movie.title
            }


            //here we Uplode the images one by one
            Picasso.get().load(movie.posterUrl).into(imagePoster)
            //If you click on a certain movie then what we want to happen is -
            root.setOnClickListener {
                onClick(movie)
            }
            }
        }


    class MovieItem(val binding: MovieItemBinding) : RecyclerView.ViewHolder(binding.root)

}