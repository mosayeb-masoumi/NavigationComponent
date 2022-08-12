package com.example.bottomnavigationdrawerjetpack.example2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.bottomnavigationdrawerjetpack.R
import com.example.bottomnavigationdrawerjetpack.databinding.FragmentABinding
import com.example.bottomnavigationdrawerjetpack.databinding.FragmentHomeBinding


class FragmentA : Fragment() {



    lateinit var binding: FragmentABinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {

        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding = FragmentABinding.inflate(inflater)
        return  binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        binding.btnGotoFragmentB.setOnClickListener {
            findNavController().navigate(
                resId = R.id.action_fragmentA_to_fragmentB,
                args = Bundle().also {
                    it.putString("message" , "a message from home")
                }
            )
        }

    }


}