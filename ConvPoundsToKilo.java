import java.util.Scanner;

class ConvPoundsToKilo 
{
	public static void main(String[] args) 
	{
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter the pounds value:");
	float pounds=sc.nextFloat();
	float kilo=0.454f*pounds;
	System.out.println("the "+pounds+"pounds is:"+kilo +"Killogram");
	}
}
