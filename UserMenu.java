import java.io.*;
import java.util.*;

class UserMenu extends Headertop
{
	public static void menu()throws Exception
	{
		int n=0;
		int choice;

		String code,name,address,contact,category,hostel;

		clearcls();
		header();
		head("USER MENU");

		centeralign("Greetings Dear USER! Welcome!");
		System.out.println();
		System.out.println("1] KNOW ABOUT THE FIELD YOU LIKE");
		System.out.println("2] VIEW ALL INSTITUTES");
		System.out.println("3] SEARCH INSTITUTES");
		System.out.println("4] EXIT");

		do
		{
			System.out.println("\nPlease enter a valid choice:");
			n=Integer.parseInt(Validate.enterInt());
		}while(n>4 || n<=0);



		switch(n)
		{
			case 1:
				System.out.println("Enter code of Institute('ENG','MED','MNG','DES','LAW','JOU')");
				code=Validate.enterCode();
				System.out.println();

				Information.info(code);
				callagain();
				break;

			case 2:
				System.out.println("Enter code of Institute('ENG','MED','MNG','DES','LAW','JOU')");
				code=Validate.enterCode();
				System.out.println();

				View.readfile(code);
				callagain();
				break;

			case 3:
				centeralign("Enter code of Institute('ENG','MED','MNG','DES','LAW','JOU')");
				code=Validate.enterCode();
				View.readfile(code);






	do
	{
		System.out.println("--------------------------------------------------------------------------------------------------------");
		System.out.println("--------------------------------------------------------------------------------------------------------");
		System.out.println("What would you like to Search by");
		System.out.println("1] Name ");
		System.out.println("2] Address ");
		System.out.println("3] Contact ");
		System.out.println("4] Category ");
		System.out.println("5] Hostel Facility ");
		System.out.println("6] Exit \n");

		System.out.println("Enter your Choice");
		choice=Integer.parseInt(enterInt());	     //Validating for Integer
		switch(choice)
		{
			case 1:
				System.out.println("Enter Name");
				name=enterString();

				//Search by name
				Search.searchfile(code,name);
				break;

			case 2:
				System.out.println("Enter Address");
				address=enterString();

				//Search by address
					Search.searchfile(code,address);
					break;
			case 3:
				System.out.println("Enter Contact Number");
				contact=enterContact();

				//Search by Contact num.
				Search.searchfile(code,contact);
				break;

			case 4:
				System.out.println("Enter Category(National/International)");
				category=enterCategory();

				//Search by Category
				Search.searchfile(code,category);
				break;

			case 5:
				System.out.println("Enter Hostel Facility(Yes/No)");
				hostel=enterHostel();

				//Search by hostel facility
				Search.searchfile(code,hostel);
				break;

			case 6:
				Main_menu.menu_disp();
				break;

			default:
				System.out.println("Please enter a valid choice");
		}
	}while(choice!=6);
	System.out.println("--------------------------------------------------------------------------------------------------------");
			break;

		case 4:
			exit();
			break;
		
                       default:
			System.out.println("Please enter a valid option");
			break;
		}
	}
}

