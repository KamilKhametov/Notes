package com.notes.ui.list

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.notes.data.model.NoteListItem
import com.notes.databinding.ListItemNoteBinding

class NoteListAdapter(
    private val onDetailClick: (id: Long, title: String, description: String) -> Unit,
    private val onDeleteClick: (id: Long) -> Unit
) : RecyclerView.Adapter<NoteListAdapter.ViewHolder>() {

    private val items = arrayListOf<NoteListItem>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = ViewHolder(
        ListItemNoteBinding.inflate(
            LayoutInflater.from(parent.context), parent, false
        )
    )

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(items[position])
    }

    override fun getItemCount() = items.size

    fun setItems(items: List<NoteListItem>) {
        this.items.run {
            clear()
            addAll(items)
        }
        notifyDataSetChanged()
    }

    inner class ViewHolder(private val binding: ListItemNoteBinding) : RecyclerView.ViewHolder(binding.root) {

        fun bind(note: NoteListItem) {
            with(binding){
                titleLabel.text = note.title
                contentLabel.text = note.content
            }

            itemView.setOnClickListener {
                onDetailClick.invoke(note.id, note.title, note.content)
            }

            itemView.setOnLongClickListener {
                onDeleteClick.invoke(note.id)
                true
            }
        }
    }
}
