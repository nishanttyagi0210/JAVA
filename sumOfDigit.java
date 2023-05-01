import java.util.*;
 class sumOfDigit {
	
	public static void main(String[] args) {
		System.out.println("Hello Java");
		 int num;
		
			System.out.println("Enter a number to check whether it is palindrome or not");
			Scanner sc = new Scanner(System.in);
			 num =  sc.nextInt();
			 int sum = 0;
			while(num>0) {
				
				int rem = num%10;
		    	sum = sum+rem;
				num = num/10;
		    	
			}System.out.println("sum is" +sum);
			
			
	}
}