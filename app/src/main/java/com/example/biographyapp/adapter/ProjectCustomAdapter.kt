package com.example.biographyapp.adapter

import android.app.Activity
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.ListView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.example.biographyapp.R
import com.example.biographyapp.models.ProjectDetail

class ProjectCustomAdapter(private val context: Activity, private val list: List<ProjectDetail>) :
    ArrayAdapter<ProjectDetail>(
        context,
        R.layout.custom_project_detail_view, list
    ) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val rootView =
            context.layoutInflater.inflate(R.layout.custom_project_detail_view, null, true)

        val p_name = rootView.findViewById<TextView>(R.id.projectName)
        val p_date = rootView.findViewById<TextView>(R.id.projectDate)
        val p_summ = rootView.findViewById<TextView>(R.id.projectSummary)
        val p_pictures = rootView.findViewById<ImageView>(R.id.projectImage)

        val projectDetail = list.get(position)

        p_name.text = projectDetail.projectName
        p_date.text = projectDetail.projectDate
        p_summ.text = projectDetail.projectSummary
        Glide.with(rootView).load(projectDetail.projectPictures).into(p_pictures)

        return rootView
    }
}