package com.ardakazanci.mvvm_simple_calculator.main


import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import com.ardakazanci.mvvm_simple_calculator.R
import com.ardakazanci.mvvm_simple_calculator.databinding.FragmentFourOperationsBinding
import com.ardakazanci.mvvm_simple_calculator.utils.Symbol
import kotlinx.android.synthetic.main.fragment_four_operations.*

/**
 * Four Operations Mathematical
 */
class FourOperationsFragment : Fragment() {

    private lateinit var viewModel: FourOperationsViewModel
    private lateinit var binding: FragmentFourOperationsBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        viewModel = ViewModelProviders.of(this).get(FourOperationsViewModel::class.java)

        // Binding initialize
        binding = DataBindingUtil.inflate<FragmentFourOperationsBinding>(
            inflater,
            R.layout.fragment_four_operations,
            container,
            false
        )

        binding.fourOperationsViewModel = viewModel

        binding.lifecycleOwner = this


        viewModel.additionClicked.observe(this, Observer {

            if (it) { // Button Clicked ?
                if (edtNumberOne.text.isNotEmpty() && edtNumberSecond.text.isNotEmpty()) { // edittext empty control

                    // All operations in ViewModel
                    viewModel.onCalculateToResult(
                        binding.edtNumberOne.text.toString().toInt(),
                        binding.edtNumberSecond.text.toString().toInt(),
                        Symbol.PLUS
                    )


                    val action =
                        FourOperationsFragmentDirections.actionFourOperationsFragmentToCalculateResultFragment(
                            viewModel.result.value!!
                        )
                    view!!.findNavController()
                        .navigate(
                            FourOperationsFragmentDirections
                                .actionFourOperationsFragmentToCalculateResultFragment(viewModel.result.value!!)
                        )



                } else {
                    Toast.makeText(this.context, "Empty", Toast.LENGTH_LONG).show()
                }


            }

        })










        return binding.root

    }


}
