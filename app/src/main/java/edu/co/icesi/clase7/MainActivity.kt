package edu.co.icesi.clase7

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import edu.co.icesi.clase7.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    val binding:ActivityMainBinding by lazy{
        ActivityMainBinding.inflate(layoutInflater)
    }
    val fragmentA:FragmentA by lazy{
        FragmentA.newInstance()
    }
    val fragmentB:FragmentB by lazy{
        FragmentB.newInstance()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        showFragment(fragmentA)

        binding.actionFragmentA.setOnClickListener {
            showFragment(fragmentA)
        }
        binding.actionFragmentB.setOnClickListener {
            showFragment(fragmentB)
        }

    }
    fun showFragment(fragment: Fragment){
        supportFragmentManager.beginTransaction()
            .replace(binding.fragmentContainer.id, fragment)
            .commit()
    }



}