import java.util.Scanner;
class AreaCircle 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Radius of Circle:");
		double radius=sc.nextFloat();
		double area=Math.PI*radius*radius;
		System.out.println("Area of circle of radius "+radius+"is :"+area);
		double perimeter=2*Math.PI*radius;
		System.out.println("Perimeter of circle with radius:"+radius+"is:"+perimeter);
	}
}
