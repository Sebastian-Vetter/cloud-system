package de.aptcode.cloud.api.data

import de.aptcode.cloud.api.utils.ServerTypes

data class ServerVersionData(
    val version: String,
    val serverType: ServerTypes,
    val downloadURL: String
)