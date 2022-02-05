
//NOTE: In duplicate Question either we have to compare i and i+1 or use an boolean varaible

public class RemoveConsecutiveDuplicates {


    //Approach 2: Using toCharArray() method
    // public static String removeDup(String s) {

    //     char[] ch = s.toCharArray();

    //     int i= 0;
    //     for(int j=1;j<ch.length;j++) {

    //         if(ch[j]!=ch[i]) {

    //             i++;
    //             ch[i] = ch[j];
    //         }
    //     }

    //     String s2 = new String(ch,0,i+1);

    //     return s2;
    // }


    //Approach 1: Using normal for loop and boolean
    public static String removeDup(String s ) {

        boolean a = false;
        String s2 = ""+s.charAt(0);
        for(int j=0;j<s.length()-1;j++) {

            if(s.charAt(j)!=s.charAt(j+1)) {
                s2 += s.charAt(j+1);
            }
        }

        return s2;
    }

    public static void main(String[] args) {
        
        String s = "aabbbccdeefggg";
        s = removeDup(s);

        System.out.println("The string after removing consecutive duplicates is: "+s);
    }
}


