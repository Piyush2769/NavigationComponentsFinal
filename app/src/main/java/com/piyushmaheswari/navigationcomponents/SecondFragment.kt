package com.piyushmaheswari.navigationcomponents
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import androidx.navigation.fragment.navArgs
import kotlinx.android.synthetic.main.fragment_second.view.*

class SecondFragment : Fragment(R.layout.fragment_second) {

//    private val args: SecondFragmentArgs by navArgs()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.textView2.setOnClickListener{
            Navigation.findNavController(view).navigate(R.id.action_firstFragment_to_secondFragment)
        }

        /** Data can be send through Safe Args between fragments- Receiving */

//        val myNumber=args.number
//        view.textView2.text = myNumber.toString()
//
//        view.textView2.setOnClickListener{
//
//            Navigation.findNavController(view).navigate(R.id.action_secondFragment_to_firstFragment)
//        }
    }

    /** Receive data from bundle */

//    val countryId = arguments?.getInt(getString(R.string.country_id))

}