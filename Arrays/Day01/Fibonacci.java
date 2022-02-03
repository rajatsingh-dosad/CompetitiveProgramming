
//Fibonacci number

public class Fibonacci {
 
    public static int fib(int n) {

        int[] arr = new int[n];

        arr[0] = 0;
        arr[1] = 1;

        for(int i=2;i<arr.length;i++) {

            arr[i]= arr[i-1] + arr[i-2];
        }

        return arr[n-1];
    }

    public static void main(String[] args) {
        
        System.out.println("Enter the element you want to find it's fibonacci: ");
        int num = Integer.parseInt(System.console().readLine());

        int fibNo = fib(num);

        System.out.println("The fibonacci number is: "+fibNo);

    }
}
