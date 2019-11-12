package com.ardakazanci.mvvm_simple_calculator.result


import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProviders
import com.ardakazanci.mvvm_simple_calculator.R
import com.ardakazanci.mvvm_simple_calculator.databinding.FragmentCalculateResultBinding

/**
 * A simple [Fragment] subclass.
 */
class CalculateResultFragment : Fragment() {

    private lateinit var viewModel: CalculateResultViewModel
    private lateinit var viewModelFactory: CalculateResultViewModelFactory


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val binding: FragmentCalculateResultBinding =
            DataBindingUtil.inflate(inflater, R.layout.fragment_calculate_result, container, false)




        viewModelFactory =
            CalculateResultViewModelFactory(CalculateResultFragmentArgs.fromBundle(arguments!!).result)

        viewModel =
            ViewModelProviders.of(this, viewModelFactory).get(CalculateResultViewModel::class.java)

        binding.calculateViewModel = viewModel

        binding.lifecycleOwner = this

        return binding.root
    }


}
