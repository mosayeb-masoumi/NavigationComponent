package com.example.bottomnavigationdrawerjetpack.example2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import com.example.bottomnavigationdrawerjetpack.R
import com.example.bottomnavigationdrawerjetpack.databinding.FragmentABinding
import com.example.bottomnavigationdrawerjetpack.databinding.FragmentBBinding


class FragmentB : Fragment() {

    var message = ""
    private lateinit var binding: FragmentBBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {

            message = it.getString("message", "")
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentBBinding.inflate(inflater)
        return binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.txtMessage.text = message


        binding.btnGotoFragmentC.setOnClickListener {
            findNavController().navigate(
                resId = R.id.action_fragmentB_to_fragmentC,
                args = Bundle().also {
                    it.putString("message", "a message from Fragment B")
                }
            )
        }


        binding.btnBackHome.setOnClickListener(
            Navigation.createNavigateOnClickListener(
                R.id.action_fragmentB_popupTo_fragmentA
            )
        )

    }

}