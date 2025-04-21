import java.util.Scanner;
class DaysFinding 
{
	public static void main(String[] args) 
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the minutes:");
	long min=sc.nextLong();
	//For finding years from Minutes we want to calculate minutes in one Year
	long yearMinutes=(60*24*365);
	long years=min/yearMinutes;
	long remainingDays=min%yearMinutes;
	long days=remainingDays/(24*60);
	System.out.println("Number of years="+years+ "days are:"+days);
	}
}
