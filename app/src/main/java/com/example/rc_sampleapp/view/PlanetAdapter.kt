package com.example.rc_sampleapp.view

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.rc_sampleapp.R
import com.example.rc_sampleapp.model.Planets

class PlanetAdapter(private val planetList: List<Planets>): RecyclerView.Adapter<PlanetViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PlanetViewHolder {
        val inflater =
            LayoutInflater.from(parent.context).inflate(R.layout.itemview_space, parent, false)
        return PlanetViewHolder(inflater)
    }

    override fun onBindViewHolder(holder: PlanetViewHolder, position: Int) {
        holder.onBind(planetList[position])
    }

    override fun getItemCount(): Int {
        return planetList.size
    }
}