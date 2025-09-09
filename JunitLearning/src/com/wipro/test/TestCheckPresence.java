package com.wipro.test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import org.junit.jupiter.api.Test;
import com.wipro.task.DailyTasks;

public class TestCheckPresence {

    @Test
    void testCheckPresenceWhenWordExists() {
        DailyTasks dt = new DailyTasks();
        boolean actualResult = dt.checkPresence("Hello World", "World");
        assertTrue(actualResult);
    }

    @Test
    void testCheckPresenceWhenWordDoesNotExist() {
        DailyTasks dt = new DailyTasks();
        boolean actualResult = dt.checkPresence("Hello World", "Java");
        assertFalse(actualResult);
    }
}
