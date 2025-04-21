import java.util.Scanner;

class  CheckChar 
{
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a character:");
		char ch=sc.next().charAt(0);
		String op=((ch>=65&&ch<=90||ch>=97&&ch<=122)?((ch>=97&&ch<=122)?(ch+"is a Lowercase Alphabet"):(ch+"is a Uppercase alpha")):((ch>=48&&ch<=57)?(ch+"is a digit"):(ch+"Is a Special Character")));
		System.out.println(op);
	}
}
