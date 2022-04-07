package com.example.nordapp.presentation.login

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.nordapp.R
<<<<<<< HEAD:App/app/src/main/java/com/example/nordapp/presentation/login/MainFragment.kt
import com.example.nordapp.databinding.MainFragmentBinding
=======
import dagger.hilt.android.AndroidEntryPoint
>>>>>>> 0c0091d9941fa42c45084c71391554dfa23d0803:App/app/src/main/java/com/example/nordapp/presentation/login/LoginFragment.kt

@AndroidEntryPoint
class LoginFragment : Fragment() {

    companion object {
        fun newInstance() = LoginFragment()
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