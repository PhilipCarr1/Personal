package interestingtimestest;

import interestingtimes.Solution;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;


public class SolutionTest {
    Solution solution = new Solution();

        @Test
        public void testOne() {
            Assert.assertEquals("Invalid result", 1, solution.solution("15:15:00", "15:15:12"));
        }
        @Test
        public void testOneA() {
            Assert.assertEquals("Invalid result", 2, solution.solution("00:00:00", "00:00:01"));
        }
        @Test
        public void testOneB() {
            Assert.assertEquals("Invalid result", 20, solution.solution("00:00:00", "00:00:59"));
        }
        @Test
        public void testOneC() {
            Assert.assertEquals("Invalid result", 0, solution.solution("12:23:00", "12:23:59"));
        }
        @Test
        public void testTwo() {
            Assert.assertEquals("Invalid result", 3, solution.solution("22:22:21", "22:22:23"));
        }
        @Test
        public void testTwentyFourHours() {
            Assert.assertEquals("Invalid result", 504, solution.solution("00:00:00", "23:59:59"));
        }
    }

