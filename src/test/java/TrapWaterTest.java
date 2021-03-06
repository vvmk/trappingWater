import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Random;

/**
 * filename:
 * project: trappingwater
 * author: https://github.com/vvmk
 * date: 3/7/18
 */
public class TrapWaterTest {
    private static final int numbers = 934;
    private static final int[] big = new int[numbers];

    //STACK VS BRUTE FORCE TESTS: Random(69).nextInt(11);
    // len : total:
    // 900 : 4538 : MATCH
    // 950 : brute: 4782 , stack: 4794 : NO MATCH
    // 925 : 4673 : MATCH
    // 930 : 4712 : MATCH
    // 940 : stack: 4736 , brute 4704 : NO MATCH
    // 935 : stack: 4716 , brute 4712 : NO MATCH
    // 934 : 4715 : MATCH
    // 933 : 4715 : MATCH
    // 932 : 4715 : MATCH
    //
    // both methods return identical results up to 934 entries given Random(69).nextInt(11)

    @Before
    public void setup() {
        Random rand = new Random(69);
        for (int i=0;i<numbers;i++) {
            big[i] = rand.nextInt(11);
        }
    }

    @Test
    public void testBruteSmall() {
        long expected = 10;
        int[] input = {3, 0, 0, 2, 0, 4};
        long actual = FirstAttempt.trapMoreWater(input);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testBruteBig() {
        long expected = 4715;
        long actual = FirstAttempt.trapMoreWater(big);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testStackSmall() {
        long expected = 10;
        int[] input = {3, 0, 0, 2, 0, 4};
        long actual = StackAttempt.trapWater(input);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testStackBig() {
        long expected = 4715;
        long actual = StackAttempt.trapWater(big);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testControlSmall() {
        long expected = 5;
        int[] input = {3, 2, 1, 2, 3, 4, 2, 3, 2, 1};
        long bruteActual = FirstAttempt.trapMoreWater(input);
        long stacktual = StackAttempt.trapWater(input);

        Assert.assertEquals(expected, stacktual);
        Assert.assertEquals(stacktual, bruteActual);
    }

    @Test
    public void testControlMedium() {
        long expected = 160;
        int[] input = {3, 2, 1, 2, 3, 4, 2, 3, 2, 1, 5, 3, 2, 1, 1, 0, 8, 8, 5, 7, 3, 4, 2, 2, 1, 0, 0, 3, 1, 9, 3, 8, 0, 7, 0, 6, 0, 2, 0, 9, 8, 9, 2, 4, 3, 3, 4, 6 };

        long bruteActual = FirstAttempt.trapMoreWater(input);
        long stacktual = StackAttempt.trapWater(input);

        Assert.assertEquals(expected, stacktual);
        Assert.assertEquals(expected, bruteActual);
        Assert.assertEquals(stacktual, bruteActual);
    }
}