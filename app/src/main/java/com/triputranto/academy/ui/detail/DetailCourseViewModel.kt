package com.triputranto.academy.ui.detail

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import androidx.lifecycle.ViewModel
import com.triputranto.academy.data.source.AcademyRepository
import com.triputranto.academy.data.source.local.entitiy.CourseWithModule
import com.triputranto.academy.vo.Resource

/**
 * Created by Ahmad Tri Putranto on 22/01/2020.
 * */
class DetailCourseViewModel(private val academyRepository: AcademyRepository) : ViewModel() {
    val courseId = MutableLiveData<String>()

    fun setCourseId(courseId: String) {
        this.courseId.value = courseId
    }

    var courseModule: LiveData<Resource<CourseWithModule>> =
        Transformations.switchMap(courseId) { mCourseId ->
            academyRepository.getCourseWithModules(mCourseId)
        }

    fun setBookmark() {
        val moduleResource = courseModule.value
        if (moduleResource != null) {
            val courseWithModule = moduleResource.data
            if (courseWithModule != null) {
                val courseEntity = courseWithModule.mCourse
                val newState = !courseEntity.bookmarked
                academyRepository.setCourseBookmark(courseEntity, newState)
            }
        }
    }
}