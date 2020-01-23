package com.triputranto.academy.data.source.remote

import com.triputranto.academy.data.source.remote.response.ContentResponse
import com.triputranto.academy.data.source.remote.response.CourseResponse
import com.triputranto.academy.data.source.remote.response.ModuleResponse
import com.triputranto.academy.utils.JsonHelper

/**
 * Created by Ahmad Tri Putranto on 23/01/2020.
 * */
class RemoteDataSource private constructor(private val jsonHelper: JsonHelper) {

    companion object {
        @Volatile
        private var instance: RemoteDataSource? = null

        fun getInstance(helper: JsonHelper): RemoteDataSource =
            instance ?: synchronized(this) {
                instance ?: RemoteDataSource(helper)
            }
    }

    fun getAllCourses(): List<CourseResponse> = jsonHelper.loadCourses()

    fun getModules(courseId: String): List<ModuleResponse> = jsonHelper.loadModule(courseId)

    fun getContent(moduleId: String): ContentResponse = jsonHelper.loadContent(moduleId)

}