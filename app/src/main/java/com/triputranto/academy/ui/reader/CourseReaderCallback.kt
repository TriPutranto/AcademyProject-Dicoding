package com.triputranto.academy.ui.reader

/**
 * Created by Ahmad Tri Putranto on 22/01/2020.
 * */
interface CourseReaderCallback {
    fun moveTo(position: Int, moduleId: String)
}