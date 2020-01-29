package com.triputranto.academy.data.source.local.entitiy

import androidx.room.Embedded
import androidx.room.Relation

/**
 * Created by Ahmad Tri Putranto on 29/01/2020.
 * */
data class CourseWithModule(
    @Embedded
    var mCourse: CourseEntity,
    @Relation(parentColumn = "courseId", entityColumn = "courseId")
    var mModules: List<ModuleEntity>
)