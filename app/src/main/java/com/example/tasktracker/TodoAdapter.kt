package com.example.tasktracker

import android.view.LayoutInflater
import android.view.View
import android.view.View.inflate
import android.view.ViewGroup
import androidx.core.content.res.ComplexColorCompat.inflate
import androidx.core.graphics.drawable.DrawableCompat.inflate
import androidx.recyclerview.widget.RecyclerView
import java.util.zip.Inflater
import kotlinx.android.synthetic.main.item_todo.view.*


// need to pass a list of our todo items to the constructor todo



class TodoAdapter (

    //passes our list of todos adapter sets list items to the recycler view
var todos: MutableList<Todo>
    //defines adapter is a recycler view adapter
) : RecyclerView.Adapter<TodoAdapter.TodoViewHolder>() {

    //Create a ToDoviewholder to hold the views of the recycler view, passes view to our current item from recycler view holder
    inner class TodoViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)


    //IMPLEMENT 3 FUNCTIONS RECYCLER VIEW ADAPTER SHOULD HAVE


    // onCreateViewHolder Called when user needs a new view holder i.e) if they scroll, it creates the new item that is visible

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TodoViewHolder {

        //inflate item todo to get it as a view
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_todo, parent, false)
        return TodoViewHolder(view)
    }

    //returns how many items are in our recyclerview

    override fun getItemCount(): Int {
            return todos.size
        }

    //Binds the data to our items. takes data from our todos list and sets it to corresponding view

    override fun onBindViewHolder(holder: TodoViewHolder, position: Int) {

        //Itemview contains all our single views. APPLY so I don't have to repeat holder.itemView.
        holder.itemView.apply {
         tvTitle.text = todos[position].title
         cbDone.isChecked = todos[position].isChecked

        }
    }
}