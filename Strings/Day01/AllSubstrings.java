
public class AllSubstrings {
    
    public static void main(String[] args) {
        
        String s = "Rajat";
        mySubstring(s);

    }

    //Using substring method of String class
	// public  static void mySubstring(String s) {

    //     for(int i=0;i<s.length();i++) {
            
    //         for(int j=i+1;j<=s.length();j++) {

    //             System.out.println(s.substring(i,j));
    //         }
    //     }
	// }



    //Using normal for loop
    public  static void mySubstring(String s) {

            for(int i=0;i<s.length();i++) {
                
                for(int j=i+1;j<=s.length();j++) {
    
                    for(int k=i;k<j;k++) {
                        System.out.print(s.charAt(k));
                    }

                    System.out.println();
                }
            }
        }
}
