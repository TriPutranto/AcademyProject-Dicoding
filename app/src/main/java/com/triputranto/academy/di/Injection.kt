package com.triputranto.academy.di

import android.content.Context
import com.triputranto.academy.data.source.AcademyRepository
import com.triputranto.academy.data.source.remote.RemoteDataSource
import com.triputranto.academy.utils.JsonHelper

/**
 * Created by Ahmad Tri Putranto on 23/01/2020.
 * */
object Injection {
    fun provideRepository(context: Context): AcademyRepository {

        val remoteDataSource = RemoteDataSource.getInstance(JsonHelper(context))

        return AcademyRepository.getInstance(remoteDataSource)
    }

}