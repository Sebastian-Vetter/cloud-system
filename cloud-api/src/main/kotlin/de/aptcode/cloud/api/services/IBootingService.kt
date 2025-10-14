package de.aptcode.cloud.api.services

interface IBootingService<T> {

    fun boot()
    fun shutdown()

}