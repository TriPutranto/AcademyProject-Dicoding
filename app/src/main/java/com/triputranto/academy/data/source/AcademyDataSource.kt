package com.triputranto.academy.data.source

import com.triputranto.academy.data.CourseEntity
import com.triputranto.academy.data.ModuleEntity

/**
 * Created by Ahmad tri Putranto on 23/01/2020.
 * */
interface AcademyDataSource {
    fun getAllCourses(): List<CourseEntity>

    fun getBookmarkedCourses(): List<CourseEntity>

    fun getCourseWithModules(courseId: String): CourseEntity

    fun getAllModulesByCourse(courseId: String): List<ModuleEntity>

    fun getContent(courseId: String, moduleId: String): ModuleEntity
}