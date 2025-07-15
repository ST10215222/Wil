package vcmsa.projects.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.btnVolunteer).setOnClickListener {
            startActivity(Intent(this, VolunteerActivity::class.java))
        }

        findViewById<Button>(R.id.btnDonate).setOnClickListener {
            startActivity(Intent(this, DonationActivity::class.java))
        }

        findViewById<Button>(R.id.btnEvents).setOnClickListener {
            startActivity(Intent(this, EventsActivity::class.java))
        }

        findViewById<Button>(R.id.btnRegister).setOnClickListener {
            startActivity(Intent(this, RegisterActivity::class.java))
        }

        findViewById<Button>(R.id.btnLogin).setOnClickListener {
            startActivity(Intent(this, LoginActivity::class.java))
        }

        // 🔹 About Us Button
        findViewById<Button>(R.id.btnAboutUs).setOnClickListener {
            startActivity(Intent(this, AboutUsActivity::class.java))
        }

        // 🔹 Our Socials Button
        findViewById<Button>(R.id.btnSocials).setOnClickListener {
            startActivity(Intent(this, OurSocialsActivity::class.java))
        }
    }
}
