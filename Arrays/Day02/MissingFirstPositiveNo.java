
//This is a Leetcode hard problem

import java.util.Arrays;

public class MissingFirstPositiveNo {

	// Approach 1- BruteForce TC- (n^2)

	// public static int missingPosNo(int arr[]) {

	// int ans = 0;
	// for(int i=0;i<arr.length;i++) {

	// int num = i+1;
	// int flag = 0;
	// for(int j=0;j<arr.length;j++) {

	// if(arr[j]==num) {
	// flag = 1;
	// continue;
	// }

	// }
	// if(flag==0) {
	// ans = num;
	// break;
	// }
	// }
	// return ans;

	// }i

	// Approach 2- Sorting the array TC- O(nlogn)
	public static int missingPosNo(int arr[]) {

		Arrays.sort(arr); // [-3,-2,1, 2, 3, 4, 5]
		int num = 1;
		int posCnt = 0;
		for (int i = 0; i < arr.length; i++) {

			if (arr[i] > 0) {

				posCnt++;
				if (arr[i] != num) {
					return num;
				}
				num++;
			}
		}
		return posCnt + 1;

	}

	// Aproach3 - First segregate the array
	// https://www.geeksforgeeks.org/find-the-smallest-positive-number-missing-from-an-unsorted-array/

	public static int segregate(int[] arr) {

		int i = 0;
		for (int j = 0; j < arr.length; j++) {

			if (arr[j] <= 0) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				i++;
			}
		}

		return i;
	}

	// public static int missingPosNo(int arr[]) {

	// 	int start = segregate(arr);

	// 	// Created new array where all the positive numbers are stored of old array
	// 	// 'arr'
	// 	int arr2[] = new int[arr.length - start];

	// 	// Storing all positive numbers of arr into arr2 from index 0 of arr2
	// 	int k = 0;
	// 	for (int i = start; i < arr.length; i++) {
	// 		arr2[k] = arr[i];
	// 		k++;

	// 	}

	// 	for (int j = 0; j < arr2.length; j++) {

	// 		int x = Math.abs(arr2[j]);
	// 		if (x - 1 < arr2.length && arr2[x - 1] > 0)
	// 			arr2[x - 1] = -arr2[x - 1];
	// 	}

	// 	for (int j = 0; j < arr2.length; j++) {
	// 		if (arr2[j] > 0)
	// 			return j + 1;
	// 	}

	// 	return arr2.length + 1;
	// }

	public static void main(String[] args) {

		int arr[] = { 2, 3, -7, 6, 8, 1, -10, 15 };

		int ans;
		if ((ans = missingPosNo(arr)) != 0)
			System.out.println("The first positive Missing no is: " + ans);
	}
}
