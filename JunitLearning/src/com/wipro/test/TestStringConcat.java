package com.wipro.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.wipro.task.DailyTasks;

public class TestStringConcat {

    @Test
    void testDoStringConcat() {
        DailyTasks dt = new DailyTasks();
        String actualResult = dt.doStringConcat("Hello", "World");
        String expectedResult = "Hello World";
        assertEquals(expectedResult, actualResult);
    }
}
