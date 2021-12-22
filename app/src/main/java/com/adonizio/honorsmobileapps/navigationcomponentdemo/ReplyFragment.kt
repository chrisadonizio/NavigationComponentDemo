package com.adonizio.honorsmobileapps.navigationcomponentdemo

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import com.adonizio.honorsmobileapps.navigationcomponentdemo.databinding.FragmentReplyBinding
import com.adonizio.honorsmobileapps.navigationcomponentdemo.databinding.FragmentSendMessageBinding


class ReplyFragment : Fragment() {
    private var _binding : FragmentReplyBinding? = null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding =  FragmentReplyBinding.inflate(inflater, container, false)

        val rootView = binding.root
        binding.sendReplyButton.setOnClickListener{
        }
        return rootView
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

}