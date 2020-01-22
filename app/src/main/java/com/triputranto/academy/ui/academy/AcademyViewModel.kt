package com.triputranto.academy.ui.academy

import androidx.lifecycle.ViewModel
import com.triputranto.academy.data.CourseEntity
import com.triputranto.academy.utils.DataDummy

/**
 * Created by Ahmad Tri Putranto on 22/01/2020.
 * */
class AcademyViewModel : ViewModel() {
    fun getCourses(): List<CourseEntity> = DataDummy.generateDummyCourses()
}