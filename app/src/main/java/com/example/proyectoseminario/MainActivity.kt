package com.example.proyectoseminario

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        MyToolbar().show(this,"NETFLIX", false)

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

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_contextual, menu)
        return super.onCreateOptionsMenu(menu)
    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == R.id.opcion1)
            startActivity(Intent(this, PreguntasFrecuentes::class.java))
        if (item.itemId == R.id.opcion2)
            startActivity(Intent(this, TerminosCondiciones::class.java))
        if (item.itemId == R.id.opcion3)
            startActivity(Intent(this, Informacion::class.java))
        return super.onOptionsItemSelected(item)
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
    override fun onBackPressed() {
        val intent = Intent(this,LoginActivity::class.java)
        startActivity(intent)
    }
}