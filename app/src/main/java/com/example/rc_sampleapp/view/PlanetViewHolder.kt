package com.example.rc_sampleapp.view

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.rc_sampleapp.R
import com.example.rc_sampleapp.model.Planets

class PlanetViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    private var name: TextView? = null
    private var fact1: TextView? = null
    private var fact2: TextView? = null
    private var mainText: TextView? = null
    private var image: ImageView? = null

    init {
        name = itemView.findViewById(R.id.text_view_name)
        fact1 = itemView.findViewById(R.id.text_view_fact_1)
        fact2 = itemView.findViewById(R.id.text_view_fact_2)
        mainText = itemView.findViewById(R.id.text_view_main)
        image = itemView.findViewById(R.id.image)
    }

    fun onBind(info: Planets) {
        name?.text = info.name
        fact1?.text = info.fact1
        fact2?.text = info.fact2
        mainText?.text = info.text
    }
}