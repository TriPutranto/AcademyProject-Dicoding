package com.triputranto.academy.ui.bookmark

import com.triputranto.academy.data.source.local.entitiy.CourseEntity

/**
 * Created by Ahmad Tri Putranto on 22/01/2020.
 * */
interface BookmarkFragmentCallback {
    fun onShareClick(course: CourseEntity)
}
