/*=============================================================================
 |   Assignment:  Program #6:  Homework #6
 |       Author:  Josiah Lane (josiahlane01@email.arizona.edu)
 |       Grader:  Ash Reed?
 |
 |       Course:  CSc 245
 |   Instructor:  L. McCann
 |     Due Date:  4/8/22 3:05pm
 |
 |  Description:  This program demonstrates if a given integer is either prime or can be shown to be expressible as the product of two or more primes.
 |
 |     Language:  Java 15
 | Ex. Packages:  N/A
 |                
 | Deficiencies:  I know of no illogical fallacies. The code does not implement proper spacing, but the logic should hold true for FToA.
 *===========================================================================*/
public class Hmwk6 {
	int intTest;
	
	public static void main(String[] args) {
		
		int num = Integer.valueOf(36);
		System.out.println("$ java Hmwk6 " + num);
		System.out.println("This program will demonstrate that " + num + " is either prime or is the product of two or more prime numbers");
		System.out.println();
		
		if(!(num >= 2)) {
			System.out.println(num + " is not a positive integer >= 2 thus is not prime or is the product of two or more prime numbers.");
		} else {
			prime(num, 0);
		}
		
		System.out.println("As this output shows, the Fundamental Theorem of Arithmetic holds for " + num);

	}

	  /*---------------------------------------------------------------------
    |  Method prime
    |
    |  Purpose:  This method checks if a number is prime
    |
    |  Pre-condition: positive integer >= 2
    |
    |  Post-condition: Integer is prime
    |
    |  Parameters:
    |      num -- integer number that we're testing for primes.
    |      iter -- integer number of iterations.
    |
    |  Returns:  
    *-------------------------------------------------------------------*/

	private static void prime(int num, int iter) {
		
		if (num%2 == 0) {
			int leftVal = num/2;
			System.out.println("    ".repeat(iter) + num + " = " + num/2 + " * " + "2; are these factors either prime or products of primes?");
			prime(leftVal, iter++);
			//System.out.println("2 is prime.");
			
		} else if (num%3==0) {
			int leftVal = num/3;
			if (num/3 == 3) {
				System.out.println(num + " = 3 squared");
			}else {
				System.out.println("    ".repeat(iter) + num + " = " + num/3 + " * " + "3; are these factors either prime or products of primes?");
			}
			
			prime(leftVal, iter++);
			//System.out.println("3 is prime.");
			
		} else if (num%5==0) {
			int leftVal = num/5;
			System.out.println("    ".repeat(iter) + num + " = " + num/2 + " * " + "5; are these factors either prime or products of primes?");
			prime(leftVal, iter++);
			//System.out.println("5 is prime.");
			
		} else if (num%7==0) {
			int leftVal = num/7;
			System.out.println("    ".repeat(iter) + num + " = " + num/2 + " * " + "7; are these factors either prime or products of primes?");
			prime(leftVal, iter++);
			//System.out.println("7 is prime/.");
			
		} else if (num%11==0) {
			int leftVal = num/11;
			System.out.println("    ".repeat(iter) + num + " = " + num/2 + " * " + "11; are these factors either prime or products of primes?");
			prime(leftVal,iter++);
			//System.out.println("11 is prime.");
		
		}
		System.out.println(num + " is prime.");
		
		
		
	}
}
