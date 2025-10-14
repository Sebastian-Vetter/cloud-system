package de.aptcode.cloud.api.services

interface ISocketServerService<T> {

    fun start(callbackInterface: ICallbackService<T>)
    fun stop(callbackInterface: ICallbackService<T>)
    fun listen(callbackInterface: ICallbackService<T>)

}