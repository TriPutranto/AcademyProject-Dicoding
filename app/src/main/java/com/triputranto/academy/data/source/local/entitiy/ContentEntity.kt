package com.triputranto.academy.data.source.local.entitiy

import androidx.room.ColumnInfo

/**
 * Created by Ahmad Tri Putranto on 29/01/2020.
 * */
data class ContentEntity(
    @ColumnInfo(name = "content")
    var content: String?
)