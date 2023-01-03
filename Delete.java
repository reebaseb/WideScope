import java.io.*;
import java.util.*;

class Delete extends Headertop
{
	public static void del(String code)throws Exception
	{
		
		Scanner sc=new Scanner(new File("Institutions.dat"));
		PrintWriter pr=new PrintWriter(new BufferedWriter(new FileWriter("temp.dat")));

		String name,address,contact,category,hostel,fid,record,c,cid;
		int flag=0;

		clearcls();
		View.readfile(code);
		System.out.println("\n\n\n\n");
		head("DELETE INSTITUTES");

		System.out.println("--------------------------------------------------------------------------------------------------");

		System.out.println("Enter name of Institute to be Deleted");
		name=enterString();

		


while(sc.hasNextLine())
	{
		record=sc.nextLine();
		Scanner sc1=new Scanner(record).useDelimiter(";");
		c=sc1.next();
		cid=sc1.next();
		fid=sc1.next();

		if(fid.equalsIgnoreCase(name)==false)
		           pr.println(record);
		else
		{
			name=fid;
			address=sc1.next();
			contact=sc1.next();
			category=sc1.next();
			hostel=sc1.next();

			System.out.println("Existing values are given below, the following record will be deleted");
			System.out.println("--------------------------------------------------------------------------------------");
	         String leftAllignFormat="|  %-9s|  %-25s|  %-25s|  %-15s|  %-15s|  %-8s|%n";
	System.out.format(leftAllignFormat,cid,name,address,contact,category,hostel);
	System.out.println("--------------------------------------------------------------------------------------");
		flag=1;
		}
		sc1.close();
		}

		sc.close();
		pr.close();

		if(flag==1)
		System.out.println("Record Deleted");

	          else
		System.out.println("Record could not be found");

	     File f=new File("Institutions.dat");
	     File f1=new File("temp.dat");
	     f.delete();
	    f1.renameTo(f);
	    callagain();
	}

}

