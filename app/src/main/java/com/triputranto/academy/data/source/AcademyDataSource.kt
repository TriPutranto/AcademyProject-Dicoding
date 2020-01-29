package com.triputranto.academy.data.source

import androidx.lifecycle.LiveData
import com.triputranto.academy.data.source.local.entitiy.CourseEntity
import com.triputranto.academy.data.source.local.entitiy.CourseWithModule
import com.triputranto.academy.data.source.local.entitiy.ModuleEntity
import com.triputranto.academy.vo.Resource

/**
 * Created by Ahmad tri Putranto on 23/01/2020.
 * */
interface AcademyDataSource {
    fun getAllCourses(): LiveData<Resource<List<CourseEntity>>>

    fun getCourseWithModules(courseId: String): LiveData<Resource<CourseWithModule>>

    fun getAllModulesByCourse(courseId: String): LiveData<Resource<List<ModuleEntity>>>

    fun getContent(moduleId: String): LiveData<Resource<ModuleEntity>>

    fun getBookmarkedCourses(): LiveData<List<CourseEntity>>

    fun setCourseBookmark(course: CourseEntity, state: Boolean)

    fun setReadModule(module: ModuleEntity)
}