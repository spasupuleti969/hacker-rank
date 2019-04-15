/**
 * 
 */
package solutions;

import java.util.ArrayList;
import java.util.List;

/**
 * Problem : https://www.hackerrank.com/challenges/compare-the-triplets/problem
 * @author Sudharsan Pasupuleti
 *
 */
public class TripletCompare {

	
	public static void main(String[] args) {
		List<Integer> aliceList = new ArrayList<>();
        aliceList.add(17);
        aliceList.add(28);
        aliceList.add(30);
        List<Integer> bobList = new ArrayList<>();
        bobList.add(99);
        bobList.add(16);
        bobList.add(8);
        compareTriplets(aliceList, bobList).forEach(System.out::println);

	}
	
	static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        int alicePoints = 0;
        int bobPoints = 0;

        for(int i=0; i<a.size(); i++) {
            if(a.get(i) > b.get(i)) {
                alicePoints++;
            }
            else if (a.get(i) < b.get(i)) {
                bobPoints++;
            }
        }

        List<Integer> pointsList = new ArrayList<>();
        pointsList.add(alicePoints);
        pointsList.add(bobPoints);

        return pointsList;
    }

}
