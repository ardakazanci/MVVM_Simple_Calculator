package com.ardakazanci.mvvm_simple_calculator.result

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class CalculateResultViewModelFactory(private val result: Int) : ViewModelProvider.Factory {

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {

        if (modelClass.isAssignableFrom(CalculateResultViewModel::class.java)) {
            return CalculateResultViewModel(result) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")

    }


}