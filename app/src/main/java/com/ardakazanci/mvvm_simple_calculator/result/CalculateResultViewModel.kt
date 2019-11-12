package com.ardakazanci.mvvm_simple_calculator.result

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CalculateResultViewModel(result: Int) : ViewModel() {


    private val _result = MutableLiveData<Int>()
    val result: LiveData<Int>
        get() = _result


    init {
        _result.value = result
    }


}