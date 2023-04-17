package nishant;

import java.util.*;

public class 	foreach{
	public static void main (String[] args) {
		
		
		
			
			System.out.println("Enter the Size of array");
			
			
				Scanner sc = new Scanner(System.in);
				
				
				int y = sc.nextInt();
				int arr1[]= new int [y];
		

	System.out.println("Enter the Elements  array");
	for(int j =0 ; j<y;j++) {
		arr1[j]= sc.nextInt();
	}
			for(int j=y-1;j>=0;j--) {
				System.out.println(arr1[j]);
		}
	}
}



