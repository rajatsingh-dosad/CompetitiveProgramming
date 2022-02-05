
// Check if two strings are permutation of each other

public class TwoStringPermutationOfEachOther {
    
    //Approach 1: By taking char[] for both strings

    public static boolean checkPermutation(String s1, String s2) {

        boolean ans = true;
        int[] firstString = new int[26];

        for(int i=0;i<s1.length();i++) {

            firstString[s1.charAt(i)-'a'] += 1;
        }

        for(int i=0;i<s2.length();i++) {

            firstString[s2.charAt(i)-'a'] -= 1;
        }

        for(int i=0;i<26;i++) {
           
            if(firstString[i]> 0) {
                ans = false;
                break;
            }

        }

        return ans;
    }

    public static void main(String[] args) {
        
        String s1= "abcd";
        String s2= "bcae";

        if(checkPermutation(s1,s2)==true) {

            System.out.println("The tow strings are permutation of each other");
        }
    }
}
