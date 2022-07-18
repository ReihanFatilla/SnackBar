package com.example.toastandsnackbar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.example.toastandsnackbar.databinding.ActivityMainBinding
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnSnackbar.setOnClickListener {
            Snackbar.make(binding.root, "SnackBar Showed!", Snackbar.LENGTH_LONG)
                .show()
        }

        binding.btnToast.setOnClickListener {
            Toast.makeText(this, "Toast Showed!", Toast.LENGTH_SHORT)
                .show()
        }
    }
}