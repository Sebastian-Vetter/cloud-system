package de.aptcode.cloud.api.services.logging

interface ILoggingService {

    fun info(message: String)
    fun debug(message: String)
    fun warn(message: String)
    fun error(message: String)

}