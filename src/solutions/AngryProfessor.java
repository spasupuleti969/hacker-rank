package solutions;

import java.util.Arrays;

/**
 * https://www.hackerrank.com/challenges/angry-professor/problem
 *
 * @author Sudharsan Pasupuleti
 */
public class AngryProfessor {

    public static void main(String[] args) {
        int[] studentAttendance = {-58, -29, -35, -18, 43, -28, -76, 43, -13, 6};
        System.out.println(angryProfessor(6, studentAttendance));
    }

    static String angryProfessor(int k, int[] a) {

        long studentsAttendBeforehand = Arrays.stream(a).filter(time -> time <= 0).count();
        if (studentsAttendBeforehand < k) {
            return "YES";
        }
        return "NO";

    }
}
