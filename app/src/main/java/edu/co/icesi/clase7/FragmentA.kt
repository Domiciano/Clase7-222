package edu.co.icesi.clase7

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import edu.co.icesi.clase7.databinding.FragmentBlankBinding

class FragmentA : Fragment() {

    lateinit var binding:FragmentBlankBinding

    var listener: OnFragmentClick? = null

    //State del fragment
    var name:String = "Andres Arboleda"
    var phone:String = "+57234234234"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentBlankBinding.inflate(layoutInflater, container, false)

        binding.phoneTV.text = phone
        binding.nameTV.text = name

        binding.callBtn.setOnClickListener {
            name = "Bernardo Bernal"
            phone = "+579999999999"
            binding.phoneTV.text = phone
            binding.nameTV.text = name

            listener?.let {
                it.onButtonClick("Click desde el fragment A")
            }
        }


        return binding.root
    }
    companion object {
        @JvmStatic
        fun newInstance() = FragmentA()
    }
}