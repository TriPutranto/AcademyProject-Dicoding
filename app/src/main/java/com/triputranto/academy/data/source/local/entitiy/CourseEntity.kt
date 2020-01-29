package com.triputranto.academy.data.source.local.entitiy

import androidx.annotation.NonNull
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

/**
 * Created by Ahmad Tri Putranto on 29/01/2020.
 * */
@Entity(tableName = "courseentities")
data class CourseEntity(
    @PrimaryKey
    @NonNull
    @ColumnInfo(name = "courseId")
    var courseId: String,

    @ColumnInfo(name = "title")
    var title: String,

    @ColumnInfo(name = "description")
    var description: String,

    @ColumnInfo(name = "deadline")
    var deadline: String,

    @ColumnInfo(name = "bookmarked")
    var bookmarked: Boolean = false,

    @ColumnInfo(name = "imagePath")
    var imagePath: String
)