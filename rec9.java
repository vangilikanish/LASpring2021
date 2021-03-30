public class rec9 {
    public static void main(String[] args){

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
    public static boolean palindrome(String s1){
        boolean result = true;
        s1 = s1.toLowerCase();        
            for(int i = 0; i<s1.length(); i++){
                if(s1.charAt(i) != s1.charAt(s1.length()-1-i)){
                    result = false;
                }
            } 
        return result;
        
    }

    public static boolean palindrome3(String s) {
		int len = s.length();
		String s2 = s.toLowerCase();
		String s3 = "";
		for(int i = 0; i < len; i++){
			if(!Character.isSpaceChar(s2.charAt(i))){
				s3 += s2.charAt(i);
			}
		}
		int len2 = s3.length();
		for(int i = 0; i < len2/2; i++) {
			if(s3.charAt(i) != s3.charAt(len2-1-i)) {
				return false;
			}
		}
		return true;
    }


    /*
    Problem 2:
    Write a recursive method, isPalindrome, which takes a String as a parameter, and returns true if the String is a palindrome.
    For the purposes of this method, you may assume Strings with a length of 0 or 1 are palindromes.
    s.charAt       				    
    s.length()
    s.substring(b, e)
    */
    

    public static boolean isPalindrome(String word) {
        // word = ""
        // word = "e"
        if (word.length() == 0 || word.length() == 1) {
            return true;
        }
        /*
        isPalindrome("racecar") -> isPalindrome("aceca") -> isPalindrome("ceb") -> isPalindrome("e")
        */
        if (word.charAt(0) == word.charAt(-1)) {
            isPalindrome(word.substring(1, word.length() - 1));
        } else {
            return false;
        }
    }

    public static boolean isPalindrome1(String s){
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
    public static boolean anagram(String w1, String w2){
        if (w1.length() == w2.length())
        {
            return true;
        }
        for (int i = 0; i < w1.length(); i++)
        {
            char a = w1.charAt(i);
            int index = w2.indexOf(a);
            if(index >= 0)
            {
                String b = w2.substring(0, index);
                String c = w2.substring(index++);
            }
        }
    }
    
    public static boolean anagram1(String word1, String word2){
            if(word1.length() != word2.length()){
                return false;
            }
            for(int i = 0; i < word1.length(); i++){
            char letter = word1.charAt(i);
            int index = word2.indexOf(letter);
            if (index == -1){
                    return false;
            }
            else{ // remove letter from word2
                    String before = word2.substring(0, index);
                    String after = word2.substring(index+1);
                    word2 = before + after;
            }
            }
            return true;
    }
      


    /*
    Problem 4:
    Assume that we have a string consisting only of letters. We want to find the longest subsequence where a single letter repeats.
    For example, in the string “abaabacccaabbbba”, the longest repeating subsequence is the four b's near the end.
    Write a method, subseq, to find the longest repeating subsequence of a String and return it.
    */

    public static String subseq(String str){
        int len = str.length();
        int longestSubsequenceStart = 0;
        int longestSubsequenceLength = 1;
        int currentSubsequenceStart = 0;
        int currentSubsequenceLength = 1;
        
        for(int index = 1; index < len; index++){
              if(str.charAt(index) == str.charAt(index-1)){
                    currentSubsequenceLength++;
                    if(currentSubsequenceLength > longestSubsequenceLength){
                       longestSubsequenceStart = currentSubsequenceStart;
                        longestSubsequenceLength = currentSubsequenceLength;
                    }
              }
           else{ // different letter, so start over
                 currentSubsequenceStart = index;
                 currentSubsequenceLength = 1;
            }
        }
        String subseq = "";
        for(int i = longestSubsequenceStart; i < longestSubsequenceStart + longestSubsequenceLength; i++){
              subseq += str.charAt(i);
        }
        return subseq;
      }
    
}
