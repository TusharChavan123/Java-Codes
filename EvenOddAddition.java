import java.util.Scanner;
class EvenOddAddition 
{
	public static void main(String[] args) 
	{
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter a 4 digit number:");
	int num=sc.nextInt();
	int evenSum=0;
	int oddSum=0;
	int temp=0;
	int rem=num%10;
    temp=(rem%2!=0)?(oddSum=oddSum+rem):(evenSum=evenSum+rem);
	num=num/10;
	rem=num%10;
    temp=(rem%2!=0)?(oddSum=oddSum+rem):(evenSum=evenSum+rem);
	num=num/10;
	rem=num%10;
    temp=(rem%2!=0)?(oddSum=oddSum+rem):(evenSum=evenSum+rem);
	num=num/10;
	rem=num%10;
    temp=(rem%2!=0)?(oddSum=oddSum+rem):(evenSum=evenSum+rem);
	num=num/10;
	System.out.println("EvenSum is:"+evenSum);
	System.out.println("Oddsum is:"+oddSum);
	
	
	
	
	}
}
