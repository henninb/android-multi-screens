package com.bhenning.simple

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.bhenning.simple.databinding.ThirdFragmentBinding

class ThirdFragment : Fragment() {
    private var _binding: ThirdFragmentBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = ThirdFragmentBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Find the Button by its ID
        val nextButton = binding.nextButton

        // Set a click listener for the button
        nextButton.setOnClickListener {
            // Navigate to the next fragment when the button is clicked
            findNavController().navigate(R.id.action_thirdFragment_to_firstFragment)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
