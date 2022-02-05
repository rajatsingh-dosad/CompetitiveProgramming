

class ReverseString {
	
	//Solution 1: Iterating from the last of string
	/*public static String reverseString(String s) {

		String str1 = "";
		for(int i=s.length()-1;i>=0;i--) {

			str1= str1+s.charAt(i);
			
		}
		return str1;
	}
	*/


	//Solution 2: Converting String to char array and interchanging first and last indexes
	public static String reverseString(String s) {

		char[] arr = s.toCharArray();
		for(int i=0;i<arr.length/2;i++) {
	
			char temp = arr[i];
			arr[i] = arr[arr.length-1-i];
			arr[arr.length-1-i] = temp;

		}

		String str = new String(arr);

		return str;
	}

	public static void main(String[] args) {

		String str = "ABCDEF";

		String revStr = reverseString(str);

		System.out.println("The reversed String is: "+revStr);
	}
}
