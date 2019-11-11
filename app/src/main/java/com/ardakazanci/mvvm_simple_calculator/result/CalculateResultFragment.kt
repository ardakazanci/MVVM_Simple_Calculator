package com.ardakazanci.mvvm_simple_calculator.result


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.ardakazanci.mvvm_simple_calculator.R

/**
 * A simple [Fragment] subclass.
 */
class CalculateResultFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.fragment_calculate_result, container, false)
    }


}
