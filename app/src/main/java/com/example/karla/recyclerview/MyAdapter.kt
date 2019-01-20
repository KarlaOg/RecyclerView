package com.example.karla.recyclerview

import android.graphics.Color
import android.support.v4.content.ContextCompat
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.project_row.view.*



class MyAdapter : RecyclerView.Adapter<MyAdapter.CustomViewHolder>() {
    private val projectTitles = listOf("Douche Simulator", "BlabBa Sims", " Hello ")
    private val projectDescriptions = listOf(
        "Le seul et unique simulateur de douche pour Android.\nDisponible sur Google Play, il est entièrement gratuit !",
        "Le seul et unique service de covoiturage entre Sims. Une maniere écologique de partager ses frais !",
        "It's working"
    )
    private val projectButtons = listOf("ANDROID", "NODE JS", "BS")

    override fun getItemCount(): Int {
        return projectTitles.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomViewHolder {
        val layoutInflater = LayoutInflater.from(parent?.context)
        val cellForRow = layoutInflater.inflate(R.layout.project_row, parent, false)
        return CustomViewHolder(cellForRow)



    }



    override fun onBindViewHolder(holder: CustomViewHolder, position: Int) {
        val projectTitle = projectTitles[position]
        val projectDescription = projectDescriptions[position]
        val projectButton = projectButtons[position]

        //val projectImg = holder?.view?.imageView5

        holder?.view?.textView_projectTitle.text = projectTitle
        holder?.view?.textView_projectDescription.text = projectDescription
        holder?.view?.button_link.text = projectButton
        holder?.view?.button_link.setTextColor(Color.WHITE)
        holder?.view?.button_link.setBackgroundColor(ContextCompat.getColor( holder?.view.context, R.color.colorAccent))

        //Picasso.get().load("http://i.imgur.com/DvpvklR.png").into(projectImg)


    }


    class CustomViewHolder(val view: View) : RecyclerView.ViewHolder(view) {

    }

}

