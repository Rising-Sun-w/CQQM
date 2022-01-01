package com.example.cqqm.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.cqqm.R
import java.lang.Thread.sleep
import android.content.Intent

class StartActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start)
        drawStop()
        //Intent intent = new Intent(MainActivity.this,LoginActivity.class);
        //startActivity(intent);
//        val intent = Intent(StartActivity.this,HomePageActivity.class)
        val intent = Intent(this, HomePageActivity::class.java)
        startActivity(intent)
    }

    private fun drawStop() {
        Thread(Runnable {
            kotlin.run {
                sleep(4 * 10000)
            }
        })
    }
}