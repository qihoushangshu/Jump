package com.example.jump

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        val bundle=intent.extras
        if(bundle!=null){
            val vw1 = bundle.getString("vw1")
            secondView.text= vw1
        }


        secondBtn.setOnClickListener {
            val intent = Intent(this,MainActivity::class.java)
            intent.putExtra("vw3",secondEdit.text.toString())
            startActivity(intent)
        }
    }
}
