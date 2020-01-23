package com.triputranto.academy.ui.bookmark

import androidx.lifecycle.ViewModel
import com.triputranto.academy.data.CourseEntity
import com.triputranto.academy.data.source.AcademyRepository

/**
 * Created by Ahmad Tri Putranto on 22/01/2020.
 * */
class BookmarkViewModel(private val academyRepository: AcademyRepository) : ViewModel() {
    fun getBookmarks(): List<CourseEntity> = academyRepository.getBookmarkedCourses()
}