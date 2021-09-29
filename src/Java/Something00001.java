/* Josh Frank
| 
| Notes:
| 20-Mar-2017 21:17 :: I don't really know what I'm planning to do here...
|
*/

import java.io.*;
import java.util.*;

public class Something00001 {
	public static void main(String... args){
		System.out.println("Hello, World!");
		
		try{
			Thread.sleep(1000);
		}
		catch(InterruptedException ex){
			Thread.currentThread().interrupt();
		}
		
		System.out.println("Alright, that was a thing ...\nNow for some primes, I guess");
		
		Integer curr = 3;
		ArrayList<Integer> primes = new ArrayList<Integer>();
		primes.add(2);
		Scanner in = new Scanner(System.in);
		System.out.print("Pick a number: ");
		long max = in.nextInt();
		
		System.out.println("1 is prime");
		System.out.println("2 is prime");

		while(curr <= max){
			double currRoot = Math.sqrt(curr);
			for(Integer test : primes){
				if((curr % test) == 0){
					System.out.println(curr + " is not prime");
					break;
				}
				if(test > currRoot){
					System.out.println(curr + " is prime");
					primes.add(curr);
					break;
				}
			}
			curr++;
		}
	}
}
