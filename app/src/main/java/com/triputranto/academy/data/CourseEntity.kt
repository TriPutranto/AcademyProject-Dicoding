package com.triputranto.academy.data

/**
 * Created by Ahmad Tri Putranto on 22/01/2020.
 * */
data class CourseEntity(
    var courseId: String,
    var title: String,
    var description: String,
    var deadline: String,
    var bookmarked: Boolean = false,
    var imagePath: String
)