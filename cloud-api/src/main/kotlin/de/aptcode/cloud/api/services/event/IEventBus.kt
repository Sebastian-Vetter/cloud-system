package de.aptcode.cloud.api.services.event

import de.aptcode.cloud.common.data.Event

interface IEventBus {

    fun registerEvent(event: Event)
    fun unregisterEvent(event: Event)
    fun loadEvents(events: Collection<Event>)


}