import java.util.Scanner;
class ConvertToPrime 
{
	public static void main(String[] args) 
	{
	Scanner sc=new Scanner(System.in);
	int num=sc.nextInt();
	boolean flag=true;
	for (int i=2;i<num ;i++ )
	{
		if (num%i==0)
		{
			flag=false;
			num++;
			i=2;
		}
	}
	System.out.println("num:"+num);
			
		
		
	}
}
