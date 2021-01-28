/**
 * This class contains a method to determine if a word is a palindrome.
 * @author Nathan Butler
 * @version 1.0
 * Lab02 - Palindrome
 * 1/28/2021
 * Spring 2021
 */
public class Palindrome {
	
	/**
	 * empty constructor
	 */
	public Palindrome() {
	}//end constructor
	
	/**
	 * This method takes a word and compares characters to check for a palindrome.
	 * @param s- lowercase word with no numbers or spaces
	 * @return true- if word is palindrome, false-everything else
	 */
	public static boolean isPalindrome(String s) {
		int i=0;
		int k=s.length()-1;
		
		while(i<k) {
			if (s.charAt(i) != s.charAt(k)) 
                return false; 
			i++;
			k--;
		}//end while
		
		return true;
	}//end isPalindrome
}//end class
