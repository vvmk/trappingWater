/**
 * filename:
 * project: trappingwater
 * author: https://github.com/vvmk
 * date: 3/7/18
 */
public class solution {
    public static void main(String[] args) {
        int[] input = {3, 0, 0, 2, 0, 4};
        System.out.println(trapWater(input));
    }

    private static int trapWater(int[] input) {
        int upperBound = (input[0] < input.length) ? input[0] : input[input.length - 1];
        int sum = 0;
        for (int i = 1; i < input.length - 1; i++) {
            int height = (input[i] > upperBound) ? upperBound : input[i];
            sum += upperBound - height;
        }
        return sum;
    }
}
