package hackeru.lesson.project.ui.home.details

import android.os.Build
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.squareup.picasso.Picasso
import hackeru.lesson.project.databinding.FragmentMovieDetailsBinding
import hackeru.lesson.project.entity.Movie


class MovieDetailsFragment : Fragment() {
    private var _binding: FragmentMovieDetailsBinding? = null

    //use after init:
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentMovieDetailsBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        // we receive the data movie from HomeFragment
        val movie = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
            arguments?.getParcelable("Movie", Movie::class.java) ?: return
        } else {
            @Suppress("DEPRECATION")
            arguments?.getParcelable("Movie") ?: return
        }

        //now we upload the images of the movie (both poster and backdrop) and present it
        with(binding){
            Picasso.get().load(movie.backdropUrl).into(imageBackdrop)
            Picasso.get().load(movie.posterUrl).into(imagePoster)
            overviewText.text = movie.overview
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}