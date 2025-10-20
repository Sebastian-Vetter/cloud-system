package de.aptcode.cloud.core.api.cli.console

import de.aptcode.cloud.api.services.cli.IConsoleService
import de.aptcode.cloud.api.utils.ConsoleState
import org.jline.reader.Parser
import org.jline.terminal.TerminalBuilder

interface ICoreConsoleService: IConsoleService {

    override val terminal: TerminalBuilder
        get() = TODO("Not yet implemented")

    override val state: ConsoleState
        get() = TODO("Not yet implemented")

    override val parser: Parser
        get() = TODO("Not yet implemented")

    override fun boot(): Boolean {
        TODO("Not yet implemented")
    }

    override fun exit(): Boolean {
        TODO("Not yet implemented")
    }

    override fun update(): Boolean {
        TODO("Not yet implemented")
    }

}