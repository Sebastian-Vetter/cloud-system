package de.aptcode.cloud.api.services.callback

interface ICallbackService<T> {

    fun execute(result: T)
    fun error(error: String)

}