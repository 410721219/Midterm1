package com.example.midterm1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import com.example.midterm1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.plusButton.setOnClickListener{
            plus(it)
        }

        binding.minusButton.setOnClickListener{
            minus(it)
        }

        binding.multiButton.setOnClickListener{
            multi(it)
        }

        binding.divButton.setOnClickListener{
            div(it)
        }
    }

    private fun plus(view: View){
        binding.apply{
            var answer: Double = number1.text.toString().toDouble() + number2.text.toString().toDouble()
            result.text = answer.toString()
        }
    }

    private fun minus(view: View){
        binding.apply{
            var answer: Double = number1.text.toString().toDouble() - number2.text.toString().toDouble()
            result.text = answer.toString()
        }
    }

    private fun multi(view: View){
        binding.apply{
            var answer: Double = number1.text.toString().toDouble() * number2.text.toString().toDouble()
            result.text = answer.toString()
        }
    }

    private fun div(view: View){
        binding.apply{
            var answer: Double = number1.text.toString().toDouble() / number2.text.toString().toDouble()
            result.text = answer.toString()
        }
    }
}