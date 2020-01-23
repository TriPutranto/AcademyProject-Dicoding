package com.triputranto.academy.ui.reader

import androidx.lifecycle.ViewModel
import com.triputranto.academy.data.ModuleEntity
import com.triputranto.academy.data.source.AcademyRepository

/**
 * Created by Ahmad Tri Putranto on 22/01/2020.
 * */
class CourseReaderViewModel(private val academyRepository: AcademyRepository) : ViewModel() {
    private lateinit var courseId: String
    private lateinit var moduleId: String

    fun setSelectedCourse(courseId: String) {
        this.courseId = courseId
    }

    fun setSelectedModule(moduleId: String) {
        this.moduleId = moduleId
    }

    fun getModules(): ArrayList<ModuleEntity> = academyRepository.getAllModulesByCourse(courseId)

    fun getSelectedModule(): ModuleEntity = academyRepository.getContent(courseId, moduleId)
}