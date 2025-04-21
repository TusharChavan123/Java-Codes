import java.util.Scanner;
class BuzzNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int num=sc.nextInt();
		int rem=num%10;
		if (rem==7)
		{
			System.out.println(num+" Is a Buzz NUmber");
		}
		else
		{
		 if (num%7==0)
		 {
			 System.out.println(num+" Is a Buzz NUmber");
		 }
		 else
			 System.out.println(num+" Is a not Buzz NUmber");
		}
				    
				
			}
}
