package com.triputranto.academy.di

import android.content.Context
import com.triputranto.academy.data.source.AcademyRepository
import com.triputranto.academy.data.source.local.LocalDataSource
import com.triputranto.academy.data.source.local.room.AcademyDatabase
import com.triputranto.academy.data.source.remote.RemoteDataSource
import com.triputranto.academy.utils.AppExecutors
import com.triputranto.academy.utils.JsonHelper

/**
 * Created by Ahmad Tri Putranto on 23/01/2020.
 * */
object Injection {
    fun provideRepository(context: Context): AcademyRepository {

        val database = AcademyDatabase.getInstance(context)

        val remoteDataSource = RemoteDataSource.getInstance(JsonHelper(context))
        val localDataSource = LocalDataSource.getInstance(database.academyDao())
        val appExecutors = AppExecutors()

        return AcademyRepository.getInstance(remoteDataSource, localDataSource, appExecutors)
    }
}