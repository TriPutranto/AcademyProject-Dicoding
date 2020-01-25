package com.triputranto.academy.ui.academy

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.triputranto.academy.data.CourseEntity
import com.triputranto.academy.data.source.AcademyRepository

/**
 * Created by Ahmad Tri Putranto on 22/01/2020.
 * */
class AcademyViewModel(private val academyRepository: AcademyRepository) : ViewModel() {
    fun getCourses(): LiveData<List<CourseEntity>> = academyRepository.getAllCourses()
}