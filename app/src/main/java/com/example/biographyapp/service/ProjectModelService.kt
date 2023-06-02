package com.example.biographyapp.service

import com.example.biographyapp.R
import com.example.biographyapp.models.ProjectDetail

class ProjectModelService {

    fun projectResult(): List<ProjectDetail> {
        var list = mutableListOf<ProjectDetail>()
        //val project1PicturesList : List<Int> = listOf(R.drawable.gg1,R.drawable.gg2,R.drawable.gg3,R.drawable.gg4,R.drawable.gg5)
        //val project2PicturesList : List<Int> = listOf(R.drawable.dp1,R.drawable.dp2,R.drawable.dp3,R.drawable.dp4,R.drawable.dp5)
        val project1 = ProjectDetail(
            projectName = "GoldenPopcorn",
            projectDate = "08-2022",
            projectPictures = R.drawable.gg2,
            projectSummary = "A movie app made using Flutter and Firebase where users can discover movies, rate movies, and add movies to watchlist at the same time"
        )
        val project2 = ProjectDetail(
            projectName = "DailyPlanet",
            projectDate = "01-2023",
            projectPictures = R.drawable.dp3,
            projectSummary = "It is a news application created using Java, where users can access news in various categories and read the relevant details and go to the relevant website."
        )
        val project3 = ProjectDetail(
            projectName = "BadApp",
            projectDate = "01-2021",
            projectPictures = R.drawable.ba1,
            projectSummary = "It is a quiz application where there are tests in various categories, the user can see their statistics, and invite others to a duel."
        )
        list.add(project1)
        list.add(project2)
        list.add(project3)
        return list
    }

}