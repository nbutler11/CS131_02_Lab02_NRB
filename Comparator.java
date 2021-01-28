/**
 * This class contains methods to compare numbers
 * for various reasons.
 * @author Nathan Butler
 * @version 1.0
 * Lab02 - Comparator
 * Spring 2021
 */
public class Comparator {

	/**
	 * Empty-argument constructor
	 */
	public Comparator() {
	  
	}//end constructor
	
		/**
	 * This method accepts two integers, determines which 
	 * is the larger of the two and returns it.
	 * @param x - integer greater than 0
	 * @param y - integer greater than 0
	 * @return largest integer (need to bound check either integer)
	 */
	public static int largestNumber(int x, int y) {
		int large=0;
		while(x>0 && y>0){
			if(x>y){
				large =x;
				return large;
			}
			else if(x<y){
				large=y;
				return large;
			}	
		}//end while
		return large;
	}//end largestNumber
	
	/**
	 * This method determines if x is a multiple of y
	 * @param x - larger number
	 * @param y - smaller number
	 * @return true or false (you do not need to bounds check, assume greater than zero)
	 */
	public static boolean isMultiple(int x, int y) {
		if(x%y == 0)
			return true;
		else
			return false;
	}//end isMultiple
	
	/**
	 * This method determines if both inputs are divisible
	 * by 10.
	 * @param x - integer greater than or equal to 10
	 * @param y - integer greater than or equal to 10
	 * @return - true if x and y are both divisible by 10, false otherwise (and if either of the numbers are less than 10)
	 */
	public static boolean bothDivisibleTen(int x, int y) {
		while(x>=10 && y>=10){
			if(x%10==0 && y%10==0)
				return true;
			else 
				return false;
		}
		return false;
	}//end bothDivisibleTen
	
	/**
	 * This method determines if a number is odd.
	 * @param x - integer greater than zero.
	 * @return - true if number is odd, false otherwise (you do not need to bounds check)
	 */
	public static boolean isOddNumber(int x) {
		if(x%2 == 0)
			return false;
		else
			return true;
	}//isOddNumber
	
}//end class

