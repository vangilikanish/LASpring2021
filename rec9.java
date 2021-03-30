public class rec9 {
    public static void main(String[] args){
        String s1 = new String("Bob");
        String s2 = new String("OtTo");
        String s3 = new String("nolemon");
        String s4 = new String("no melon");
        boolean pal = palindrome(s1);
    }
    /*
    Problem 1:
    A Palindrome is defined as a string that is the same both forwards and backwards. For example, "bob" and "otto" are both palindromes, while “hello” is not.
    Write a method that takes in a string and returns true if the string is a palindrome, false otherwise.
    Modify this method so that the detection is not case sensitive. For example, "Bob" and "OtTo" should now return true.
    Modify this method so that the detection ignores spaces. For example "nolemon,no melon" should now return true.
    s.length()
    s.charAt(i) 
    */

    public static boolean palindrome(String s)
    {
        s = s.toLowerCase();
        s = s.replaceAll(" ", "");

        if ()
        {
            return true;
        }
        else return false;
    }
    /*
    Problem 2:
    Write a recursive method, isPalindrome, which takes a String as a parameter, and returns true if the String is a palindrome.
    For the purposes of this method, you may assume Strings with a length of 0 or 1 are palindromes.
    s.charAt       				    
    s.length()
    s.substring(b, e)
    */
    public static boolean ispalindrome(String a){
       if(a.length()==0 || a.length()== 1){
           return true;
       }
       if(a.charAt(0)== a.charAt(a.length()-1)){
           return ispalindrome(a.substring(1, a.length()-1));
       }
       return false;
    }

    public static boolean isPalindrome(String s){
        if(s == null || s.length() == 0)
        return true;
        if(s.length() == 1) 
        return true; 
        
        char firstLetter = s.charAt(0);
        char lastLetter = s.charAt(s.length() - 1); 
        
        if(firstLetter != lastLetter)
        return false; 
        String newString = s.substring(1, s.length() - 1); 
        return isPalindrome(newString); 
    }
    
    
    

    /*
    Problem 3:
    An anagram is a rearrangement of the letters of a word to form a new word. For example, an anagram of "listen" is "silent".
    Write a method, anagram, that takes a String as input, and returns true if it is an anagram.
    */
    public static boolean anagram(String a, String b)
    {
        if (a.length() != b.length()) {
            return false;
        }
        a = a.toLowerCase();
        b = b.toLowerCase();
        char string1[] = a.toCharArray();
        char string2[] = b.toCharArray();
        int blacklist[] = new int[a.length()];
        for (int i = 0; i < a.length(); i++)
        {
            for(int j = 0; j < b.length(); j++)
            {
                if (string1[i] == string2[j])
                {
                    
                    

                }
            }
        }
    }
      

    /*
    Problem 4:
    Assume that we have a string consisting only of letters. We want to find the longest subsequence where a single letter repeats.
    For example, in the string “abaabacccaabbbba”, the longest repeating subsequence is the four b's near the end.
    Write a method, subseq, to find the longest repeating subsequence of a String and return it.
    */
}
