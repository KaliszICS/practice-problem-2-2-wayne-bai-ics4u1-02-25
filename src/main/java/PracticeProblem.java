public class PracticeProblem {

	public static void main(String args[]) {
		System.out.println(binary_find(new int[] {1, 2, 3, 4, 5, 6, 67, 8, 9, 230, 555, 786, 923, 1000, 1500}, 230));
	}

	public static int sequence_find(int[] array, int num) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == num) {
				return i + 1;
			}
		}
		// return -1;
		return array.length;
	}

	public static int binary_find(int[] array, int num) {
		int searchCount = 0;
		int low = 0;
		int high = array.length - 1;
		while (low <= high) {
			int mid = (high + low) / 2;
			
			searchCount += 1;
			
			if (array[mid] > num) {
				high = mid - 1;
			} else if (array[mid] < num) {
				low = mid + 1;
			} else {
				// return mid;
				return searchCount;
			}
		}
		// return -1;
		return searchCount;
	}

public static int sequence_findString(String[] array, String findThis) {
		for (int i = 0; i < array.length; i++) {
			if (array[i].equals(findThis)) {
				return i + 1;
			}
		}
		// return -1;
		return array.length;
	}

	public static int binary_findString(String[] array, String findThis) {
		int searchCount = 0;
		int low = 0;
		int high = array.length - 1;
		while (low <= high) {
			int mid = (high + low) / 2;
			
			searchCount += 1;
			
			int compareResult = array[mid].compareTo(findThis);
			if (compareResult < 0) {
				low = mid + 1;
			} else if (compareResult > 0) {
				high = mid - 1;
			} else {
				// return mid;
				return searchCount;
			}
		}
		// return -1;
		return searchCount;
	}


	public static int[] compareSearch(int[] array, int num) {
		int[] returnValue = new int[2];

		returnValue[0] = sequence_find(array, num);
		returnValue[1] = binary_find(array, num);
		
		return returnValue;

	}
	
	public static int[] compareStringSearch(String[] array, String findThis) {
		int[] returnValue = new int[2];

		returnValue[0] = sequence_findString(array, findThis);
		returnValue[1] = binary_findString(array, findThis);
		
		return returnValue;

	}
}

/*
# Instructions  

  ## Questions
  1. Create a function called compareSearch(int[] array, int number) that searches an array for a number.
  
  Your function should:
  
  Search for the number using both a sequential search and a binary search.</br>
  Return how many loops your searches took to find the given number for each search in an integer array.</br>
  Index 0 of the array is the sequential number of loops and index 1 of the array is the binary number of loops.
  
  2. Create another function called compareStringSearch(String[] array, String word) that searches an array for a word.
  Your program should do the exact same actions as question 1 but on Strings instead of integers.
  </br>

*/