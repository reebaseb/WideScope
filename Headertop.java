import java.io.*;
import java.util.*;

class Headertop extends Validate
{
	public static void callagain()throws Exception
	{
		int c;
		Scanner sc=new Scanner(System.in);
		
centeralign("Press Enter to continue.");
		centeralignmsg("");

		sc.nextLine();

		clearcls();
		header();
		head("MENU");

		centeralign("\n\n");
		centeralign("1] Return to Admin Menu");
		centeralign("2] Return to User Menu");

		do
		{
			centeralign("Please enter a valid value!");
			centeralignmsg(" ");
			c=Integer.parseInt(Validate.enterInt());
		}while(c>2 || c<1);

		clearcls();

		switch(c)
		{
			case 1:
			if(AdminLogin.passwd!=null)
			{
				AdminMenu.menu();
				break;
			}

			case 2:
			UserMenu.menu();
			break;


			default:
			break;
		}	//end of switch case
	}

//Function to clear screen
	public static void clearcls()throws IOException,InterruptedException
	{
		new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
	}

//Function to print table head
	public static void tablehead()throws Exception
	{
		System.out.format("+----+-------------------------+-------------------------+---------------+----------------+------+%n");
		System.out.format("|Code|       College Name      |         Address         |Contact Number |    Category    |Hostel|%n");
		System.out.format("+----+-------------------------+-------------------------+---------------+----------------+------+%n");
	}

//Function to print table end
	public static void tableend()
	{
		System.out.format("+----+-------------------------+-------------------------+---------------+----------------+------+%n");
	}

// Function to generate pattern of graduation cap
	public static void graduation_cap()
	{
		centeralign("***");
		centeralign("*******");
		centeralign("***********");
		centeralign("*****************");
		centeralign("***********************");
		centeralign("*****************************");
		centeralign("***********************************");
		centeralign("********************()%%%%%%%%%%%%%%%%%%%++");
		centeralign("   ***********************************   ##");
		centeralign("      |*****************************|    ##");
		centeralign("      ||||***********************||||    ##");
		centeralign("      |||||||*****************|||||||    ##");
		centeralign("      ||||||||||***********||||||||||    ##");
		centeralign("      ||||||||||***********||||||||||    ##");
		centeralign("      +===========*******===========+    ##");
		centeralign("                    ***                  ##");
		centeralign("                                         %%##%%");
		centeralign("                                         %%|##|%%");
		centeralign("----WIDE SCOPE----");
		centeralign("We Help You Graduate Successfully");

	}


//Function to align text in centre
	public static void centeralign(String str)
	{
int n=(105-str.length())/2;	//The screen width is 105

		for(int i=1;i<n;i++)
		{
			System.out.print(" ");
		}
		System.out.println(str);
	}


//Function to print Header(title ) of project
	public static void header()throws Exception
	{
		System.out.println("\n");
		centeralign("WIDE SCOPE - PROFESSIONAL INSTITUTES");

		System.out.println("\n");

		for(int i=0;i<=105;i++)
		{
			System.out.print("=");
			Thread.sleep(5);
		}
		System.out.println("\n");
	}

//Function to print Header for main menu
		public static void headerone()throws Exception
		{
			System.out.println("\n");
			centeralign("WIDE SCOPE- PROFESSIONAL INSTITUTES");

			System.out.println("\n");
			centeralign("WELCOME!!!Enjoy your journey with us!");

			for(int i=0;i<=105;i++)
			{
				System.out.print("=");
				Thread.sleep(5);
			}
			System.out.println("\n");
	}

//Function to print title for each function
	public static void head(String str)throws Exception
	{
		centeralign(str);

		for(int i=0;i<=105;i++)
		{
			System.out.print("*");
			Thread.sleep(5);
		}
		System.out.println("\n");
		System.out.println("\n");
	}


//Function to center align cursor
	public static void centeralignmsg(String str)
	{
		int n=(105-str.length())/2;

		for(int i=1;i<n;i++)
		{
			System.out.print(" ");
		}
		System.out.print(str);
	}


//Function for delay
	public static void longdelay()throws Exception
	{
		Thread.sleep(1000);
	}

//End program
	public static void exit()throws Exception
	{
		clearcls();
		System.out.println("\n");
		centeralign("---------WIDE SCOPE-PROFESSIONAL COLLEGES----------");
		System.out.println("\n");
		for(int i=0;i<=105;i++)
		{
			System.out.print("=");
			Thread.sleep(5);
		}
		head("\nEND OF JOURNEY......SEE YOU AGAIN!!");
		System.out.println("\n\n");
		centeralign("A VERY VERY THANK YOU!!");
		System.out.println("\n\n");
		centeralign("Hope you had a lovely User experience");
		System.out.println("\n\t");
		System.exit(0);
	}
}
