import java.util.Scanner;
class BankOpt 
{
	public static void options() 

	{
		Scanner sc = new Scanner(System.in);
		int exit = 0;
		
		while (true)
		{
		
		System.out.println("");
		System.out.println("");
		System.out.println("          OPTIONS         ");
		System.out.println("");
		System.out.println("");
		System.out.println("         1. Check Balance ");
		System.out.println("         2. Deposit Amount ");
		System.out.println("         3. Withdraw Amount");
		System.out.println("         4. Mini Statement");
		System.out.println("");
		System.out.println("/////    Press 0 to Exit    /////");
		System.out.println("");

		
		System.out.println("Select Option");
		
		int sel = sc.nextInt();

		if( exit < sel)
		
		{

	
			switch (sel)
			
			{
				case 1:
			
					System.out.println("");
					BankOpt.balAmt();
					break;
			
				case 2:

					System.out.println("");
					BankOpt.depAmt();
					break;

				case 3:

					System.out.println("");
					BankOpt.wAmt();
					break;

				case 4:
			
					System.out.println("");
					System.out.println("MINI-STATEMENT");
				//	BankOpt.miniState();
					break;

					default:
					System.out.println("");
					System.out.println("Inavlid Option");
				}


		}

				else 
					{
						System.exit(0);
					}
		}

	}
		

	


	/* BANKING OPTION METHODS CREATION */
	

	
	
	public static void balAmt()

	{	
		System.out.println("");
		System.out.println("Your Current Balance :  "+NewUser.bal+" Rs");

	}

	public static void depAmt()

	{
		System.out.println("");
		System.out.println("Enter Amount to Deposit:");
		System.out.println("");

		Scanner sc = new Scanner(System.in);
		double dep = sc.nextDouble();

			if(dep==0 || dep <0 )

			{	System.out.println("");
				System.out.println("XXXXXXXXXXXXXXXXXXX  Can't Deposit Zero Amount   XXXXXXXXXXXXXXXXXXXX");
				System.out.println("");
			
			}

			else

			{
				NewUser.bal += dep;
				System.out.println("");
				System.out.println("..........##########     Amount Added Successfully     ##########..........");
				System.out.println("");

			}
		

	}

	public static void wAmt()

	{
		Scanner sc = new Scanner(System.in);
		double wamt;
		System.out.println("");
		System.out.println("Enter Amount to Withdraw:");
		System.out.println("");
		wamt = sc.nextDouble();
		double minibal = NewUser.bal - wamt;
		

		if (NewUser.bal ==0 )
		{	
			System.out.println("");
			System.out.println("****Insufficient Amount.. Please Deposit Some Amount and Try Again...****  ");
			System.out.println("");
			
		}

		else if(NewUser.bal < wamt )

		{
			System.out.println("");
			System.out.println("Your Current Balance :  "+NewUser.bal+" Rs");
			System.out.println("");
			System.out.println("** Please Enter Amount less than Current Balance **");
			System.out.println("");

		}


		else 
		{
			
			
			if (minibal < 100)
				
				{
					System.out.println("");
					System.out.println("*** Please maintain Minimum Balance 100 Rs ***");

				}

			else
				{
					NewUser.bal = NewUser.bal - wamt;
					System.out.println("");
					System.out.println("..........##########     Transaction Successfull    ##########..........");
					System.out.println("Your Current Balance :  "+NewUser.bal+" Rs");
					System.out.println(""); 
				} 
		
		}


	}





}
	
	

