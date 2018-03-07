import java.util.Stack;

/**
 * filename:
 * project: trappingwater
 * author: https://github.com/vvmk
 * date: 3/7/18
 */
public class StackAttempt {
    public static long trapWater(int[] input) {
        long sum = 0;
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < input.length; i++) {
            while (!stack.empty() && input[i] > input[stack.peek()]) { // input[head] is definitely bounded by current
                int last = stack.pop();

                if (stack.empty()) // no left wall
                    break;

                long distance = i - stack.peek() - 1;
                long bound = Math.min(input[i], input[stack.peek()]) - input[last];

                sum += distance * bound;
            }

            stack.push(i);
        }
        return sum;
    }
}
