package solutions;

import java.util.Arrays;

/**
 * https://www.hackerrank.com/challenges/a-very-big-sum/problem
 * @author Sudharsan Pasupuleti
 */
public class VeryLongSum {

    // Complete the aVeryBigSum function below.
    static long aVeryBigSum(long[] ar) {
         return Arrays.stream(ar).sum();
    }

    public static void main(String[] args) {
        long value = aVeryBigSum(new long[]{1000000001, 1000000002, 1000000003, 1000000004, 1000000005});
        System.out.println(value);
    }
}
