package solutions;

/**
 * https://www.hackerrank.com/challenges/time-conversion/problem
 *
 * @author Sudharsan Pauspuleti
 */
public class MilitaryTimeConversion {

    public static void main(String[] args) {
        System.out.println(timeConversion("10:00:00PM"));
    }


    /*
     * Complete the timeConversion function below.
     */
    static String timeConversion(String s) {

        String[] timeArray = s.split(":");
        String time = timeArray[0];
        String secWithNotation = timeArray[2];

        if (secWithNotation.contains("PM") && !time.equals("12")) {
            int newTime = Integer.parseInt(time) + 12;
            time = String.valueOf(newTime);
        } else if (secWithNotation.contains("AM") && time.equals("12")) {
            time = "00";
        }
        StringBuilder builder = new StringBuilder(time + ":");
        builder.append(timeArray[1] + ":");
        builder.append(secWithNotation.substring(0, 2));

        return builder.toString();

    }
}
