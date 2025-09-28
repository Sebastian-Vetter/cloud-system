package de.aptcode.cloud.api.services

interface CallbackService<T> {

    fun execute(result: T)
    fun error(error: String)

}