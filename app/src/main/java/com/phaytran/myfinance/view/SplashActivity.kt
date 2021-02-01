package com.phaytran.myfinance.view

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.phaytran.myfinance.R
import com.phaytran.myfinance.databinding.ActivitySplashBinding

class SplashActivity: AppCompatActivity() {

    private lateinit var binding:ActivitySplashBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_splash)
        supportActionBar!!.hide()
        Handler().postDelayed({
            startActivity(Intent(this@SplashActivity,MainActivity::class.java))
        },2000)
    }
}