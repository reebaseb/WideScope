import java .io.*;
import java.util.*;
import java.text.*;

class Validate
{
	//Function to validate integer
	public static String enterInt()throws NumberFormatException
	{
		boolean flag=true;
		String n="";
		Scanner sc=new Scanner(System.in);
		
                      do
		{
			flag=true;
			n=sc.next();

			for(int i=0;i<n.length();i++)
			{
				if(!Character.isDigit(n.charAt(i)))
				{
					flag=false;
					break;
				}
			}
			if(flag==false)
			{
				Headertop.centeralignmsg("Please enter digits only");

			}
		}while(flag==false);
		return n;
	}

	//Function to validate String
	public static String enterString()throws Exception
	{
		boolean flag=true;
		String n="";
		int ctr=0;

		Scanner sc=new Scanner(System.in);
		do
		{
			flag=true;
			try
			{
				n=sc.nextLine().trim();
				//checks for null value

				for(int k=0;k<n.length();k++)
				{
					if(Character.isWhitespace(n.charAt(k)))
					{
						ctr++;
					}
				}
		if(ctr==n.length())
				{
					flag=false;
				}

		
     for(int i=0;i<n.length();i++)
    {
	if(!(Character.isLetter(n.charAt(i))|Character.isWhitespace(n.charAt(i))))
		{
			flag=false;
			break;
		}
     	 }
}	//end of try block
	catch(Exception e)
	{
		flag=false;
	}
	  if(flag==false)
	  {
		System.out.print("\t Enter a valid value:");
	   }
    	  }while(flag==false);
	return n;
}

	//Function to validate to accept code
	public static String enterCode()throws Exception
	{
		String co="";
		boolean flag=true;

		do
		{
			flag=true;
			co=enterString();
			co=co.toUpperCase();

			if(co.length()==3)
			{
				flag=true;
			}
			else
			{
				System.out.println("\t Please enter Three letters only:ENG | MED | MNG | DES | LAW | JOU");
				flag=false;
			}
		}while(flag==false);
	return co;
}

	//Function to validate Contact
public static String enterContact()throws NumberFormatException
{
		boolean flag=true;
		String n="";

		Scanner sc=new Scanner(System.in);
		do
		{
			flag=true;
			System.out.println();
			Headertop.centeralignmsg("Please enter 10 digit for mobile number and for landline enter StdCode followed by space and number");

			System.out.println();
			n=sc.next();

				if((n.length()<10) || (n.length()>13))
				flag=false;
		for(int i=0;i<n.length();i++)
		{
			if(!Character.isDigit(n.charAt(i)))
			{
				flag=false;
				break;
			}
		}

		if(flag==false)
		{
			Headertop.centeralignmsg("Please enter Digits only:");
			Headertop.centeralignmsg("Remember:10 digits for mobile number and 13 digits with space,StdCode and number");
			System.out.println();
		}
	     }while(flag==false);
	return n;
	}

	//Function to validate Character
	public static char enterChar()throws Exception
	{
		Scanner sc=new Scanner(System.in);
		char a;
		boolean flag=false;

		do
		{
			flag=false;
			Headertop.centeralignmsg("Enter your choice(A/M/D/V/S/E):");
			a=Character.toUpperCase(sc.next().charAt(0));

			if(a=='A' || a=='M' || a=='D' || a=='V' || a=='S' || a=='E')
			{
				flag=true;
			}
			if (flag==false)
			{
				Headertop.centeralign("Enter choice(A/M/D/V/S/E) only!!");
			}
		}while(flag==false);
	return a;
	}

	//Function to validate Hostel facility
public static String enterHostel()throws Exception
{
	String h="";
	boolean flag=false;

	do
	{
		Headertop.centeralignmsg("Enter choice(Yes/No):)");
		h=enterString();

		if((h.equalsIgnoreCase("Yes")) || (h.equalsIgnoreCase("No")))
		{
			flag=true;
			h=h.toUpperCase();
		}


		if(flag==false)
		{
			Headertop.centeralignmsg("Please enter Yes or No Only!!");
		}
   	       }while(flag==false);
	  return h;
}

	//Function to validate Category
public static String enterCategory()throws Exception
{
	String c="";
	boolean flag=false;
	
	do
	{
		Headertop.centeralignmsg("Enter choice(National/International):");
		c=enterString();

		if((c.equalsIgnoreCase("National")) || (c.equalsIgnoreCase("International")))
		{
			flag=true;
			c=c.toUpperCase();
		}
		if(flag==false)
		{
			Headertop.centeralign("Please enter National/International Only!!");
		}
	}while(flag==false);
     return c;
}
}
