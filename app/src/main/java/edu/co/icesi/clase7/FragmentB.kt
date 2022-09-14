package edu.co.icesi.clase7

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import edu.co.icesi.clase7.databinding.FragmentBBinding


class FragmentB : Fragment(), OnFragmentClick {

    private lateinit var binding:FragmentBBinding

    //STATE
    private var message:String = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentBBinding.inflate(layoutInflater, container, false)
        binding.resultTV.text = message
        return binding.root
    }

    companion object {
        @JvmStatic
        fun newInstance() = FragmentB()
    }

    override fun onButtonClick(message: String) {
        this.message = message
    }
}