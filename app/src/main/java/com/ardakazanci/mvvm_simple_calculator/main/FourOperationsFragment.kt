package com.ardakazanci.mvvm_simple_calculator.main


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import com.ardakazanci.mvvm_simple_calculator.R
import com.ardakazanci.mvvm_simple_calculator.databinding.FragmentFourOperationsBinding

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
            if (it) {
                view?.findNavController()
                    ?.navigate(R.id.action_fourOperationsFragment_to_calculateResultFragment)
                if(binding.edtNumberOne.text.isNotEmpty()){
                    // İlgili değerler alınıp gönderilecek
                    // Burada kaldık.
                }
                val action = FourOperationsFragmentDirections.actionFourOperationsFragmentToCalculateResultFragment(viewModel.numberOne.value!!,viewModel.numberSecond.value!!,viewModel.operationSymbol.value!!)
                NavHostFragment.findNavController(this).navigate(action)

            }
        })



        return binding.root

    }


}
