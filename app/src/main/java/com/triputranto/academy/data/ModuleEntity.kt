package com.triputranto.academy.data

/**
 * Created by Ahmad Tri Putranto on 22/01/2020.
 * */
data class ModuleEntity(
    var moduleId: String,
    var courseId: String,
    var title: String,
    var position: Int,
    var read: Boolean = false
){
    var contentEntity: ContentEntity? = null
}