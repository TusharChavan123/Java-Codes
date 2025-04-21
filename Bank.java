import java.util.Scanner;
class Bank 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println();
		String username1=null;
		String password1=null;
		String address=null;
		long mob=0;
		double amt=0.0;
		
		for (; ; )
		{
			System.out.println();
			System.out.println("    Welcome    ");
			System.out.println("    LDCCO BANK 25 DIN MAIN PAISA DOUBLE   ");
			System.out.println("1.Existing Customer");
			System.out.println("2.Create new Account");
			System.out.println("Enter option:");
			int opt=sc.nextInt();
			if (opt==1)
		{
			System.out.println();
			if(username1==null)
			{
				System.out.println();
				System.out.println("Plese create your account first");
				continue;
			}
			
			System.out.println("LOGIN");
			System.out.println();
			
			for (int i=3;i>=1 ;i-- )
			{
				System.out.println();
				System.out.println("username:");
				String username=sc.next();
				System.out.println("Password:");
			    String password=sc.next();
				if(username.equals(username1) && password.equals(password1))
				{
					home:
					for (; ; )
					{
						System.out.println();
						System.out.println("Home Page");
						System.out.println();
						System.out.println("1.DEPOSITE");
						System.out.println("2.WITHDRAW");
						System.out.println("3.CHECK BALANCE");
						System.out.println("4.MINI STATEMENT");
						System.out.println("5.LOGOUT");
						System.out.println();
						System.out.println("Enter the option:");
						int opt1=sc.nextInt();
						System.out.println();
						switch(opt1)
						{
							case 1:{
								System.out.println("DEPOSITE");
								System.out.println();
								System.out.println("Enter the amount:");
								double deposite=sc.nextDouble();
								amt+=deposite;
								System.out.println("Amount deposited successfully");
								System.out.println();
								break;
							}
							case 2:{
								System.out.println("Withdraw");
								System.out.println();
								System.out.println("Enter the amount:");
								double withdraw=sc.nextDouble();
								System.out.println("Enter the pin:");
								String password3=sc.next();
								if (password3.equals(password1))
								{
									if (withdraw<=amt)
									{
										amt-=withdraw;
										System.out.println("Amount debited successfully");
									}
									else
									{
										System.out.println("INSUFFICIENT FUNDS");
									}
								}
								else{
								 System.out.println("Wrong pin");
								}
								break;
							}
							case 3:{
						
							 System.out.println("Check Balance");
							 System.out.println();
							 for (int j=3;j>=1 ;j-- )
							 {
								 System.out.println();
								 System.out.println("Enter the pin:");
								 String password2=sc.next();
								 if (password2.equals(password1))
								 {
									 System.out.println("Your balance :"+amt);
									 continue home;
								 }
								 else{
								 System.out.println("Wrong pin");
								 System.out.println("Attempt left:"+(j-1));
								 }
							 }
							System.out.println("YOUR ACCOUNT IS BLOCKED FOR 24 HOURS");
							System.exit(0);
							break;
							}
							case 4:{
							System.out.println("Mini Stmt");
							break;
							}
							case 5:{
							System.out.println("Thanks for visiting visit again.");
							System.exit(0);
							}
						}
					}
				}
				else{
				System.out.println("Invalid cred");
				 System.out.println("Attempt left:"+(i-1));
				}
			}
			System.out.println("Thank you and never visit again");
			System.exit(0);
		}
		else if(opt==2)
		{
			System.out.println();
			System.out.println("ACCOUNT CREATION");
			System.out.println("Username:");
		    username1=sc.next();
			System.out.println("Password:");
		    password1=sc.next();
			System.out.println("address:");
			address=sc.next();
			System.out.println("Enter your PhoneNumber:");
			mob=sc.nextLong();
			System.out.println("Enter deposite Amount:");
			amt=sc.nextDouble();
			System.out.println("Account Created Successfully");
			
		}
		else
			{
			System.out.println("Invalid");
			}
		}
		
		
	}
}
