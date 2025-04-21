import java.util.Scanner;

class Calculator 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter num1:");
		double num1=sc.nextDouble();
		System.out.println("Enter num2:");
		double num2=sc.nextDouble();
		System.out.println("Enter Operator:");
		char op=sc.next().charAt(0);
		double output=(op=='+'?num1+num2:
			       op=='-'?num1-num2:
			       op=='*'?num1*num2:
			       op=='/'?num1/num2:
			       op=='%'?num1%num2:0.00001);
		
		String opt=num1+" "+op+" "+num2 +" = "+output;
		
		if(!(output==0.00001))
			System.out.println(opt);
	}
}
