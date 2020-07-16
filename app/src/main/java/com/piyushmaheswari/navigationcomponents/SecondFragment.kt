package com.piyushmaheswari.navigationcomponents
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import androidx.navigation.fragment.navArgs
import kotlinx.android.synthetic.main.fragment_second.view.*

class SecondFragment : Fragment(R.layout.fragment_second) {

    val args: SecondFragmentArgs by navArgs()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
//
        val myNumber=args.number
        view.textView2.text = myNumber.toString()

        view.textView2.setOnClickListener{

            Navigation.findNavController(view).navigate(R.id.action_secondFragment_to_firstFragment)
        }
    }
}