package nishant;
public class Demo1 {

		public static void main(String[] args)
		{
			long num=12;
			System.out.println("Enter the number to find the factorial");
			 long fact=1;
			while(num>0)
			{
				fact=fact*num;
				num--;
			}
			
			System.out.println("Factorial is " +fact);
		}


}
