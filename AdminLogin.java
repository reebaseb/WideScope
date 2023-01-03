import java.io.*;
import java.util.*;

class AdminLogin extends Headertop
{

	static String passwd,loginname;
	static String logname,pass;
	static int ctr=0;
	static boolean flag;

	public static void login()throws Exception
	{
		Scanner scc=new Scanner(System.in);
		Scanner sc=new Scanner(new File("Password.dat"));

		header();
		head("ADMIN LOGIN");

		System.out.println();

		//To read admin login and password from Password.dat file
		while(sc.hasNextLine())
		{
			String record=sc.nextLine();
			Scanner sc1=new Scanner(record).useDelimiter(";");
			logname=sc1.next();
			pass=sc1.next();
			sc1.close();
		}
		sc.close();
do
{
     if(ctr==3)
       {
	System.out.println();
	centeralign("Login attempts exceeded!");
            centeralign("Program will end....SEE YOU SOME OTHER TIME!SWEET BYE!!");
	centeralign("*---------------------------------------------------------------------*");
		
 	longdelay();
	System.exit(0);
       }   
	flag=false;

	System.out.println("Admin Login:");
	System.out.println("\t\t\t\t");
	loginname=scc.next();

	System.out.println();
	System.out.println("Password:");

	//Console to hide the password entered
	Console con=System.console();
	passwd=new String(con.readPassword());

	for(int i=0;i<passwd.length();i++)
	System.out.print("*");

	System.out.println();




	if(loginname.equals(logname) && passwd.equals(pass))
	{
		flag=true;
		System.out.println();
		centeralign("*---------------------------------------------------------------------*");
		centeralign("Your Login is Successful!!!");
		centeralign("*---------------------------------------------------------------------*");
		longdelay();
	}
	else
	{
		ctr++;
		System.out.println();
                        centeralign("*---------------------------------------------------------------------*");
		centeralign("Wrong Admin and Password!");
		centeralign("*---------------------------------------------------------------------*");		System.out.println();
	}
       }	while(flag==false);

	clearcls();

	//Calls Admin Menu
AdminMenu.menu();
	}
}
