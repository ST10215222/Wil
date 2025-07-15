package vcmsa.projects.myapplication

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class VolunteerActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_volunteer)

        val registerBtn = findViewById<Button>(R.id.btnRegister)

        registerBtn.setOnClickListener {
            val name = findViewById<EditText>(R.id.etName).text.toString()
            val email = findViewById<EditText>(R.id.etEmail).text.toString()
            val event = findViewById<Spinner>(R.id.spinnerEvent).selectedItem.toString()
            val date = findViewById<EditText>(R.id.etDate).text.toString()

            Toast.makeText(this, "Thank you for registering!", Toast.LENGTH_SHORT).show()


        }
    }
}
