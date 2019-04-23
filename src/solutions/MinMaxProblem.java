package solutions;

import java.util.Arrays;

/**
 * https://www.hackerrank.com/challenges/mini-max-sum/problem
 * @author Sudharsan Pasupuleti
 */
public class MinMaxProblem {

    public static void main(String[] args) {

        int [] arr = {1,2,3,4,5};
        miniMaxSum(arr);
    }

    // Complete the miniMaxSum function below.
    static void miniMaxSum(int[] arr) {

        //sorting array
        int [] sortedArray = Arrays.stream(arr).sorted().toArray();
        //Getting as Long stream since output can be greater than Int
        long sum = Arrays.stream(sortedArray).asLongStream().sum();
        long maxSum = sum-sortedArray[0];
        long minSum = sum-sortedArray[sortedArray.length-1];

        System.out.println(minSum+" "+maxSum);

    }
}
