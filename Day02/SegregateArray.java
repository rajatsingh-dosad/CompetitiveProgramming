
//Segregate a array as negative and positive
//Note: Here we don't have the condition to segregate them in sorted manner
//i/p: -1, 1, -2, 3 , 4, -5
//o/p:	-1, -2 ,-5, 1 ,3, 4 

public class SegregateArray {

	//By using a different array to store 
	/*public static void segregate(int[] arr) {
			
		int[] arrNew = new int[arr.length];
		int inc = 0;
		for(int i=0;i<arr.length;i++) {

			if(arr[i] < 0)
				arrNew[inc++] = arr[i]; 
		}
		
		for(int i=0;i<arr.length;i++) {

			if(arr[i] >= 0)
				arrNew[inc++] = arr[i]; 
		}
		
		System.out.print("The array after segregation is: ");
		for(int num: arrNew) {

			System.out.print(num+" ");
		}
		System.out.println();


	}
	*/


	//By using two pointers approach
	//We take two pointer 'i' and 'j'
	//Let's consider 'i' points to only negative number and 'j' can always points to positive number
	//So initially 'i' and 'j' are both pointing to the first element of the array
	//If first element is positive that means we will increment 'j' since it can only point to positive number ans since it is pointing we increment it
	//If first element is negative that means we will increment 'i' since it can only point to negative number
	//Further we will stop for 'i' if it points to a positive number and will stop for 'j' if it points to negative and since they points opposite of each other we will swap both numbers and increment both of them
	//If j reaches to the end of array that means all the elements at the last are positive hence we stop
	//-2 3 4 5 -6
	//i,j points to first element so it will go in for loop and check if arr[j] < 0 ,here it is less hence it swaps but since i,j points to first elment there is n0 change in array and now it increments both i and j
	//now since the if() statement is false so here only j gets incremented and similary for number 4 and 5 and now finally j is pointing to last element i.e -6
	//now the if statement becomes true and arr[i] i.e number 3 gets swapped with number -6 
	

	public static void segregate(int[] arr) {

		int i = 0;
		
		for(int j=0;j<arr.length;j++) {

			if(arr[j] < 0) {

				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				i++;
			}
		}
		
		System.out.print("The array after segregation is: ");
		for(int num: arr) {

			System.out.print(num+" ");
		}
		System.out.println();
	}



	public static void main(String[] args) {

		int[] arr = {-1, 1, -2, 3 , 0, 4, -5};

		segregate(arr);

	}
 }
