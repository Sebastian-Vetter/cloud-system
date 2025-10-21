package de.aptcode.cloud.api.services.event

import de.aptcode.cloud.common.data.Event

interface IEvent {

    fun callAsync(event: Event)
    fun callSync(event: Event)

}