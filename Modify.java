import java.io.*;
import java.util.*;

class Modify extends Headertop
{
	public static void mod(String code)throws Exception
	{
		Scanner sc=new Scanner(new File("Institutions.dat"));
		PrintWriter pr=new PrintWriter(new BufferedWriter(new FileWriter("temp.dat")));

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String name,address,category,contact,hostel,fname,record;
		String c,cid;
		int choice;
                       int flag=0;

		clearcls();
		View.readfile(code);

		System.out.println("\n\n\n");
		head("MODIFY INSTITUTES");

		System.out.println("-----------------------------------------------------------------------------------------------");
		System.out.println("Enter name of institute to be modified:");
		name=enterString();

		

while(sc.hasNextLine())
		{
			record=sc.nextLine();
			Scanner sc1=new Scanner(record).useDelimiter(";");
			c=sc1.next();	//code
			cid=sc1.next();	//college id
			fname=sc1.next();

			if(fname.equalsIgnoreCase(name)==false)
			      pr.println(record);

			else
			{
				name=fname;
				address=sc1.next();
				contact=sc1.next();
				category=sc1.next();
				hostel=sc1.next();
				System.out.println("Provided above are the existing values. Please modify accordingly.");
				do
			             {
					System.out.println("-----------------------------------------------------------------------------------------------");
					System.out.println("What would you like to modify?");
					System.out.println("1] Name ");
					System.out.println("2] Address ");
					System.out.println("3] Contact ");
					System.out.println("4] Category ");
					System.out.println("5] Hostel Facility");
					System.out.println("6] Exit \n");

					System.out.println("Enter your choice");
								   choice=Integer.parseInt(br.readLine());
		switch(choice)
			{
				case 1:
					System.out.println("Enter new name of institution");
					name=enterString();
					flag=1;
					break;

				case 2:
					System.out.println("Enter new address of institution");
					address=enterString();
					flag=1;
					break;
                                 
                                              case 3:
					System.out.println("Enter new contact number");
					contact=enterContact();
					flag=1;
					break;
				
                                               case 4:
					System.out.println("Enter new category(National/International)");
					category=enterCategory();
					flag=1;
					break;


				case 5:
					System.out.println("Enter new type of hostel facility provided(Yes/No)");
					hostel=enterHostel();
					flag=1;
					break;
				case 6:
					break;

				default:
					System.out.println("Please enter a valid choice");
			}
		}while(choice!=6);
	pr.println(c+";"+cid+";"+name+";"+address+";"+contact+";"+category+";"+hostel);
		}
		sc1.close();
	}//end of while loop
	pr.close();
	sc.close();

	if(flag==1)
		System.out.println("\n Record has been modified");
	else
		System.out.println("\n Record was not modified");

	File f=new File("Institutions.dat");
	File f1=new File("temp.dat");
	f.delete();
	f1.renameTo(f);
	callagain();
       }//end of method mod()
}
