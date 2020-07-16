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
            val action= FirstFragmentDirections.actionFirstFragmentToSecondFragment(56)
            Navigation.findNavController(view).navigate(action)
        }
    }


}