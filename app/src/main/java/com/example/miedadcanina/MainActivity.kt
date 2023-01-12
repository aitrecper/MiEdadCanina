package com.example.miedadcanina

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.example.miedadcanina.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        Log.v("MainActivity", "ActivityCreated")
        Log.d("MainActivity", "ActivityCreated")
        Log.i("MainActivity", "ActivityCreated")
        Log.w("MainActivity", "ActivityCreated")
        Log.e("MainActivity", "ActivityCreated")

        binding.button.setOnClickListener {
            val ageString = binding.ageEdit.text.toString()
            if(ageString.isNotEmpty()){
                val ageInt = ageString.toInt()
                val result = ageInt * 7
                binding.resultText.text = getString(R.string.result_text,result)
            }else{
                Log.d("MainActivity", "Age String is empty")
                Toast.makeText(this, R.string.you_must_insert_your_age, Toast.LENGTH_LONG).show()
            }
        }
    }
}