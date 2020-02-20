package task.intrestcalculator;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App extends Intrest {
	Scanner s=new Scanner(System.in);
	void App()
	{
		System.out.println("Enter the type of interest you want to find\n1.SIMPLE INTEREST\n2.COMPOUND INTEREST");
		int type=s.nextInt();
		if(type==1)
		{
			System.out.println("Enter the principal amount");
			float principal_amount=s.nextFloat();
			System.out.println("Enter number of years");
			int years=s.nextInt();
			System.out.println("Enter rate of interest");
			float rate_of_interest=s.nextFloat();
			System.out.println("Simple interest is "+simple_interest(principal_amount,years,rate_of_interest));
		}
		else if(type==2)
		{
			System.out.println("Enter the principal amount");
			float principal_amount=s.nextFloat();
			System.out.println("Enter number of times to be calculated");
			int times_calc=s.nextInt();
			System.out.println("Enter number of years");
			int years=s.nextInt();
			System.out.println("Enter rate of interest");
			float rate_of_interest=s.nextFloat();
			System.out.println("Compound interest is "+compound_interest(principal_amount,times_calc,years,rate_of_interest));
		}
		else
			System.out.println("Please Enter options specified in the above list");
	}

	public static void main(String args[])
	{
		App obj1=new App();
		obj1.App();
	}

       
 }

