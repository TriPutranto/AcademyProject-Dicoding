package com.triputranto.academy.ui.detail

import androidx.lifecycle.ViewModel
import com.triputranto.academy.data.CourseEntity
import com.triputranto.academy.data.ModuleEntity
import com.triputranto.academy.utils.DataDummy

/**
 * Created by Ahmad Tri Putranto on 22/01/2020.
 * */
class DetailCourseViewModel : ViewModel() {
    private lateinit var courseId: String

    fun setSelectedCourse(courseId: String) {
        this.courseId = courseId
    }

    fun getCourse(): CourseEntity {
        lateinit var course: CourseEntity
        val coursesEntities = DataDummy.generateDummyCourses()
        for (courseEntity in coursesEntities) {
            if (courseEntity.courseId == courseId) {
                course = courseEntity
            }
        }
        return course
    }

    fun getModules(): List<ModuleEntity> = DataDummy.generateDummyModules(courseId)
}