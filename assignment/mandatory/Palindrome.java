package week1.day2.assignment.mandatory;

public class Palindrome {

	public static void main(String[] args) {
		
		//Build a logic to find the given string is palindrome or not
	     
		/*
		 * Pseudo Code
		
		 * a) Declare A String value as"madam"
		 
		 * b) Declare another String rev value as ""
		 * c) Iterate over the String in reverse order
		 * d) Add the char into rev
		 * e) Compare the original String with the reversed String, if it is same then print palinDrome 
		 
		 * Hint: Use .equals or .equalsIgnoreCase when you compare a String 
		 */
				
			String name = "madam";
			
			String rev = "";
			
			//System.out.println(name.length());
			
			for (int i = (name.length() - 1); i >= 0; i--) {
				
				//System.out.println(name.charAt(i));
				
				rev += name.charAt(i);
				
			}
			
			if(name.equals(rev))
				System.out.println("Given string " + name + " is Palindrome");
			else
				System.out.println("Given string " + name + " is not a Palindrome");
			
			

	}

}
