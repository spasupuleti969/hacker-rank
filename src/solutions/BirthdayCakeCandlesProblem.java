package solutions;

import java.util.Arrays;

/**
 * https://www.hackerrank.com/challenges/birthday-cake-candles/problem
 * @author Sudharsan Pasupuleti
 */
public class BirthdayCakeCandlesProblem {

    public static void main(String[] args) {

        int ar[] = {3, 2, 1, 3};
        System.out.println(birthdayCakeCandles(ar));

    }

    // Complete the birthdayCakeCandles function below.
    static int birthdayCakeCandles(int[] ar) {

        int maxHeightOfTheCandle = Arrays.stream(ar).max().getAsInt();
        Long candleCount = Arrays.stream(ar).filter(candleValue -> candleValue == maxHeightOfTheCandle).count();
        //Need to reduce the unwanted boxing and unboxing
        return candleCount.intValue();
    }
}
