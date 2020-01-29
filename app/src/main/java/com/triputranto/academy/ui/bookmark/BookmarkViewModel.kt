package com.triputranto.academy.ui.bookmark

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.triputranto.academy.data.source.AcademyRepository
import com.triputranto.academy.data.source.local.entitiy.CourseEntity

/**
 * Created by Ahmad Tri Putranto on 22/01/2020.
 * */
class BookmarkViewModel(private val academyRepository: AcademyRepository) : ViewModel() {
    fun getBookmarks(): LiveData<List<CourseEntity>> = academyRepository.getBookmarkedCourses()
}