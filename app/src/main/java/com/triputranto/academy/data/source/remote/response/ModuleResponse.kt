package com.triputranto.academy.data.source.remote.response

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

/**
 * Created by Ahmad Tri Putranto on 23/01/2020.
 * */
@Parcelize
data class ModuleResponse(
    var moduleId: String,
    var courseId: String,
    var title: String,
    var position: Int
) : Parcelable