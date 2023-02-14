package com.safa_book_release_project_print_line_str.presentation.screen.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import com.safa_book_release_project_print_line_str.R
import com.safa_book_release_project_print_line_str.databinding.ActivityMainBinding

//TODO: add a splash screen!

class MainActivity : AppCompatActivity() {
    private var _binding: ActivityMainBinding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val controller: NavController by lazy {
            Navigation.findNavController(
                activity = this, R.id.main_nav_host
            )
        }
        binding.btnUserLibrary.setOnClickListener(View.OnClickListener {
            controller.navigate(
                R.id.action_fg_home_page_to_fg_user_library
            )
        })
        binding.btnLibraryStore.setOnClickListener(View.OnClickListener {
            controller.navigate(
                R.id.action_fg_home_page_to_fg_library_store
            )
        })
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

}