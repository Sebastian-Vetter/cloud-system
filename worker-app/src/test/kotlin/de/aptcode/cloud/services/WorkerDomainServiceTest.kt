package de.aptcode.cloud.services

import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class WorkerDomainServiceTest {

    private lateinit var num: Number;

    @BeforeEach
    fun setup() {
        num = 1;
    }

    @Test
    fun `should add worker id`() {
        val workerName = "worker-name-$num";
        val workerNameShouldBe = "worker-name-1";
        assertEquals(workerNameShouldBe, workerName);
    }

}