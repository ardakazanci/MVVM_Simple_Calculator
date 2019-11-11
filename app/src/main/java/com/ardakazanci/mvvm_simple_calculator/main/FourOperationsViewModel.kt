package com.ardakazanci.mvvm_simple_calculator.main

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.ardakazanci.mvvm_simple_calculator.utils.Symbol

class FourOperationsViewModel : ViewModel() {

    private val _result = MutableLiveData<Int>()
    val result: LiveData<Int>
        get() = _result


    private val _numberOne = MutableLiveData<Int>()
    val numberOne: LiveData<Int>
        get() = _numberOne


    private val _numberSecond = MutableLiveData<Int>()
    val numberSecond: LiveData<Int>
        get() = _numberSecond



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
    }

    fun onSubstractionClicked() {
        _substractionClicked.value = true
    }

    fun onMultiplicationClicked() {
        _multiplicationClicked.value = true
    }

    fun onDivisionClicked() {
        _divisionClicked.value = true
    }


    fun onCalculateToResult(numberOne: Int, numberSecond: Int, symbol: Symbol) {


        if (symbol == Symbol.PLUS) {
            _result.value = numberOne + numberSecond
        } else if (symbol == Symbol.MINUS) {
            _result.value = numberOne - numberSecond
        } else if (symbol == Symbol.MULTIPLY) {
            _result.value = numberOne * numberSecond
        } else if (symbol == Symbol.DIVIDED) {
            _result.value = numberOne / numberSecond
        }

    }

}