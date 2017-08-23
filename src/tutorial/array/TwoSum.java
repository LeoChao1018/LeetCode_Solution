package tutorial.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 
 * Given an array of integers, find two numbers such that they add up to a specific target number.
 * 
 * The function twoSum should return indices of the two numbers such that they add up to the target, where index1 must be less than index2. 
 * 
 * Please note that your returned answers (both index1 and index2) are not zero-based.
 * 
 * You may assume that each input would have exactly one solution.
 * 
 *
 */
public class TwoSum {
	
	public static void main(String[] args) {
		Integer[] numbers = {7, 12, 2, 11, 15};
		int target = 9;
		twoSum(numbers, target);
	}

	private static void twoSum(Integer[] numbers, int target) {
		List<Integer> numberList =  new ArrayList<>(Arrays.asList(numbers));
		for(int index = 0; index < numberList.size(); index++) {
			int sentinel = numberList.get(index);
			int sentinelPosition = index + 1;
			int temp = target - sentinel;
			
			if(numberList.contains(temp)) {
				int position = numberList.indexOf(temp) + 1;
				if(sentinelPosition < position) {
					if(sentinel < temp) {
						System.out.println("index1 is "+sentinelPosition+", index2 is "+position);
					}
					else {
						System.out.println("index1 is "+position+", index2 is "+sentinelPosition);
					}
				}
				else {
					if(sentinel < temp) {
						System.out.println("index1 is "+position+", index2 is "+sentinelPosition);
					}
					else {
						System.out.println("index1 is "+sentinelPosition+", index2 is "+position);
					}
				}
				
				break;
			}
		}
		
	}

}
