package codingChallenge;

public class PrimeFactorizationList {
	
	public static void main(String[] args) {
		
		for(int i = 1; i<= 1000; i++) {
			System.out.print("Prime Factors of "+i + ": ");
			primeFactor(i);
			System.out.println();
			
		}
	}
	
	private static void primeFactor(int n) {
		
		// Print the number of 2s that divide n 
        while (n % 2 == 0) { 
            System.out.print(2 + " "); 
            n /= 2; 
        } 
  
        // n must be odd at this point.  So we can 
        // skip one element (Note i = i +2) 
        for (int i = 3; i <= Math.sqrt(n); i += 2) { 
            // While i divides n, print i and divide n 
            while (n % i == 0) { 
                System.out.print(i + " "); 
                n /= i; 
            } 
        } 
  
        // This condition is to handle the case whien 
        // n is a prime number greater than 2 
        if (n > 2) 
            System.out.print(n); 

		
	}

}
