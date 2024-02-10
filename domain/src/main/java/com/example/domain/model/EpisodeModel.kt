package com.example.domain.model

data class EpisodeModel(
    val air_date: String,
    val created: String,
    val episode: String,
    val id: String,
    val name: String,
    val characters: List<CharacterModel>
)