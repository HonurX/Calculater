package com.onurgunes.calculater

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.onurgunes.calculater.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
    fun addition(view: View) {
        var firstnumber = binding.editTextNumber.text.toString().toIntOrNull()
        var secondnumber = binding.editTextNumber2.text.toString().toIntOrNull()

        if (firstnumber == null || secondnumber == null){
            Toast.makeText(this,"enter a number",Toast.LENGTH_LONG).show()
        } else {

            var result = firstnumber + secondnumber
              binding.textView.text = "Result: ${result}"
            Toast.makeText(this,"Well Done",Toast.LENGTH_LONG).show()
        }



    }


    fun subtraction(view: View) {

        var firstnumber = binding.editTextNumber.text.toString().toIntOrNull()
        var secondnumber = binding.editTextNumber2.text.toString().toIntOrNull()
        if (firstnumber == null || secondnumber == null) {
            Toast.makeText(this,"enter a number",Toast.LENGTH_LONG).show()
        } else {
            var result = firstnumber - secondnumber
            binding.textView.text = "Result: ${result}"
            Toast.makeText(this,"Well Done",Toast.LENGTH_LONG).show()
        }

    }

    fun multiplication(view: View) {

    }


    fun division(view: View) {

    }
}