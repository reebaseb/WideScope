import java.io.*;
import java.util.*;

class Main_menu extends Headertop            // Headertop has function for Utility
{
	public static void menu_disp()throws Exception
	{
		Scanner sc=new Scanner(System.in);
		int choice;

		clearcls();			      //Clears the Screen defined in Headertop		headerone();		    //Prints beginning title of the Project

		graduation_cap();		  // Pattern display of graduation cap
		longdelay();
		longdelay();

		System.out.println("\n\n\n");
		centeralignmsg("Please Press 'Enter' to continue...");
		sc.nextLine();

		System.out.println("");
		clearcls();
		header();			//Prints beginning title of the Project

		head("-----------------MAIN MENU------------------");
		centeralign("1] I am an Admin,Please log me in");
		centeralign("2] I am a User,Please log me in");
		centeralign("3] Exit");

		do
		{
			centeralign("Please enter a Valid Choice");
			centeralignmsg("");
			choice=Integer.parseInt(enterInt());
		}while(choice<=0 || choice>3);

		clearcls();
		
		switch(choice)
		{
			case 1:
			AdminLogin.login();
			break;

			case 2:
			UserMenu.menu();
			break;

			case 3:
			Headertop.exit();
			break;

			default:
			break;
		}
	}







	public static void main(String args[])
	{
		Main_menu obj=new Main_menu();
		try
		{
			obj.menu_disp();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
