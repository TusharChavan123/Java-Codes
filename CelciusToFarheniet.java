import java.util.Scanner;
class CelciusToFarheniet 
{
	public static void main(String[] args) 
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Celcius degree:");
	float celcius=sc.nextFloat();
	//for converting celcius to farheniet we use formula
	float farheniet=1.8f*celcius+32f;
	System.out.println("conversion of "+celcius+"celcius to farheniet ="+farheniet);
	
	}
}
