import java.util.Arrays;

/**
 * filename:
 * project: trappingwater
 * author: https://github.com/vvmk
 * date: 3/7/18
 */
public class FirstAttempt {

    // only works if simple cup shape
    private static long trapWater(int[] input) {
        int upperBound = (input[0] < input[input.length - 1]) ? input[0] : input[input.length - 1];
        long sum = 0;
        for (int i = 1; i < input.length - 1; i++) {
            sum += (upperBound - input[i]);
        }
        return sum;
    }

    //should cover everything
    public static long trapMoreWater(int[] input) {
        long sum = 0;
        int leftWall = 0;
        int possibleWall = 0;
        for (int i = 1; i < input.length; i++) {

            if (input[i] > input[i - 1]) { // went up
                possibleWall = i;

                if (input[i] >= input[leftWall]) { // trap it
                    sum += trapWater(Arrays.copyOfRange(input, leftWall, i + 1));
                    leftWall = i;
                }
            }
        }

        if (possibleWall > leftWall) // catch the last bucket
            sum += trapWater(Arrays.copyOfRange(input, leftWall, possibleWall + 1));

        return sum;
    }
}
