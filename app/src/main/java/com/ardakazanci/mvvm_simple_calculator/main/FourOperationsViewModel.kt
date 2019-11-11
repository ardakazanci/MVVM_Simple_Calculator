package com.ardakazanci.mvvm_simple_calculator.main

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class FourOperationsViewModel : ViewModel() {

    private val _numberOne = MutableLiveData<Int>()
    val numberOne: LiveData<Int>
        get() = _numberOne

    private val _numberSecond = MutableLiveData<Int>()
    val numberSecond: LiveData<Int>
        get() = _numberSecond

    private val _operationSymbol = MutableLiveData<String>()
    val operationSymbol: LiveData<String>
        get() = _operationSymbol


    // OperationsButtonClicked
    private val _additionClicked = MutableLiveData<Boolean>()
    val additionClicked: LiveData<Boolean>
        get() = _additionClicked

    private val _substractionClicked = MutableLiveData<Boolean>()
    val substractionClicked: LiveData<Boolean>
        get() = _substractionClicked

    private val _multiplicationClicked = MutableLiveData<Boolean>()
    val multiplicationClicked: LiveData<Boolean>
        get() = _multiplicationClicked

    private val _divisionClicked = MutableLiveData<Boolean>()
    val divisionClicked: LiveData<Boolean>
        get() = _divisionClicked


    init {
        _additionClicked.value = false
        _substractionClicked.value = false
        _multiplicationClicked.value = false
        _divisionClicked.value = false


    }


    override fun onCleared() {
        super.onCleared()

    }


    fun onAdditionClicked() {
        _additionClicked.value = true
        _operationSymbol.value = "+"
    }

    fun onSubstractionClicked() {
        _substractionClicked.value = true
        _operationSymbol.value = "-"
    }

    fun onMultiplicationClicked() {
        _multiplicationClicked.value = true
        _operationSymbol.value = "*"
    }

    fun onDivisionClicked() {
        _divisionClicked.value = true
        _operationSymbol.value = "/"
    }

}