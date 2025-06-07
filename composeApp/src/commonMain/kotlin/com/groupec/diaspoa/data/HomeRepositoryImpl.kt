package com.groupec.sampleapp.data

import com.groupec.sampleapp.entity.RocketLaunch
import com.groupec.sampleapp.network.SpaceXApi

class HomeRepositoryImpl(val api: SpaceXApi) : HomeRepository {

    @Throws(Exception::class)
    override suspend fun getLaunches(forceReload: Boolean): List<RocketLaunch> {
        return api.getAllLaunches()
    }
}