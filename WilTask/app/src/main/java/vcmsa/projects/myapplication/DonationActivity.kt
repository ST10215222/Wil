package vcmsa.projects.myapplication

import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class DonationActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_donation)

        findViewById<Button>(R.id.btnDonate).setOnClickListener {
            val name = findViewById<EditText>(R.id.etDonorName).text.toString()
            val amount = findViewById<EditText>(R.id.etAmount).text.toString().toDoubleOrNull()
            val repeat = findViewById<CheckBox>(R.id.cbRepeat).isChecked

            if (amount == null || amount <= 0) {
                Toast.makeText(this, "Enter a valid amount", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Thank you for your donation!", Toast.LENGTH_SHORT).show()

                // Optionally store in Firebase here
            }
        }
    }
}