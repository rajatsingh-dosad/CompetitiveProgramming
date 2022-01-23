
//Pair sum - find all the pairs in array that is equal to sum

import java.util.*;

public class PairSum {

    //BruteForce Approach (TC = O(n^2))
    // public static void sumPair(int[] arr , int sum) {

    //     for(int i=0;i<arr.length-1;i++) {

    //         for(int j=i+1;j<arr.length;j++) {
    //             if(arr[i]+arr[j]==sum)
    //                 System.out.println(arr[i]+" : "+arr[j]);
    //         }
    //     }
    // }



    //Two pointers approach

    public static void sumpair(int[] arr,int sum) {

        Arrays.sort(arr);
        int i = 0;
        int j = arr.length-1;


        while(i<j) {
            if(arr[i]+arr[j] > sum)
                j--;
            else if(arr[i]+arr[j] < sum)
                i++;
            else {
                System.out.println(arr[i]+" : "+arr[j]);
                i++;
                j--;    //Compulsory should increment i and decrement j so that it doesn't go to the loop for more time 
            }
        }         
    }


    public static void main(String[] args) {
        
        int[] arr = {10,3,5,8,44,1,12};
        int sum = 13;

        sumpair(arr,sum);
    }
}
