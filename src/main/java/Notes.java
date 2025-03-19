
import java.util.Arrays;

class Notes {
	public static void main(String[] args) {
		//Binary Search

		//array we are going to search through
		int numArray[] = {1, 5, 6, 7, 2, 3, 4, 6, 8, 9, 2, 234, 2, 234, 234};

		int num = 234; // number we're looking for
		int index = -1;

		Arrays.sort(numArray);

		for (int i = 0; i < numArray.length; i++) {
			System.out.print(numArray[i] + " ");
		}
		System.out.println();

		int low = 0;
		int high = numArray.length - 1;
		int mid;

		while(low <= high) {

			mid = (high + low) / 2; //Do not forget the brackets

			if (num == numArray[mid]) {
				index = mid;	
				low = high + 1; //set the while condition to false
			}
			else if (num > numArray[mid]) {
				low = mid + 1;
			}
			else { //num < numArray[mid]
				high = mid - 1;
			}
		}

		System.out.println(index); //Does not guarentee the first/last or any other occurance of an element.  Just gives the first one it finds.

	}
}
