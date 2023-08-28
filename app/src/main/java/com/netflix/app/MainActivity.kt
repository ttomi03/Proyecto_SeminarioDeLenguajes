package com.netflix.app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tvGoToSerie1 = findViewById<ImageView>(R.id.Serie1)

        tvGoToSerie1.setOnClickListener{

            goToRegister3()
        }

        val tvGoToSerie2 = findViewById<ImageView>(R.id.Serie2)

        tvGoToSerie2.setOnClickListener{
            goToRegister2()

        }

        val tvGoToSerie3= findViewById<ImageView>(R.id.Serie3)

        tvGoToSerie3.setOnClickListener{
            goToRegister1()
        }
    }

    private fun goToRegister1 (){
        val t= Intent(this, EnterActivity3::class.java)
        startActivity(t)
    }

    private fun goToRegister2 (){
        val j= Intent(this, EnterActivity2::class.java)
        startActivity(j)
    }
    private fun goToRegister3 () {
        val i= Intent(this, EnterActivity1::class.java)
        startActivity(i)
    }

    @Deprecated("Deprecated in Java")
    override fun onBackPressed() {
        val intent = Intent(this,LoginActivity::class.java)
        startActivity(intent)
    }

}