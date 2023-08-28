package com.netflix.app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Patterns
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class LoginActivity : AppCompatActivity() {

    // Creando variables
    private lateinit var etEmail: EditText
    private lateinit var etPass: EditText
    private lateinit var btnIniciarSesion: Button
    private lateinit var btnCrearUsuario: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        // Asignando elementos a Variables
        etEmail = findViewById(R.id.etEmailLogin)
        etPass = findViewById(R.id.etPassLogin)
        btnIniciarSesion = findViewById(R.id.btnIniciarSesionLogin)
        btnCrearUsuario = findViewById(R.id.btnCrearUsuarioLogin)

        // Botón Iniciar Sesion
        btnIniciarSesion.setOnClickListener {
            // Datos faltantes
            if(etEmail.text.isEmpty()||etPass.text.isEmpty()){
                Toast.makeText(this, "Faltan datos.", Toast.LENGTH_SHORT).show()
            }else{
                if(!isValidEmail(etEmail.text.toString())){
                    Toast.makeText(this, "Ingrese un Email válido.",Toast.LENGTH_SHORT).show()
                }else{
                    // Datos correctos
                    Toast.makeText(this, "Sesion Iniciada.", Toast.LENGTH_SHORT).show()
                    irAMainActivity() // MainActivity --> Catálogo
                }

            }
        }

        // Botón Crear Usuario
        //  -Ir a pantalla de Registro de Usuario
        btnCrearUsuario.setOnClickListener {
            irASignInActivity()
        }

    }

    // Función para ir a la pantalla de Registro de Usuario
    private fun irASignInActivity(){
        val intent = Intent(this,SignUpActivity::class.java)
        startActivity(intent)
    }
    private fun isValidEmail(email: String): Boolean{
        val pattern = Patterns.EMAIL_ADDRESS  //Cargo patrón de email
        return pattern.matcher(email).matches() //comparo pattern con email [pattern.matcher(email)],
        //devuelvo boolean [matches()]
    }

    private fun irAMainActivity(){
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }

}