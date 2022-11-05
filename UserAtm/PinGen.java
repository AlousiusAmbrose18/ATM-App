import java.util.Random;
import java.util.Scanner;

class PinGen 
{
	public static void Pin() 
	{
		Scanner sc = new Scanner(System.in);
		Random rnd = new Random();

		int k;
		
			/*CREATING RANDOM 4 DIGIIT PIN

		CRAETING ALERT FOR WORNG PIN
		...............................................................
		*/



		System.out.println("");
		System.out.println("");
		System.out.println("\tHey "+NewUser.uName.toUpperCase()+"...");
		System.out.println("");
		System.out.println("");
		System.out.println("\tYour Auto-Generated User PIN is:  ");
		int r1 = rnd.nextInt(9999);
		System.out.println("");
		System.out.printf("\t          <<<<<<<<<<   [ %04d  ]    >>>>>>>>>>",r1);


		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("\tPlease Enter Your Auto-Generated User PIN to Continue  :");
		System.out.println("");
		
		
		
			int upin = sc.nextInt();

			if ( upin == r1 )
			
			{
				System.out.println("");
				System.out.println(".........................##########################  User Verified #########################...............");
				System.out.println("");
			}


			else

			{
				System.out.println("");
				System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxx Incorrect User PIN  xxxxxxxxxxxxxxxxxxxxxxxxx");
				System.out.println("");
				System.out.print("\tPlease Enter Correct User PIN :  ");
				System.out.println("");	
	
				for (k=0; k<1;k++ )
				
				{
					System.out.println("");
					upin = sc.nextInt();

						if ( upin == r1 )
					{
						System.out.println(".........................##########################  User Verified #########################.........................");
						break;
					}

					else
					{
						--k;

						System.out.println("");
						System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxx Incorrect User PIN  xxxxxxxxxxxxxxxxxxxxxxxxx");
						System.out.println("");
						System.out.print("\tPlease Enter Correct User PIN :  ");
						System.out.println("");	

					}

				}
			}
	}
}
