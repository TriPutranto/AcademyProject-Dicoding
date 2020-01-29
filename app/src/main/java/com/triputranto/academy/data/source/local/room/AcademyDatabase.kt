package com.triputranto.academy.data.source.local.room

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.triputranto.academy.data.source.local.entitiy.CourseEntity
import com.triputranto.academy.data.source.local.entitiy.ModuleEntity

/**
 * Created by Ahmad Tri Putranto on 29/01/2020.
 * */
@Database(
    entities = [CourseEntity::class, ModuleEntity::class],
    version = 1,
    exportSchema = false
)
abstract class AcademyDatabase : RoomDatabase() {
    abstract fun academyDao(): AcademyDao

    companion object {
        @Volatile
        private var INSTANCE: AcademyDatabase? = null

        fun getInstance(context: Context): AcademyDatabase =
            INSTANCE ?: synchronized(this) {
                INSTANCE ?: Room.databaseBuilder(
                    context.applicationContext,
                    AcademyDatabase::class.java,
                    "Academies.db"
                ).build()
            }
    }
}