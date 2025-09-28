package de.aptcode.cloud.api.data

import com.google.gson.JsonObject
import de.aptcode.cloud.api.events.Events

data class SocketMessageData(
    val event: Events,
    val data: JsonObject,
    val token: String
)