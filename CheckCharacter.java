import java.util.Scanner;
class CheckCharacter 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		char ch=sc.next().charAt(0);
		String str=((ch>=65&&ch<=90)?("uppercase"):("not uppercase"));
		System.out.println(str);
	}
}
