import java.util.Scanner;
class CheckVowel 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Alphabet:");
		char ch=sc.next().charAt(0);
		switch(ch)
			{
			
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
			case 'A':
			case 'E':
			case 'I':
			case 'O':
			case 'U':
				{
				System.out.println("IT IS VOWEL");
				break;
				}
			default:
				{
				 System.out.println("IT is a consonent");
				}
				
		}
		
	}
}
