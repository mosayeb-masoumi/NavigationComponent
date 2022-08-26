package com.example.bottomnavigationdrawerjetpack.example3

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import androidx.navigation.fragment.findNavController
import com.example.bottomnavigationdrawerjetpack.R
import com.example.bottomnavigationdrawerjetpack.databinding.FragmentYBinding
import com.example.bottomnavigationdrawerjetpack.databinding.FragmentZBinding


class FragmentZ : Fragment() {

    lateinit var binding: FragmentZBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentZBinding.inflate(inflater)
        return  binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)



        //visible bottobar
        val bottombar = requireActivity().findViewById<LinearLayout>(R.id.ll_bottom)
        bottombar.visibility = View.VISIBLE

        binding.backtoFragmentY.setOnClickListener {

            findNavController().navigate(
                resId = R.id.action_fragmentZ_popupTo_fragmentY,
            )
        }

        binding.backtoFragmentX.setOnClickListener {

            findNavController().navigate(
                resId = R.id.action_fragmentZ_popupTo_fragmentX
            )

        }

        binding.gotoFragmentNoBottombar.setOnClickListener {

            findNavController().navigate(
                resId = R.id.action_fragmentZ_to_fragmentNoBottomBar
            )

        }

    }
}