# CS.12.01-Tutorial.1.2.6

An array of positive integer values has the mountain property if the elements are ordered such that successive values increase until a maximum value (the peak of the mountain) is reached and then the successive values decrease. The Mountain class declaration shown below contains methods that can be used to determine if an array has the mountain property. You will implement four methods in the Mountain class.

public class Mountain {

  /** @param array an array of positive integer values
  * @param stop the last index to check
  * Precondition: 0 <= stop < array.length
  * @return true if for each j such that 0 <= j < stop, array[j] < array[j + 1] ;
  *         false otherwise
  */
  
	public static boolean isIncreasing(int[] array, int stop) {
		// To be implemented.
	}

  /** @param array an array of positive integer values
  * @param start the first index to check
  * Precondition: 0 <= start < array.length - 1
  * @return true if for each j such that start <= j < array.length - 1,
  * array[j] > array[j + 1];
  *         false otherwise
  */
  
	public static boolean isDecreasing(int[] array, int start) {
		// To be implemented.
	}

	public static int getPeakIndex(int[] array) {
		// To be implemented.
	}

	public static boolean isMountain(int[] array) {
		// To be implemented.
	}
}

a) Write the Mountain method isIncreasing. 

b) Write the Mountain method isDecreasing.

c) Write the Mountain method getPeakIndex. Method getPeakIndex returns the index of the first peak found in the parameter array, if one exists. A peak is defined as an element whose value is greater than the value of the element immediately before it and is also greater than the value of the element immediately after it. Method getPeakIndex starts at the beginning of the array and returns the index of the first peak that is found or -1 if no peak is found. 

For example, the following table illustrates the results of several calls to getPeakIndex.

<img width="729" alt="image" src="https://github.com/techarenz/CS.12.01-Tutorial.1.2.6/assets/57818506/afb187fa-0b7a-42dd-93a0-63d17213fe44">

d) Write the Mountain method isMountain. Method isMountain returns true if the values in the parameter array are ordered as a mountain; otherwise, it returns false. The values in array are ordered as a mountain if all three of the following conditions hold.

There must be a peak.
The array elements with an index smaller than the peak’s index must appear in increasing order.
The array elements with an index larger than the peak’s index must appear in decreasing order.

For example, the following table illustrates the results of several calls to isMountain.

<img width="728" alt="image" src="https://github.com/techarenz/CS.12.01-Tutorial.1.2.6/assets/57818506/736fdc97-1022-4c64-9ede-f0ca1e7166fe">

In writing the Mountain method isMountain, ensure that you use the Mountain methods isIncreasing, isDecreasing, and getPeakIndex.
