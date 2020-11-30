package _01_Lambda_Methods;

public class LambdaMethods {
	public static void main(String[] args) {
		// 1. Look at the SpecialPrinter function interface.
	
		// Here is an example of calling the printCustomMessage method with a lambda.
		// This prints the passed in String 10 times.
		printCustomMessage((s)->{
			for(int i = 0; i < 10; i++) {
				System.out.println(s);
			}
		}, "repeat");
		
		//2. Call the printCustonMessage method using a lambda so that the String prints backwards.
		printCustomMessage((s)->{
			String reverse = "";
			for(int i = s.length()-1; i >= 0; i --) {
				reverse = reverse +s.charAt(i);
			}
			System.out.println(reverse);
		}, "backwards");
		
		//3. Call the printCustonMessage method using a lambda so that the String prints with a mix between upper an lower case characters.
		printCustomMessage((s)->{
			String mixed = "";
			for(int i = 0; i < s.length(); i ++) {
				if(i % 2 == 0) {
					mixed = mixed+(s.charAt(i)+"").toUpperCase();
				}
				else {
					mixed = mixed+(s.charAt(i)+"").toLowerCase();
				}
			}
			System.out.println(mixed);
		}, "characters");
		
		//4. Call the printCustonMessage method using a lambda so that the String prints with a period in between each character.
		printCustomMessage((s)->{
			String period = "";
			for(int i = 0; i < s.length(); i ++) {
				period = period + s.charAt(i) + ".";
			}
			System.out.println(period);
		}, "period");
		//5. Call the printCustonMessage method using a lambda so that the String prints without any vowels.
		printCustomMessage((s)->{
			String noVowels = "";
			for(int i = 0; i < s.length(); i ++) {
				if(!(s.charAt(i)== 'a' || s.charAt(i)=='e' || s.charAt(i)== 'i'|| s.charAt(i)== 'o'||s.charAt(i)=='u')) {
					noVowels = noVowels + s.charAt(i);
				}
			}
			System.out.println(noVowels);
		}, "vowels");
	}
	
	public static void printCustomMessage(SpecialPrinter sp, String value) {
		sp.printSpecial(value);
	}
}
	
