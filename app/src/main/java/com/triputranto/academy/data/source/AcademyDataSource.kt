package com.triputranto.academy.data.source

import androidx.lifecycle.LiveData
import com.triputranto.academy.data.CourseEntity
import com.triputranto.academy.data.ModuleEntity

/**
 * Created by Ahmad tri Putranto on 23/01/2020.
 * */
interface AcademyDataSource {
    fun getAllCourses(): LiveData<List<CourseEntity>>

    fun getBookmarkedCourses(): LiveData<List<CourseEntity>>

    fun getCourseWithModules(courseId: String): LiveData<CourseEntity>

    fun getAllModulesByCourse(courseId: String): LiveData<List<ModuleEntity>>

    fun getContent(courseId: String, moduleId: String): LiveData<ModuleEntity>
}