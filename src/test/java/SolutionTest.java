import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionTest {
    @Test
    public void maxValueTest1() {
        int[][] events = {
                {1, 2, 4},
                {3, 4, 3},
                {2, 3, 1}
        };
        int k = 2;
        int expected = 7;
        int actual = new Solution().maxValue(events, k);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void maxValueTest2() {
        int[][] events = {
                {1, 2, 4},
                {3, 4, 3},
                {2, 3, 10}
        };
        int k = 2;
        int expected = 10;
        int actual = new Solution().maxValue(events, k);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void maxValueTest3() {
        int[][] events = {
                {1, 1, 1},
                {2, 2, 2},
                {3, 3, 3},
                {4, 4, 4}
        };
        int k = 3;
        int expected = 9;
        int actual = new Solution().maxValue(events, k);

        Assertions.assertEquals(expected, actual);
    }
}
