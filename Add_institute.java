import java.io.*;
import java.util.*;

class Add extends Headertop
{
	public static void writerfile(String code)throws Exception
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter buf=new BufferedWriter(new FileWriter("Institutions.dat",true));
		BufferedWriter buft=new BufferedWriter(new FileWriter("temp.dat",true));

		PrintWriter prt=new PrintWriter(buft);
		PrintWriter pr=new PrintWriter(buf);

		Scanner sc=new Scanner(new File("code.dat"));
		String record;

		String name,address,contact,category,hostel;
		int rec;

		clearcls();
		header();
		head("ADD INSTITUTION");

		



/*To fetch number of record in code file which stores the code and numrec which is then incremented*/

		String nrec="0",norec="0";
		while(sc.hasNextLine())
		{
			record=sc.nextLine();
			Scanner sc1=new Scanner(record).useDelimiter(";");

			String c=sc1.next();

			//Write non matching records to temp file
			if(c.equals(code)==false)
			{
				nrec=sc1.next();
				prt.println(c+";"+nrec);
			}
			else
			{
				norec=sc1.next();
			}
			sc1.close();
		}

		rec=Integer.parseInt(norec);
		sc.close();

System.out.println("Enter the number of Institutions data u want to enter:\t");
int n=Integer.parseInt(br.readLine());
System.out.println();

	

            for(int i=1;i<=n;i++)
	{
		System.out.println("--------------------------------------------------------------------------------------");
		System.out.println("Enter the name of the Institute");
		name=enterString();
		System.out.println("--------------------------------------------------------------------------------------");
		System.out.println("--------------------------------------------------------------------------------------");
		System.out.println("Enter address");
		address=enterString();
		System.out.println("--------------------------------------------------------------------------------------");
		System.out.println("--------------------------------------------------------------------------------------");
		System.out.println("Enter contact number");
		contact=enterContact();
		System.out.println("--------------------------------------------------------------------------------------");
		System.out.println("--------------------------------------------------------------------------------------");
		System.out.println("Enter the Category(National/International)");
		category=enterCategory();
		System.out.println("--------------------------------------------------------------------------------------");
		System.out.println("--------------------------------------------------------------------------------------");
		System.out.println("Enter if the Institute provides hostel facility(Yes/No)");
		hostel=enterHostel();
		System.out.println("--------------------------------------------------------------------------------------");
		rec++;
		System.out.println();
				pr.println(code+";"+rec+";"+name+";"+address+";"+contact+";"+category+";"+hostel);
	}
		prt.println(code+";"+rec);
		rec=0;

		pr.close();
		prt.close();
		sc.close();

		File f=new File("code.dat");
		File f1=new File("temp.dat");
		f.delete();
		f1.renameTo(f);

		callagain();	//Goes to refer main menu
	}
}
