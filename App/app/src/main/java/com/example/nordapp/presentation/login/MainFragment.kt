package com.example.nordapp.presentation.login

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.nordapp.R
import com.example.nordapp.databinding.MainFragmentBinding

class MainFragment : Fragment() {

    companion object {
        fun newInstance() = MainFragment()
    }

    private lateinit var viewModel: MainViewModel
    private lateinit var binding: MainFragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = MainFragmentBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)

        binding.loginBtn.setOnClickListener(View.OnClickListener {
            progressUi(View.VISIBLE)
            viewModel.login()
        })
        super.onViewCreated(view, savedInstanceState)
    }

    fun showLoginUI(visability:Int){
        binding.imageView.visibility = visability
        binding.usernameField.visibility = visability
        binding.passwordField.visibility = visability
        binding.loginBtn.visibility = visability
    }
    fun progressUi(visability: Int){
        binding.progress.visibility = visability
    }



}