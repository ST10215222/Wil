package vcmsa.projects.myapplication

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class EventsAdapter(private val events: List<Event>) :
    RecyclerView.Adapter<EventsAdapter.EventViewHolder>() {

    class EventViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val title: TextView = itemView.findViewById(R.id.tvEventTitle)
        val date: TextView = itemView.findViewById(R.id.tvEventDate)
        val location: TextView = itemView.findViewById(R.id.tvEventLocation)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EventViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_event, parent, false)
        return EventViewHolder(view)
    }

    override fun onBindViewHolder(holder: EventViewHolder, position: Int) {
        val event = events[position]
        holder.title.text = event.title
        holder.date.text = event.date
        holder.location.text = event.location
    }

    override fun getItemCount(): Int = events.size
}