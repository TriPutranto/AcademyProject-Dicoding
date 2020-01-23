package com.triputranto.academy.data.source.remote.response

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

/**
 * Created by Ahmad Tri Putranto on 23/01/2020.
 * */
@Parcelize
data class CourseResponse(
    var id: String,
    var title: String,
    var description: String,
    var date: String,
    var imagePath: String
) : Parcelable