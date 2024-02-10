package com.example.domain.usecases

import com.example.domain.model.EpisodesModel

/**
 * Created by Safa NAOUI on 10,February,2024
 */
interface GetEpisodesUseCase {
    suspend fun execute(page: Int): List<EpisodesModel>
}