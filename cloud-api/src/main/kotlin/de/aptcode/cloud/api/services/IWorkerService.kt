package de.aptcode.cloud.api.services
import de.aptcode.cloud.api.data.ServerVersionData

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