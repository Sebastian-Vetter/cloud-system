package de.aptcode.cloud.api.services.cli

interface ICommand {
    val name: String;
    val descriptor: String;
    fun execute(args: List<String>);

    // Gibt die möglichen Sub-Argumente für Tab-Completion zurück
    fun tabComplete(args: List<String>): List<String> = emptyList()
}