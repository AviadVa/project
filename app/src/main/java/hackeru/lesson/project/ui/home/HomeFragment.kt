package hackeru.lesson.project.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.GridLayoutManager
import hackeru.lesson.project.R
import hackeru.lesson.project.databinding.FragmentHomeBinding
import hackeru.lesson.project.ui.adapter.MovieAdapter

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null


    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val homeViewModel =
            ViewModelProvider(this)[HomeViewModel::class.java]
        //accessing the homeViewModel.movies
        homeViewModel.movies.observe(viewLifecycleOwner) {
            with(binding.recyclerView) {
                //in the adapter we give it the movie we want to open
                adapter = MovieAdapter(it) {

                    // here we send the data of the movie we clicked and tell it were to go
                    Bundle().apply {
                        putParcelable("Movie",it)
                        findNavController().navigate(R.id.action_navigation_home_to_movieDetailsFragment, this)
                    }
                }

                //we only want 3 movies in every row
                layoutManager = GridLayoutManager(context, 3)
            }

        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}