package de.aptcode.cloud.core

import de.aptcode.cloud.api.services.callback.ICallbackService


fun main() {
    val cloudCore = CloudCore();
    cloudCore.boot(callback = object: ICallbackService<CloudCore> {
        override fun execute(result: CloudCore) {
            print(result)
        }

        override fun error(error: String) {
            TODO("Not yet implemented")
        }

    })
}