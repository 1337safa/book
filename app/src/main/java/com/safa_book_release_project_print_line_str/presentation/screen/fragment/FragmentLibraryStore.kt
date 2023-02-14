package com.safa_book_release_project_print_line_str.presentation.screen.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.safa_book_release_project_print_line_str.databinding.FragmentLibraryStoreBinding

class FragmentLibraryStore(): Fragment() {

    private var _binding: FragmentLibraryStoreBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentLibraryStoreBinding.inflate(
            layoutInflater, container, false
        )
        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    companion object {
        fun newInstance(): Fragment = FragmentLibraryStore()
    }

}