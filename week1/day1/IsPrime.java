package week1.day1;
//Logic to find the given number is Prime or Not
public class IsPrime {

	public static void main(String[] args) {
		int inputOne = 9;
		int inputTwo = 19;
		boolean isPrime = true;
		
		for (int i = 2; i < inputOne; i++) 
		{
			if ((inputOne%i) == 0)
			{
				isPrime = false;
				
			}	
			
		}
		
		if(isPrime == true)
			System.out.println("InputOne - " + inputOne + " is a Prime Number");
		else
			System.out.println("InputOne - " + inputOne + " is not a Prime Number");
		
		
		isPrime = true;
		
		for (int i = 2; i < inputTwo; i++) 
		{
			if ((inputTwo%i) == 0)
			{
				isPrime = false;
				
			}	
			
		}
		
		if(isPrime == true)
			System.out.println("InputTwo - " + inputTwo + " is a Prime Number");
		else
			System.out.println("InputTwo - " + inputTwo + " is not a Prime Number");

	}

}
