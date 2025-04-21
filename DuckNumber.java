import java.util.Scanner;
class DuckNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		String str=sc.next();
			
			if (str.charAt(0)=='0')
			{
				System.out.println(str+"is not duck number");
			}
			else
			{
			  if (str.contains("0"))
			{
				System.out.println(str+"is duck number");
			}
			else
				System.out.println(str+"Not a duck number");
	}
}
}
