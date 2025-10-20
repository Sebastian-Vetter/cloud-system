package de.aptcode.cloud.api.services.worker

import de.aptcode.cloud.common.data.ServerVersionData

interface IWorkerService {
    // Class parameters
    val workerId: String
    val ip: String
    val port: Int
    val token: String
    var ram: Int
    val serverVersionsInstalled: List<ServerVersionData>

    // Methods of a worker
    fun connect()
    fun disconnect()
    fun startServer()
    fun stopServer()
    fun isOnline()
}