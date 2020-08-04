package com.piyushmaheswari.navigationcomponents
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_first.view.*

class FirstFragment : Fragment(R.layout.fragment_first) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        view.textView.setOnClickListener{
            Navigation.findNavController(view).navigate(R.id.action_firstFragment_to_secondFragment)
        }

        /** Data can be send through Safe Args between fragments- Sending */

//        view.textView.setOnClickListener{
//            val action= FirstFragmentDirections.actionFirstFragmentToSecondFragment(56)
//            Navigation.findNavController(view).navigate(action)
//        }
    }

    /** Data can be send through bundle between fragments- Sending */

//    val countryFactBundle = Bundle().apply {
//        putInt(getString(R.string.country_id), country.id)
//    }
//
//    Navigation.findNavController()?.navigate(R.id.action_countryListFragment_to_countryDetailsFragment2,countryFactBundle)
}