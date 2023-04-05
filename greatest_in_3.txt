package first;

import java.util.Scanner;

public class demo {

	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		int a = sc.nextInt();
		
		int b = sc.nextInt();
		
		int c = sc.nextInt();
		
		
		if(a>b&&a>c)
		{
			System.out.println("A is greater");
		}
		
		if(a<b&&c<b)
		{
			System.out.println("B is greater");
		}
		
		if(a<c&&c>b)
		{
			System.out.println("C is greater");
		}
		if(a==c&&b==c)
		{
			System.out.println("Equal");
		}

	}

}
