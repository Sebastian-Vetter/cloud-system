package de.aptcode.cloud.api.services.repository

interface IRepositoryService<Data, Key> {

    fun create(data: Data)
    fun delete(key: Key)
    fun get(key: Key)
    fun update(data: Data);

}