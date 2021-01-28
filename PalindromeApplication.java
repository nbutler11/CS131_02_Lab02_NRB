/**
 * This class drives the Palindrome class by instantiating it and calling the isPalindrome method.
 * @author Nathan Butler
 * @version 1.0
 * Lab02 - PalindromeApplication
 * 1/28/2021
 * Spring 2021
 */
public class PalindromeApplication {
	public static void main(String[] args) {
		Palindrome p1 = new Palindrome();
		System.out.println(p1.isPalindrome("racecar"));
		System.out.println(p1.isPalindrome("butter"));
		
	}//end main
}//end class
