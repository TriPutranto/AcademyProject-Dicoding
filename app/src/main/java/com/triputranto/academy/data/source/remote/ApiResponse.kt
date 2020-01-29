package com.triputranto.academy.data.source.remote

import com.triputranto.academy.data.source.remote.StatusResponse.*

/**
 * Created by Ahmad Tri Putranto on 29/01/2020.
 * */
class ApiResponse <T>(val status: StatusResponse, val body: T, val message: String?){
    companion object {
        fun <T> success(body: T): ApiResponse<T> = ApiResponse(SUCCESS, body, null)

        fun <T> empty(msg: String, body: T): ApiResponse<T> = ApiResponse(EMPTY, body, msg)

        fun <T> error(msg: String, body: T): ApiResponse<T> = ApiResponse(ERROR, body, msg)
    }
}