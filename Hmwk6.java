/*=============================================================================
 |   Assignment:  HW6
 |       Author:  Rishav Kumar - rishavk@email.arizona.edu
 |
 |       Course:  CSC 245, Spring 22
 |   Instructor:  L. McCann
 | Sect. Leader:  NA
 |     Due Date:  04/08/22 3:00 pm
 |
 |     Language:  Java
 |     Packages:  None
 |  Compile/Run:  java hmwk6.java [integer value]
 |
 +-----------------------------------------------------------------------------
 |
 |  Description: Prove Fundamental theorem of Arithmetic
 |                
 |        Input:  Pass an integer in command line
 |
 |       Output:  Shows the individual prime factors to prove the FToA
 |
 |   Techniques:  Using recursion
 |
 |
 |   Known Bugs:  I haven't got any errors while testing.
 |
 *===========================================================================*/
public class hmwk6 {
    public static int factors(int x){
    /*
    Returns the largest factor for the passed integer
    parameters: integer 
    */
        for(int i=x-1;i>1;i--){
            if(x%i == 0){
                return i;
            }
        }
        return 1;
    }
    static boolean isPrime(int n)
    {
        /*
        Checks if a given number is prime.
        */

        if (n == 1)
            return false;
        for (int i = 2; i < n; i++)
            if (n % i == 0)
                return false;
  
        return true;
    }
    public static void main(String args[]){
        int x = Integer.parseInt((args[0]));
        int flagX = x;
        int indent = 0;
        System.out.println("This program will demonstrate that "+x+" is either prime\nor is the product of two or more prime numbers.");
        System.out.println();
        System.out.println();
        while(true){
            for(int i=0;i<indent;i++)
            System.out.print("    ");
            if(x/factors(x) == factors(x)){
                System.out.println(x+" = "+factors(x)+" squared; are these factors either prime or products of primes?");
            }
            else
            {
            System.out.println(x+" = "+factors(x)+" * "+x/factors(x)+"; are these factors either prime or products of primes?");
            }
            if(isPrime(x/factors(x))){
                for(int i=0;i<indent;i++)
                System.out.print("    ");
                System.out.println(x/factors(x)+" is Prime");
            }
            
            if(isPrime(factors(x))){
                System.out.println(x+" is the product of primes ("+x/factors(x)+" and "+factors(x)+" are prime or prime Products");
                for(int i=0;i<indent;i++)
                System.out.print("    ");
                System.out.println(factors(x)+" is Prime");
                break;
            }
            else
            {
                x=factors(x);
                indent++;
            }
        }
        System.out.println("As this output shows, the Fundamental Theorem of Arithmetic holds for "+flagX+".");
 
    }
}
