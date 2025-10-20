package de.aptcode.cloud.core

import de.aptcode.cloud.api.services.booting.IBootingService

class CloudCore: IBootingService<CloudCore> {

    //Booting the cloud system
    override fun boot() {
       print("Staring")
    }

    //Exiting the cloud system
    override fun shutdown() {
        TODO("Not yet implemented")
    }

}