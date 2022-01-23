
//Find the non-duplicate number from the array
//There is just one non-duplicate number in the array rest everyone has a duplicate

import java.util.*;

public class SingleNonDuplicatePresent {

	//Brute force Approach

	// public static int nonDup(int arr[]) {
	//     int flag = 0;
	//     for(int i=0;i<arr.length;i++) {

	//         for(int j=0;j<arr.length;j++) {

	//             if(i==j)
	//                 continue;
	//             else if(arr[i]==arr[j]) {
	//                 flag = 1;
	//                 break;
	//             }
	//             else
	//                 flag = 0;
	//         }
	//         if(flag==0)
	//         return arr[i];
	//     }
	//     return 0;
	// }



	//Using XOR operator
	//Here when we do xor operation on same number then they gets cancled
	//Hence at the end only the one that doesn't have any duplicate remains
	public static int nonDup(int arr[]) {

		int num = 0;
		for(int i=0;i<arr.length;i++) {

			num = num ^ arr[i];
		}
		if(num==0)
			return 0;
		return num;
	}

	public static void main(String[] args) {

		int[] arr = {3,2,3,4 ,2,5,5,1,1};

		int num;
		if((num=nonDup(arr))!=0)
			System.out.println("The non-duplicate number is: "+num);
		else
			System.out.println("There is no non-duplicate number in the array");

	}

}
