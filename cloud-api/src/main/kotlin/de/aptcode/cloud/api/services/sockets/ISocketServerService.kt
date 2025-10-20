package de.aptcode.cloud.api.services.sockets

import de.aptcode.cloud.api.services.callback.ICallbackService

interface ISocketServerService<T> {

    fun start(callbackInterface: ICallbackService<T>)
    fun stop(callbackInterface: ICallbackService<T>)
    fun listen(callbackInterface: ICallbackService<T>)

}