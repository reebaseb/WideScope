import java.io.*;
import java.util.*;

class View extends Headertop
{
	public static void readfile(String code)throws Exception
	{
		Scanner sc=new Scanner(new File("Institutions.dat"));

		clearcls();
		header();
		head("VIEW INSTITUTES");

		if(code.equals("ENG")==true)
		{
			centeralign("WELCOME TO THE WORLD OF ENGINEERING!!");
			centeralign("You have a neat choice indeed!");
			centeralign("Happy Searching!");
		}

		if(code.equals("MED")==true)
		{
			centeralign("WELCOME TO THE WORLD OF MEDICINE!!");
			centeralign("You have a neat choice indeed!");
			centeralign("Happy Searching!");
		}

		if(code.equals("MNG")==true)
		{
			centeralign("WELCOME TO THE WORLD OF MANAGEMENT!!");
			centeralign("You have a neat choice indeed!");
			centeralign("Happy Searching!");
		}

		if(code.equals("DES")==true)
		{
			centeralign("WELCOME TO THE WORLD OF DESIGNING!!");
			centeralign("You have a neat choice indeed!");
			centeralign("Happy Searching!");
		}

		if(code.equals("LAW")==true)
		{
			System.out.println("WELCOME TO THE WORLD OF lAW!!");
			System.out.println("You have a neat choice indeed!");
			System.out.println("Happy Searching!");
		}

		if(code.equals("JOU")==true)
		{
			System.out.println("WELCOME TO THE WORLD OF JOURNALISM!!");
			System.out.println("You have a neat choice indeed!");
			System.out.println("Happy Searching!");
		}
		System.out.println();

		tablehead();

		String name, address, contact, category, hostel,c,cid;
		String record;


		while(sc.hasNextLine())
		{
			record=sc.nextLine();
			Scanner sc1=new Scanner(record).useDelimiter(";");
			c=sc1.next();
			cid=sc1.next();

			if(c.equals(code)==true)
			{
				name=sc1.next();
				address=sc1.next();
				contact=sc1.next();
				category=sc1.next();
				hostel=sc1.next();

				String leftAllignFormat="| %-3s| %-24s| %-24s| %-14s| %-15s| %-5s|%n";
				System.out.format(leftAllignFormat,cid,name,address,contact,category,hostel);
			}
		sc1.close();
		}
		tableend();
		sc.close();

	}
}

