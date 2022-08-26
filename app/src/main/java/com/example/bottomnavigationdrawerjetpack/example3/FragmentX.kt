package com.example.bottomnavigationdrawerjetpack.example3

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import androidx.navigation.fragment.findNavController
import com.example.bottomnavigationdrawerjetpack.R
import com.example.bottomnavigationdrawerjetpack.databinding.FragmentXBinding


class FragmentX : Fragment() {


    lateinit var binding: FragmentXBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {

        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentXBinding.inflate(inflater)
        return  binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

//        //visible bottobar
//        val bottombar = requireActivity().findViewById<LinearLayout>(R.id.ll_bottom)
//        bottombar.visibility = View.VISIBLE

        binding.gotoFragmentY.setOnClickListener {

            findNavController().navigate(
                resId = R.id.action_fragmentX_to_fragmentY,
                args = Bundle().also {
                    it.putString("message" , "a message from home")
                }
            )
        }

        binding.gotoFragmentZ.setOnClickListener {
            findNavController().navigate(
                resId = R.id.action_fragmentX_to_fragmentZ,
            )
        }

    }


}