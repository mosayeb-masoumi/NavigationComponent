package com.example.bottomnavigationdrawerjetpack.example1


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import com.example.bottomnavigationdrawerjetpack.R
import com.example.bottomnavigationdrawerjetpack.databinding.FragmentHomeBinding



class HomeFragment : Fragment() {


    private lateinit var binding: FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
//        return inflater.inflate(R.layout.fragment_home, container, false)

        binding = FragmentHomeBinding.inflate(inflater)


        binding.btn.setOnClickListener {
//            Navigation.findNavController(binding.root).navigate(R.id.action_homeFragment_to_newsFragment)
         findNavController().navigate(R.id.action_homeFragment_to_newsFragment)

//            val item = activity?.bottomNavigation.menu.findItem(R.id.newsFragment)
//            NavigationUI.onNavDestinationSelected(item, navController)
        }

        return binding.root


    }


}