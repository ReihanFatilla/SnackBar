package com.example.toastandsnackbar

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.res.ResourcesCompat
import com.example.toastandsnackbar.databinding.ActivityMainBinding
import www.sanju.motiontoast.MotionToast
import www.sanju.motiontoast.MotionToastStyle


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnSnackbar.setOnClickListener {

//            Snackbar.make(binding.root, "SnackBar Showed!", Snackbar.LENGTH_SHORT)
//                .setAction("Retry"){
//                    Snackbar.make(binding.root, "Retry Clicked!", Snackbar.LENGTH_SHORT)
//                        .show()
//                }
//                .show()
        }

        binding.btnToast.setOnClickListener {
            MotionToast.createColorToast(this,"Toast Showed!",
                "Succesfully showing a custom toast",
                MotionToastStyle.SUCCESS,
                MotionToast.GRAVITY_BOTTOM,
                MotionToast.LONG_DURATION,
                ResourcesCompat.getFont(this,R.font.helvetica_regular))
        }
    }
}