package com.example.jump

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bundle=intent.extras
        if(bundle!=null){
            val vw3 = bundle.getString("vw3")
            firstView.text= vw3
        }
        firstBtn.setOnClickListener {
            val intent = Intent(this,SecondActivity::class.java)
            intent.putExtra("vw1",firstEdit.text.toString())
            intent.putExtra("vw2","param2")
            startActivity(intent)
        }
    }
}
