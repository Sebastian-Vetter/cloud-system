package de.aptcode.cloud.api.services

interface ICallbackService<T> {

    fun execute(result: T)
    fun error(error: String)

}