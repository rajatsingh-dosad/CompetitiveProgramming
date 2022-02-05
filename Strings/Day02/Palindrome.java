


public class Palindrome {

    public static boolean palindrome(String s) {

        for(int i=0;i<s.length()/2;i++) {
            if(s.charAt(i)!=s.charAt(s.length()-1-i))
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        
        String s = "nitin";
        if(palindrome(s)==true) 
            System.out.println("The string is a palindrome");
        else    
            System.out.println("The string is not a palindrome");
    }
}
