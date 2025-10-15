package de.aptcode.cloud.core.api.cli.command

import de.aptcode.cloud.api.services.ICommand
import de.aptcode.cloud.api.services.ICommandService

class ICoreCommandService(override val commands: Map<String, ICommand>) : ICommandService {

    override fun registerCommand(command: ICommand) {
        TODO("Not yet implemented")
    }

    override fun executeCommand(command: ICommand) {
        TODO("Not yet implemented")
    }

    override fun getCommand(commandName: String): ICommand {
        TODO("Not yet implemented")
    }

    override fun getCommands(commandName: String): Map<String, ICommand> {
        TODO("Not yet implemented")
    }

}