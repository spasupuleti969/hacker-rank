package solutions;

public class PlusMinusSolution {

    public static void main(String[] args) {
        plusMinus(new int [] {1,1,-1,-4,-9,0,0,6,3});
    }

    static void plusMinus(int[] arr) {

        int negativeCount = 0;
        int positiveCount = 0;
        int zeroCount = 0;

        for (int i : arr) {
            if (i > 0) {
                positiveCount++;
            } else if (i < 0) {
                negativeCount++;
            } else {
                zeroCount++;
            }
        }
        int arrayLength = arr.length;
        System.out.println((double) positiveCount/arrayLength);
        System.out.println((double) negativeCount/arrayLength);
        System.out.println((double) zeroCount/arrayLength);
    }
    }


