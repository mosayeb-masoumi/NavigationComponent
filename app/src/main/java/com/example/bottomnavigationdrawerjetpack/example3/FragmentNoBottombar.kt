package com.example.bottomnavigationdrawerjetpack.example3


import android.opengl.Visibility
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import androidx.navigation.fragment.findNavController
import com.example.bottomnavigationdrawerjetpack.R
import com.example.bottomnavigationdrawerjetpack.databinding.FragmentNoBottombarBinding



class FragmentNoBottombar : Fragment() {

    lateinit var binding: FragmentNoBottombarBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {

        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentNoBottombarBinding.inflate(inflater)
        return  binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)




         //hide bottobar
        val bottombar = requireActivity().findViewById<LinearLayout>(R.id.ll_bottom)
        bottombar.visibility = View.GONE


        binding.backToFragmentZ.setOnClickListener {

            findNavController().navigate(
                resId = R.id.action_fragmentNoBottomBar_popupTo_fragmentZ
            )
        }
    }

}