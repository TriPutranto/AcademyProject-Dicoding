package com.triputranto.academy.data.source.local.entitiy

import androidx.annotation.NonNull
import androidx.room.*

/**
 * Created by Ahmad Tri Putranto on 29/01/2020.
 * */
@Entity(
    tableName = "moduleentities",
    primaryKeys = ["moduleId", "courseId"],
    foreignKeys = [ForeignKey(
        entity = CourseEntity::class,
        parentColumns = ["courseId"],
        childColumns = ["courseId"]
    )],
    indices = [Index(value = ["moduleId"]),
        Index(value = ["courseId"])]
)
data class ModuleEntity(
    @NonNull
    @ColumnInfo(name = "moduleId")
    var moduleId: String,

    @NonNull
    @ColumnInfo(name = "courseId")
    var courseId: String,

    @NonNull
    @ColumnInfo(name = "title")
    var title: String,

    @NonNull
    @ColumnInfo(name = "position")
    var position: Int,

    @ColumnInfo(name = "read")
    var read: Boolean = false
) {
    @Embedded
    var contentEntity: ContentEntity? = null
}