package de.aptcode.cloud.core

import de.aptcode.cloud.api.services.booting.IBootingService
import de.aptcode.cloud.api.services.callback.ICallbackService

class CloudCore: IBootingService<CloudCore> {
    override fun boot(callback: ICallbackService<CloudCore>) {
        TODO("Not yet implemented")
    }

    override fun shutdown() {
        TODO("Not yet implemented")
    }
}