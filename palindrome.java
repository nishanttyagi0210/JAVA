import java.util.*;
 class palindrome {
	
	public static void main(String[] args) {
		System.out.println("Hello Java");
		 int num;
		 
		 
		
		 System.out.println("Enter a number to initiate the program of palindrome no.");
			Scanner ab = new Scanner(System.in);
			int mum = ab.nextInt();
			while(mum>0) {
				System.out.println("Enter a number to check whether it is palindrome or not");
				Scanner sc = new Scanner(System.in);
			 num =  sc.nextInt();
			 int sum = 0;
			  int ori = num;
			  int rev =0;
			while(num>0) {
				
				 int rem = num%10;
		    	 rev =  rev*10+rem;
				num = num/10;
		    	
			}
			if(ori==rev) {
				System.out.println("yes it is palindrome");
			}
			
			else 
				System.out.println("no it is not  palindrome");
			
			
			
	}
}}


