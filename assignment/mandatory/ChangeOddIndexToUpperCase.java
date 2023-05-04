package week1.day2.assignment.mandatory;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		
		String test = "changeme";
		
		// a) Convert the String to character array
		
		char[] ch = test.toCharArray();
		
		// b) Traverse through each character (using loop)
		
		System.out.println("Traverse through each character (using loop)");
		
		for (int i = 0; i < ch.length; i++) {
			
			System.out.println(ch[i]);
			
		}
		
		// c)find the odd index within the loop (use mod operator)
		
		System.out.println("find the odd index within the loop (use mod operator)");
			
		for (int j = 0; j < ch.length; j++) {
			
			if(j%2 != 0)
			{
				System.out.println(ch[j]);
			}
			
		}
		
		// d)within the loop, change the character to uppercase, if the index is odd else don't change
		
		System.out.println("change the character to uppercase, if the index is odd else don't change");
		
		for (int i = 0; i < ch.length; i++) {
			
			if(i%2 != 0)
				System.out.println(Character.toUpperCase(ch[i]));
			
		}
			
		
			
		}

	}


