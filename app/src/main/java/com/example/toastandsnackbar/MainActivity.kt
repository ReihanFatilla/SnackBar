package com.example.toastandsnackbar

import android.graphics.Color
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.res.ResourcesCompat
import com.example.toastandsnackbar.databinding.ActivityMainBinding
import com.google.android.material.snackbar.Snackbar
import com.kishandonga.csbx.CustomSnackbar
import www.sanju.motiontoast.MotionToast
import www.sanju.motiontoast.MotionToastStyle


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnSnackbar.setOnClickListener {
            val sb = CustomSnackbar(this@MainActivity)
            sb.drawableRes(R.drawable.ic_check_green)
            sb.message("Snackbar Showed!")
            sb.withAction("Hide Snackbar") {
                sb.dismiss()
            }
            sb.cornerRadius(25f)
            sb.padding(15)
            sb.backgroundColor(Color.BLUE)
            sb.actionTextColor(Color.CYAN)
            sb.duration(Snackbar.LENGTH_LONG)
            sb.textColor(Color.WHITE)
            sb.show()
        }

        binding.btnToast.setOnClickListener {
            MotionToast.createColorToast(this,"Toast Showed!",
                "Succesfully showing a custom toast",
                MotionToastStyle.SUCCESS,
                MotionToast.GRAVITY_BOTTOM,
                MotionToast.LONG_DURATION,
                ResourcesCompat.getFont(this, R.font.helvetica_regular))
        }
    }
}