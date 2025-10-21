package de.aptcode.cloud.api.services.modules

import de.aptcode.cloud.api.services.event.IEventBus
import de.aptcode.cloud.api.services.logging.ILoggingService

interface CloudContext {

    val logger: ILoggingService
    val module: ICloudModule
    val eventBus: IEventBus

}