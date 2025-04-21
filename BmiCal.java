import java.util.Scanner;
class BmiCal 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter weight in pounds:");

		float pounds=sc.nextFloat();
		System.out.println("Enter height in inches:");
		float height=sc.nextFloat();
		float weight=pounds*0.45359237f;
		float hightMeter=height*0.0254f;
		float bmi=weight/(hightMeter*hightMeter);
		System.out.println("BMI IS:"+bmi);
		
	}
}
