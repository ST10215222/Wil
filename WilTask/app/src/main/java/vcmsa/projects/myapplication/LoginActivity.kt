package vcmsa.projects.myapplication


import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat


class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val loginBtn = findViewById<Button>(R.id.btnLogin)
        val forgotPassword = findViewById<TextView>(R.id.tvForgotPassword)
        val register = findViewById<TextView>(R.id.tvRegister)

        loginBtn.setOnClickListener {
            // Placeholder: Add login logic here or show toast
            Toast.makeText(this, "Login clicked", Toast.LENGTH_SHORT).show()
        }



        register.setOnClickListener {
            startActivity(Intent(this, RegisterActivity::class.java))
        }
    }
}
