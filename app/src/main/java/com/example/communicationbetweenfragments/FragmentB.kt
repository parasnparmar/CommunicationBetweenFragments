package com.example.communicationbetweenfragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.communicationbetweenfragments.databinding.FragmentABinding
import com.example.communicationbetweenfragments.databinding.FragmentBBinding

class FragmentB : Fragment() {
    private lateinit var fragmentBBinding: FragmentBBinding
    var text1 = ""
        set(value){
            field = value
            fragmentBBinding.edtCity.setText(value)
        }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        fragmentBBinding = FragmentBBinding.inflate(inflater)

        fragmentBBinding.btnSend.setOnClickListener {
//            (parentFragmentManager.findFragmentById(R.id.fragment1)as FragmentA).text =
//                fragmentBBinding.edtCity.text.toString()

            (requireActivity() as MainActivity).setDataToFragmentA(fragmentBBinding.edtCity.text.toString())


        }

        return fragmentBBinding.root
    }
}