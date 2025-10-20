package de.aptcode.cloud.common.data

import com.google.gson.JsonObject
import de.aptcode.cloud.api.events.SocketEvents

data class SocketMessageData(
    val event: SocketEvents,
    val data: JsonObject,
    val token: String
)