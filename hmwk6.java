public class hmwk6 {
    public static int factors(int x){
        for(int i=x-1;i>1;i--){
            if(x%i == 0){
                return i;
            }
        }
        return 1;
    }
    static boolean isPrime(int n)
    {

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
