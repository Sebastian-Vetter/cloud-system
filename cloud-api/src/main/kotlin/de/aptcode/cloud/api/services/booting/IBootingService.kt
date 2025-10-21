package de.aptcode.cloud.api.services.booting

import de.aptcode.cloud.api.services.callback.ICallbackService

interface IBootingService<T> {

    fun boot(callback: ICallbackService<T>)
    fun shutdown(callback: ICallbackService<T>)

}