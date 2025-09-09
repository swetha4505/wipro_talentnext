package com.wipro.test;

import static org.junit.Assert.assertArrayEquals;
import org.junit.Test;
import com.wipro.task.DailyTasks;

public class TestSort {

    @Test
    public void testSortValues() {
        DailyTasks dt = new DailyTasks();
        int[] unsorted = {5, 4, 3, 2, 1};
        int[] actualResult = dt.sortValues(unsorted);
        int[] expectedResult = {1, 2, 3, 4, 5};
        assertArrayEquals(expectedResult, actualResult);
    }
}
