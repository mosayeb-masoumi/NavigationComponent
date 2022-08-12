package com.example.bottomnavigationdrawerjetpack.example2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.bottomnavigationdrawerjetpack.R
import com.example.bottomnavigationdrawerjetpack.databinding.FragmentCBinding


class FragmentC : Fragment() {

    private lateinit var binding:FragmentCBinding

    var message =""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {

            message = it.getString("message","")
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentCBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        binding.txtMessage.text = message

        binding.btnBackHome.setOnClickListener(
            Navigation.createNavigateOnClickListener(
                R.id.action_fragmentC_popupTo_fragmentA
            )
        )
    }

}