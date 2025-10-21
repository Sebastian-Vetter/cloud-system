package de.aptcode.cloud.core

import de.aptcode.cloud.api.services.booting.IBootingService
import de.aptcode.cloud.api.services.callback.ICallbackService

class CloudCore: IBootingService<CloudCore> {
    override fun boot(callback: ICallbackService<CloudCore>) {
        callback.execute(CloudCore())
    }

    override fun shutdown() {
        TODO("Not yet implemented")
    }
}