package tutorial.array;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Given an array S of n integers, are there elements a, b, c in S such that a + b + c = 0? Find all unique triplets in the array which gives the sum of zero.
 * 
 * Elements in a triplet (a,b,c) must be in non-descending order. (ie, a ¡Ü b ¡Ü c)
 * 
 * The solution set must not contain duplicate triplets.
 *
 */
public class ThreeSum {
	
	public static void main(String[] args) {
		Integer[] numbers = {-1, 0, 1, 2, -1, -4, 3};
		threeSum(numbers);
	}

	private static void threeSum(Integer[] numbers) {
		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
		Arrays.sort(numbers);
		for(int index = 0; index < numbers.length; index++) {
			if(numbers[index] > 0) break;
			for(int subIndex = index + 1; subIndex < numbers.length; subIndex++) {
				if(numbers[index] + numbers[subIndex] > 0) break;
				for(int terIndex = subIndex + 1; terIndex < numbers.length; terIndex++) {
					if(numbers[index] + numbers[subIndex] + numbers[terIndex] == 0) {
						ArrayList<Integer> elements = new ArrayList<>();
						elements.add(numbers[index]);
						elements.add(numbers[subIndex]);
						elements.add(numbers[terIndex]);
						if(!result.contains(elements)) result.add(elements);
					}
				}
			}
		}
		
		System.out.println(result.toString());
	}

}
