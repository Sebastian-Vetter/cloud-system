package de.aptcode.cloud.api.services

interface ICommandService {

    val commands: Map<String, ICommand>;

    fun registerCommand(command: ICommand)
    fun executeCommand(command: ICommand)

    fun getCommand(commandName: String): ICommand?
    fun getCommands(commandName: String): Map<String, ICommand>

}