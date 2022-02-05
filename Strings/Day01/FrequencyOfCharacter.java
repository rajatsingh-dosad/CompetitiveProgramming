

public class FrequencyOfCharacter {

    // Approach 1: Creating another array of 26 for alphabets 
    public static void countFrequency(String s) {
        
        int arr[] = new int[26];

        for(int i=0;i<s.length();i++) {

            arr[s.charAt(i)-'a'] += 1;
        }

        for(int i=0;i<arr.length;i++) {

            if(arr[i] > 0) {
                System.out.println("The frequency of character "+(char)(i+'a') + " is:"+arr[i]);
            }
        }
    }


    //Approach 2: Using hashmap
    // public static void countFrequency(String s) {

    //     HashMap<Character, Integer> h = new HashMap<>();

    //     for(int i=0;i<s.length();i++) {

    //         if(h.containsKey(s.charAt(i))) {
    //             int val = h.get(s.charAt(i));
    //             h.put(s.charAt(i),val+1);
    //         }
    //         else {
    //             h.put(s.charAt(i),1);
    //         }
    //     }

    //     for(Map.Entry<Character,Integer> m : h.entrySet()) {
            
    //         if(m.getValue() > 0) {
    //             System.out.println("The frequency of character "+m.getKey()+ " is: "+m.getValue());
    //         }
    //     }
    // }

    public static void main(String[] args) {
        
        String s = "abacccddab";

        countFrequency(s);
    }
}