package com.triputranto.academy.ui.academy

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.triputranto.academy.data.source.AcademyRepository
import com.triputranto.academy.data.source.local.entitiy.CourseEntity
import com.triputranto.academy.vo.Resource

/**
 * Created by Ahmad Tri Putranto on 22/01/2020.
 * */
class AcademyViewModel(private val academyRepository: AcademyRepository) : ViewModel() {
    fun getCourses(): LiveData<Resource<List<CourseEntity>>> = academyRepository.getAllCourses()
}