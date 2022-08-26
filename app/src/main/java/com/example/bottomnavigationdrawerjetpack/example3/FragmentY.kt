package com.example.bottomnavigationdrawerjetpack.example3

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import com.example.bottomnavigationdrawerjetpack.R
import com.example.bottomnavigationdrawerjetpack.databinding.FragmentABinding
import com.example.bottomnavigationdrawerjetpack.databinding.FragmentXBinding
import com.example.bottomnavigationdrawerjetpack.databinding.FragmentYBinding


class FragmentY : Fragment() {

    lateinit var binding: FragmentYBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {

        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentYBinding.inflate(inflater)
        return  binding.root
    }



    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

//        //visible bottobar
//        val bottombar = requireActivity().findViewById<LinearLayout>(R.id.ll_bottom)
//        bottombar.visibility = View.VISIBLE

        binding.gotoFragmentZ.setOnClickListener {

            findNavController().navigate(
                resId = R.id.action_fragmentY_to_fragmentZ,
                args = Bundle().also {
                    it.putString("message" , "a message from home")
                }
            )
        }

        binding.backtoFragmentX.setOnClickListener {

            findNavController().navigate(
                resId = R.id.action_fragmentY_popupTo_fragmentX
            )

        }

    }

}