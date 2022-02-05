
public class NumberOfWordsInTheString {
    
    //Approach 1: Using normal for loop
    public static int countWords(String s) {

        if(s.length()==0)
            return 0;

        int cnt = 0;
        boolean a = true;

        for(int i=0;i<s.length();i++) {
            if(s.charAt(i)==' ')
                a= true;
            else if(a==true) {
                a = false;
                cnt++;
            }
        }

        return cnt; 
    }


    //Approach 2: Using split method of String class
    // public static int countWords(String s) {

    //     s = s.trim();
    //     String[] arr = s.split("\\s+");  //regular expression to remove all the space in between too
    //     return arr.length;   
    // }

    public static void main(String[] args) {
        
        String str = "a   a";
        int num = countWords(str);

        System.out.println("The number of words in the string are: "+num);

    }
}
