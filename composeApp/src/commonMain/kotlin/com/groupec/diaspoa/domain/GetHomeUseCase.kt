package com.groupec.sampleapp.domain

import com.groupec.sampleapp.data.HomeRepository
import com.groupec.sampleapp.entity.RocketLaunch

class GetHomeUseCase(private val repository: HomeRepository) {
    suspend operator fun invoke(forceReload: Boolean) : List<RocketLaunch> = repository.getLaunches(forceReload)
}