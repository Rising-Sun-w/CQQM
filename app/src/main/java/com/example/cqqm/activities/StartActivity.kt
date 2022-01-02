package com.example.cqqm.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.cqqm.R
import java.lang.Thread.sleep
import android.content.Intent
import android.os.Handler

class StartActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start)
        Handler().postDelayed(Runnable {
            val intent = Intent(this,HomePageActivity::class.java)
            startActivity(intent)
        },1500)
    }
}