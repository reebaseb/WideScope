import java.io.*;
import java.util.*;

class Search extends Headertop
{
	public static void searchfile(String code,String value)throws Exception
	{
		Scanner sc=new Scanner(new File("Institutions.dat"));
                       String name, address,contact, category, hostel,c,cid;
		String record;

		clearcls();
		header();
		head("SEARCH INSTITUTES");
		tablehead();

		while(sc.hasNextLine())
		{
			record=sc.nextLine();
			Scanner sc1=new Scanner(record).useDelimiter(";");
			c=sc1.next();
			cid=sc1.next();
			name=sc1.next();
			address=sc1.next();
			contact=sc1.next();
			category=sc1.next();
			hostel=sc1.next();

			String leftAllignFormat="| %-3s| %-24s| %-24s| %-14s| %-15s| %-5s|%n";

	if((c.equals(code)==true) &&(name.equalsIgnoreCase(value)==true))
	{
			System.out.format(leftAllignFormat,cid,name,address,contact,category,hostel);
	}

	if((c.equals(code)==true) &&(address.equalsIgnoreCase(value)==true))
	{
				System.out.format(leftAllignFormat,cid,name,address,contact,category,hostel);
	}

	if((c.equals(code)==true) &&(contact.equals(value)==true))
	{
				System.out.format(leftAllignFormat,cid,name,address,contact,category,hostel);
	}
	if((c.equals(code)==true) &&(category.equalsIgnoreCase(value)==true))
	{
				System.out.format(leftAllignFormat,cid,name,address,contact,category,hostel);
	}
	if((c.equals(code)==true) &&(hostel.equalsIgnoreCase(value)==true))
	{
				System.out.format(leftAllignFormat,cid,name,address,contact,category,hostel);	
	}


		sc1.close();
	}
		tableend();
		sc.close();
		callagain();
     }
}


