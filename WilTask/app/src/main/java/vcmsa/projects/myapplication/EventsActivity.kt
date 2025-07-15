package vcmsa.projects.myapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class EventsActivity : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: EventsAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_events)

        val eventList = listOf(
            Event("Community Clean-up", "15 July 2025", "Local Park, Cape Town"),
            Event("Food Distribution Drive", "20 July 2025", "Khayelitsha Community Center"),
            Event("Winter Blanket Campaign", "25 July 2025", "Downtown Durban")
        )

        recyclerView = findViewById(R.id.eventsRecycler)
        adapter = EventsAdapter(eventList)

        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = adapter
    }
}