import java.util.Scanner;
class AutoMorficNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number:");
		int num=sc.nextInt();
		int len=0;
		for (int i=num;i>0 ;i/=10 )
		{
			len++;
		}
		int div=1;
		for (int j=1;j<=len ;j++)
		{
			div*=10;
		}
		if(num==((num*num)%div))
			System.out.println(num+"Is a AutomorficNumber");
		else
			System.out.println(num+"Is not a AutomorficNumber");
	}
}
