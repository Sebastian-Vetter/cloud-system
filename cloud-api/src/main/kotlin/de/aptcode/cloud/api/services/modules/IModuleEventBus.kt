package de.aptcode.cloud.api.services.modules

import de.aptcode.cloud.api.services.event.IEvent

interface IModuleEventBus {

    fun subscribe(subscriber: IEvent)
    fun unsubscribe(subscriber: IEvent)
    fun publish(event: IEvent)

}