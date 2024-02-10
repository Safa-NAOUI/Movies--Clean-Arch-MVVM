package com.example.domain.repo

import com.example.domain.model.EpisodesModel

/**
 * Created by Safa NAOUI on 10,February,2024
 */
interface EpisodeRepository {
     suspend fun getEpisodes(page: Int): List<EpisodesModel>
}

