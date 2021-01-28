/**
 * This class drives the Comparator class by instantiating it and calling the methods to compare two integers.
 * @author Nathan Butler
 * @version 1.0
 * Lab02 - ComparatorApplication
 * 1/28/2021
 * Spring 2021
 */
public class ComparatorApplication {
	public static void main(String[] args) {
		Comparator numb1 = new Comparator();
		System.out.println(numb1.largestNumber(25, 47));
		System.out.println(numb1.isMultiple(25,5));
		System.out.println(numb1.isMultiple(53,8));
		System.out.println(numb1.bothDivisibleTen(2500, 300));
		System.out.println(numb1.bothDivisibleTen(234, 700));
		System.out.println(numb1.isOddNumber(73));
		System.out.println(numb1.isOddNumber(42));

	}//end main

}//end class
