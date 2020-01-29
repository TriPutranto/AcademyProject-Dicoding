package com.triputranto.academy.data.source.local

import androidx.lifecycle.LiveData
import com.triputranto.academy.data.source.local.entitiy.CourseEntity
import com.triputranto.academy.data.source.local.entitiy.CourseWithModule
import com.triputranto.academy.data.source.local.entitiy.ModuleEntity
import com.triputranto.academy.data.source.local.room.AcademyDao

/**
 * Created by Ahmad Tri Putranto on 29/01/2020.
 * */
class LocalDataSource private constructor(private val mAcademyDao: AcademyDao) {
    companion object {
        private var INSTANCE: LocalDataSource? = null
        fun getInstance(academyDao: AcademyDao): LocalDataSource =
            INSTANCE ?: LocalDataSource(academyDao)
    }

    fun getAllCourses(): LiveData<List<CourseEntity>> = mAcademyDao.getCourses()

    fun getAllBookmarkedCourse(): LiveData<List<CourseEntity>> = mAcademyDao.getBookmarkedCourse()

    fun getCoursesWithModules(courseId: String): LiveData<CourseWithModule> =
        mAcademyDao.getCourseWithModuleById(courseId)

    fun getAllModulesByCourse(courseId: String): LiveData<List<ModuleEntity>> =
        mAcademyDao.getModulesByCourseId(courseId)

    fun insertCourses(courses: List<CourseEntity>) = mAcademyDao.insertCourses(courses)

    fun insertModules(modules: List<ModuleEntity>) = mAcademyDao.insertModules(modules)

    fun setCourseBookmark(course: CourseEntity, newState: Boolean) {
        course.bookmarked = newState
        mAcademyDao.updateCourse(course)
    }

    fun getModuleWithContent(moduleId: String): LiveData<ModuleEntity> =
        mAcademyDao.getModuleById(moduleId)

    fun updateContent(content: String, moduleId: String) {
        mAcademyDao.updateModuleByContent(content, moduleId)
    }

    fun setReadModule(module: ModuleEntity) {
        module.read = true
        mAcademyDao.updateModule(module)
    }
}