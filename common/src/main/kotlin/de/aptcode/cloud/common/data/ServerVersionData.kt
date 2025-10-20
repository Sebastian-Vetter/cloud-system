package de.aptcode.cloud.common.data

import de.aptcode.cloud.common.enums.ServerTypes

data class ServerVersionData(
    val version: String,
    val serverType: ServerTypes,
    val downloadURL: String
)