package Assignment;

import java.util.Scanner;

public class Labour extends Employee{
	void TotalSalary()
	{
		double Salary=20000;
		int Time=8;
		double TotalSalary;
		
	    Scanner sc=new Scanner(System.in);   
	    int  Overtime;
	    System.out.println("Enter the overtime in hours");
	    Overtime=sc.nextInt();
	    switch(Overtime){
	    	case 1:Overtime= (int) (Salary*0.02);
	    	       break;
	    	case 2: Overtime=(int) (Salary*0.03);
	    	       break;
	    	case 3: System.out.println("Maximum hours is 2,!Sorry");
	    	       break;
	    	
	    }
	    TotalSalary=Salary+Overtime;
	    System.out.println("!!Great You have done good job!!");
	    System.out.println("Your Total Salary is: "+TotalSalary);
	}

		

}
