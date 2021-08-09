
//TOPIC:    “Financial Management System  



import java.util.Random;
import java.util.Scanner;
import java.time.*;
interface UGC
{
	abstract String payfee();
	default void login()
	{
		Random rand= new Random();
		Scanner sc = new Scanner(System.in);
		System.out.println("\n");
		System.out.println("--------------------------------"+"Financial Management System"+"--------------------------------");
		System.out.println("\n");
		System.out.print("                   Existing user Press 1----->New user press 2------> :  ");
		int k=sc.nextInt();
		if(k==1)
		{
			
			switch(k)
			{
				case 1:
				
				System.out.print("                   please login");
				System.out.println("\n");
				System.out.print(">>>>>>>>Enter your Id:   ");
				int id=sc.nextInt();
				
				System.out.print(">>>>>>>>Enter your password:  ");
				String password=sc.next();
				System.out.print("\n");
				break;
				case 2:
	            System.out.println("\n");
				System.out.print(">>>>>>>>>Enter your Name:   ");
				String name=sc.next();
				System.out.print(">>>>>>>>>Enter your age:  ");
				long age=sc.nextLong();
				System.out.print(">>>>>>>>>Enter your email:   ");
				String email=sc.next();
				System.out.print(">>>>>>>>>Enter your location:   ");
				String add=sc.next();
				System.out.print(">>>>>>>>Enter your ph-number:   ");
				long ph_no=sc.nextLong();
				System.out.print(">>>>>>>>>create your password as(String):  ");
				String passw=sc.next();
				int reg=rand.nextInt(1000000);
					   System.out.println(">>>>>>your registration number is:  "+reg);
				System.out.println("\n");
				System.out.print("--------------Your Account is Created !!!------------------");  
				System.out.println("\n");
				
				 break;
			}
		}
		
		
	}
}
interface AITCE
{

	default void login(int i)
	{ 

	}
}
class demo implements UGC,AITCE
{
	int fee_due;
	public String payfee()
	{
		String s="you rtrying";
		return(s);
	}
	public void login()
	{
		UGC.super.login();
		AITCE.super.login(9);
		
	}
	
}

public class LPU extends demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        demo obj= new LPU();
        obj.login();
        System.out.println("\n>>>>>>Select the TYpe of fee\n     1.Term fee\n    2.Examination fee\n    3.Transportion Fee\n    4.Other fee  ");
        Scanner sc1= new Scanner(System.in);
        System.out.print(">>>>>>>>>>>>>>>>>Select Your Choice:   ");
        int k=sc1.nextInt();
        switch(k)
        {
        case 1:
        	Random ran2= new Random();
        	int recp=ran2.nextInt(10000);
			System.out.println("your term FEE is: 545000");
        	System.out.print("Enter the Amount that you are going to deposite::   ");
        	
        	int dep_amount=sc1.nextInt();
        	obj.fee_due=54500-dep_amount;
        	System.out.println("Remaining Amount you have pay that is FEE DUE="+obj.fee_due);
        	System.out.println("YOUR FEE RECIPT NUMBER="+recp);
			break;
        case 2:
        	Random ran3= new Random();
        	int recp1=ran3.nextInt(10000);
			System.out.println("your exam FEE is: 4000");
        	System.out.print("Enter the Amount that you are going to deposite::   ");
        	
        	int dep_amount1=sc1.nextInt();
        	obj.fee_due=4000-dep_amount1;
        	System.out.println("Remaining Amount you have pay that is FEE DUE="+obj.fee_due);
        	System.out.println("YOUR FEE RECIPT NUMBER="+recp1);
			break;
		case 3:
			Random ran4= new Random();
        	int recp2=ran4.nextInt(10000);
			System.out.println("your Transportion FEE is: 10000");
        	System.out.print("Enter the Amount that you are going to deposite::  ");
        	
        	int dep_amount2=sc1.nextInt();
        	obj.fee_due=10000-dep_amount2;
        	System.out.println("Remaining Amount you have pay that is FEE DUE="+obj.fee_due);
        	System.out.println("YOUR FEE RECIPT NUMBER="+recp2);
			break;
		case 4:
			Random ran5= new Random();
        	int recp3=ran5.nextInt(10000);
			System.out.println("your other FEE is: ");
        	System.out.print("Enter the Amount that you are going to deposite::  ");
			
        	int dep_amount3=sc1.nextInt();
        	obj.fee_due=10000-dep_amount3;
        	System.out.println("Remaining Amount you have pay that is FEE DUE="+obj.fee_due);
        	System.out.println("YOUR FEE RECIPT NUMBER="+recp3);
			break;
      
        }
         
	}

}