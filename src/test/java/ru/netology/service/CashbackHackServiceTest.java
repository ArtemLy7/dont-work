package ru.netology.service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.*;

class CashbackHackServiceTest {

    @ParameterizedTest
    @CsvFileSource(resources = "/CashbackData.csv", numLinesToSkip = 1)
    void shouldReturnCashback (int amount, int expected, String message) {
        CashbackHackService chs = new CashbackHackService();

        int actual = chs.remain(amount);

        assertEquals(expected, actual, message);
    }
}