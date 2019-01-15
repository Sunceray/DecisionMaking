import java.util.Scanner;

public class Lab3 {
	
	private static final String stdin = null;

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		System.out.println("What's your name?");
		String name = scnr.nextLine();
		
		
		
		System.out.println("Hello! " + name); 
		
	 
		int num;
        System.out.println("input number: ");
        num = scnr.nextInt();
        		
        		
		if (num % 2 == 1) {
		// odd
			System.out.println(num + " odd");
			  
		} 
		
		else if (num >= 2 && num <= 25) {
			    System.out.println(num + " even and less than 25");
		} 
		
		else if (num >= 26 && num<= 60) {
			    System.out.println(num + " even");
		} 
			
		else if (num % 2 == 0 && num > 60) {
			    System.out.println(num + " even");
		}
		
		else if (num % 2 == 0 && num > 60) {
			    System.out.println(num + " odd and over 60");
		}
			scnr.close();
		}
		}

	
	
		
		
		
