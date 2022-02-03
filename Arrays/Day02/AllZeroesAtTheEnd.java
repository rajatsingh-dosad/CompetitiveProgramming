
//Put all zeroes at the end with the condition that all other number should be in the same order

import java.util.Scanner;

public class AllZeroesAtTheEnd {

	// Approach1 : To take extra space and put first all non-zero elements in the
	// array and then all zero elements

	// Approach2: Two pointer approach
	// Same logic as SegrateNumbers only difference in if() instead of '<0'it will
	// be '!='
	// public static void allZeroesAtEnd(int[] arr) {

	// int i = 0;
	// for(int j=0;j<arr.length;j++) {

	// if(arr[j] != 0) {

	// int temp = arr[i];
	// arr[i] = arr[j];
	// arr[j] = temp;
	// i++;
	// }
	// }

	// for(int num: arr) {
	// System.out.print(num+" ");
	// }
	// System.out.println();
	// }

	public static void allZeroesAtEnd(int[] arr) {

		int i =0;
		int j = 0;

		while(j<arr.length) {

			if(arr[j]!=0) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				i++;
				j++;
			}
			else 
				j++;

		}

		for (int num : arr) {
			System.out.print(num + " ");
		}
		System.out.println();
	}


	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size of array: ");
		int size = sc.nextInt();
		int[] arr = new int[size];

		System.out.println("Enter the elements in the array: ");
		for (int i = 0; i < size; i++) {

			arr[i] = sc.nextInt();
		}
		//

		allZeroesAtEnd(arr);
	}
}
