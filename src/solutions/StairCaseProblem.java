package solutions;

/**
 * https://www.hackerrank.com/challenges/staircase/problem
 * @author Sudharsan Pasupuleti
 */

public class StairCaseProblem {

    public static void main(String[] args) {

        staircase(6);
    }

    // Complete the staircase function below.
    static void staircase(int n) {

        int spaceCount = n - 1;
        int starCount = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < spaceCount; j++) {
                System.out.print(" ");
            }
            spaceCount--;
            for (int k = 0; k < starCount; k++) {
                System.out.print("#");

            }
            starCount++;
            //To enter into the new line after printing the pattern
            System.out.println();
        }
    }
}
