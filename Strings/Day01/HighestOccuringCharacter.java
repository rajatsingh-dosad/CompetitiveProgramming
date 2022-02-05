
class HighestOccuringCharacter {


    //Approach 1: Using extra space for characters i.e 256
    public static void highestOccuringChar(String s) {

        int[] arr = new int[256];
        char c = '\0';
        int count = 0;
        for(int i=0;i<s.length();i++) {

            char ch = s.charAt(i);
            arr[ch-1] += 1;
        }

        for(int i=0;i<arr.length;i++) {

            if(arr[i] > count) {
                count = arr[i];
                c = (char)(i+1);
            }
        }
        System.out.println("The highest occuring character is "+c+" : "+count);
    }



    public static void main(String[] args) {
        
        String s = "ababcAAAAAAAdfbabab";
        highestOccuringChar(s);

    }
}