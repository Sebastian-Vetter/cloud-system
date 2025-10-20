package de.aptcode.cloud.services

import de.aptcode.cloud.api.services.cli.IConsoleService
import io.mockk.every
import io.mockk.mockk
import org.junit.jupiter.api.Test
import kotlin.test.assertTrue

class TestICoreConsoleService {

    @Test
    fun `ConsoleService starting`() {
        val consoleService = mockk<IConsoleService>();
        every { consoleService.boot() } returns true;

        val started = consoleService.boot();

        assertTrue { started }
    }
}