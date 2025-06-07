package com.groupec.sampleapp.data

import com.groupec.sampleapp.entity.RocketLaunch

interface HomeRepository {
    @Throws(Exception::class) // For iOS error handle
    suspend fun getLaunches(forceReload: Boolean) : List<RocketLaunch>
}