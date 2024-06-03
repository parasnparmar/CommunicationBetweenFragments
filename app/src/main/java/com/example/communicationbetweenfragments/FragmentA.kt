package com.example.communicationbetweenfragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.communicationbetweenfragments.databinding.FragmentABinding

class FragmentA : Fragment() {

    private lateinit var fragmentABinding: FragmentABinding
    var text = ""
        set(value){
            field = value
            fragmentABinding.edtName.setText(value)
        }
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        fragmentABinding =FragmentABinding.inflate(inflater)

        fragmentABinding.btnSend.setOnClickListener {
//            (parentFragmentManager.findFragmentById(R.id.fragment2)as FragmentB).text1 =
//                fragmentABinding.edtName.text.toString()

            (requireActivity() as MainActivity).setDataToFragmentB(fragmentABinding.edtName.text.toString())
        }
        return fragmentABinding.root

    }
}