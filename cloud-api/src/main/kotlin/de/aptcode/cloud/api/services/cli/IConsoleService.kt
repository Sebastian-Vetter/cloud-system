package de.aptcode.cloud.api.services.cli


import de.aptcode.cloud.common.enums.ConsoleState
import org.jline.reader.LineReader
import org.jline.reader.Parser
import org.jline.terminal.TerminalBuilder

interface IConsoleService {

    //parameters
    val terminal: TerminalBuilder
    val parser: Parser
    val state: ConsoleState
    val reader: LineReader

    // console booting func
    fun boot(): Boolean

    // console exiting func
    fun exit(): Boolean

    // console updating func
    fun update(): Boolean

}