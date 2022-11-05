import java.util.Scanner;
import java.util.Random;
class NewUser 
{

	
		static String uName;  //User Name input:
		static long uMobile;  //user Mobile Number input:
		static double bal = 0.00; //current balance
		
	 public static void main(String[] args)

	{
		
		
		Scanner sc = new Scanner(System.in); //To Create Scanner Object:
		Random rnd = new Random();  //To Create Random Object:


		System.out.println("");
		System.out.println("Enter Your Full Name:  ");
		
		NewUser.uName = sc.nextLine(); //To get input name form user:
		
		System.out.println("");
		System.out.println("Enter Your Mobile Number:  ");

		NewUser.uMobile = sc.nextLong(); //To get input mobile number form user:

		
		/*CONFIRM PASSWORD: 

		CRAETING ALERT FOR WORNG PASSWORD
		...............................................................
		*/

		
		PassWord.Pass();


		/*User PIN Generation
		   
		      &
		Validation.....
		...............................................................
		*/


		PinGen.Pin();

		int b;

		for (b=0; b<1; b++ )
		{
		
			if( b<1)
			
			{

				BankOpt.options();
				--b;
				System.out.println("");
					

			}

		}
		
	}
}
	
