package com.triputranto.academy.ui.detail

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.triputranto.academy.data.CourseEntity
import com.triputranto.academy.data.ModuleEntity
import com.triputranto.academy.data.source.AcademyRepository

/**
 * Created by Ahmad Tri Putranto on 22/01/2020.
 * */
class DetailCourseViewModel(private val academyRepository: AcademyRepository) : ViewModel() {
    private lateinit var courseId: String

    fun setSelectedCourse(courseId: String) {
        this.courseId = courseId
    }

    fun getCourse(): LiveData<CourseEntity> = academyRepository.getCourseWithModules(courseId)

    fun getModules(): LiveData<List<ModuleEntity>> =
        academyRepository.getAllModulesByCourse(courseId)
}