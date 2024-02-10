package com.example.domain.model

data class CharacterModel(
    val created: String,
    val episode: EpisodeModel,
    val image: String,
    val name: String,
    val species: String
)