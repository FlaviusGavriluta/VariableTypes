package org.example;

import org.example.utils.GetFriendsBirthYear;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    @Test
    public void getFriendsBirthYear() {
        int currentYear = 3126;
        int age = 8;
        int expected = 3118;
        assertEquals(expected, GetFriendsBirthYear.getFriendsBirthYear(currentYear, age));
    }
}