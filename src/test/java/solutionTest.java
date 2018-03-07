import org.junit.Assert;
import org.junit.Test;

/**
 * filename:
 * project: trappingwater
 * author: https://github.com/vvmk
 * date: 3/7/18
 */
public class solutionTest {

    @Test
    public void testSolution1() {
        int expected = 10;
        int[] input = {3, 0, 0, 2, 0, 4};
        int actual = solution.trapMoreWater(input);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSolution() {
        int expected = 5;
        int[] input = {3, 2, 1, 2, 3, 4, 2, 3, 2, 1};
        int actual = solution.trapMoreWater(input);

        Assert.assertEquals(expected, actual);
    }
}