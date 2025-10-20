package de.aptcode.cloud.api.services.booting

interface IBootingService<T> {

    fun boot()
    fun shutdown()

}