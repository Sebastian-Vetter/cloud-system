package de.aptcode.cloud.api.services.modules

interface ICloudModule {

    val name: String;
    val description: String;
    val version: String;
    fun onLoad()
    fun onUnload()
    fun onEnable()

}