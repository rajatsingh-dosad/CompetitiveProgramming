
//Problem to check if array is sorted or not

import java.util.Scanner;

public class CheckArraySortedOrNot {

    public static boolean sort(int[] arr) {

        boolean isSorted = true;
        for(int i=0;i<arr.length-1;i++) {

            if(arr[i] < arr[i+1])
                continue;
            else
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size ofa array: ");
        int size = sc.nextInt();

        int[]  arr = new int[size];

        System.out.println("Enter the elements in the array: ");
        for(int i=0;i<arr.length;i++) {

            arr[i] = sc.nextInt();
        }

        if(sort(arr)==true)
            System.out.println("The array is sorted");
        else
            System.out.println("The array is not sorted");

    }
}
