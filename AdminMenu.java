import java.io.*;
import java.util.*;

class AdminMenu extends Headertop
{
	
	static char choose;
	static String code;
	static boolean flag=false;

	public static void menu()throws Exception
	{
		int choice;
		String name,address,contact,category,hostel;
		Scanner sc=new Scanner(System.in);
		
            header();
		head("ADMIN MENU");

		centeralign("Greetings Dear Admin!WELCOME!");
		System.out.println();
		System.out.println("What do you wish to do?");
		System.out.println("A] ADD");
		System.out.println("M] MODIFY");
		System.out.println("D] DELETE ");
		System.out.println("V] VIEW ");
		System.out.println("S] SEARCH");
		System.out.println("E] EXIT");

		

do
{
	flag=false;
	System.out.println("Please enter a Valid Choice");

	choose=Validate.enterChar();

	if((choose=='A' || choose=='M' || choose=='D' || choose=='V' || choose=='S' || choose=='E'))
	flag=true;

}while(flag==false);

	switch(choose)
	{
		case 'A':
		//Add records to institutions file
			System.out.println();
			System.out.println("ADD RECORD");
			System.out.println("Enter code of institute('ENG','MED','MNG','DES','LAW','JOU')");
 			code=enterCode();
			Add.writerfile(code);
			break;
		case 'M':
			System.out.println();
			System.out.println("MODIFY RECORD");
			System.out.println("Enter code of  Institute('ENG','MED','MNG','DES','LAW','JOU')");
			code=enterCode();

			Modify.mod(code);
			break;


		case 'D':
			System.out.println();
			System.out.println("DELETE RECORD");
			System.out.println("Enter code of     Institute('ENG','MED','MNG','DES','LAW','JOU')");
			code=enterCode();

			Delete.del(code);
			break;


		case 'V':
			System.out.println();
			System.out.println("VIEW RECORD");
			System.out.println("Enter code of Institute('ENG','MED','MNG','DES','LAW','JOU')");
			code=enterCode();

			View.readfile(code);
			callagain();
			break;


		case 'S':
			System.out.println();
			System.out.println("SEARCH RECORD");
			System.out.println("Enter code of Institute('ENG','MED','MNG','DES','LAW','JOU')");
			code=enterCode();

			View.readfile(code);
do
{
	System.out.println("--------------------------------------------------------------------------------------------------------");
	System.out.println("What would you like to Search by");
	System.out.println("1] Name ");
	System.out.println("2] Address ");
	System.out.println("3] Contact ");
	System.out.println("4] Category ");
	System.out.println("5] Hostel Facility ");
	System.out.println("6] Exit \n");
           System.out.println("Enter your Choice");
	choice=Integer.parseInt(enterInt());	//Validating for Integer
	System.out.println("--------------------------------------------------------------------------------------------------------");
		
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
			callagain();
			break;
		default:
			System.out.println("Please enter a valid choice");
		}
	}while(choice!=6);
			break;
case 'E':
			Main_menu.menu_disp();
			break;

default:
			System.out.println("Please enter a valid option");
		}
	}
}

