package Assignment;

import java.util.Scanner;

public class Manager extends Employee{
	
	void TotalSalary(){
		double salary=50000;
	    String performance ;
	    double TotalSalary;
	    double incentives = 0;
	    Scanner sc=new Scanner(System.in);   
	    System.out.println("Enter the performance ");
		performance=sc.next();
		
		if (performance.equals("good"))
		{
			incentives=salary*0.05;	
		}
		else if(performance.equals("better"))
		{
			incentives=salary*0.1;
		}
		else if(performance.equals("best"))
		{
			incentives=salary*0.15;
		}
		else if(performance.equals("null")){
			System.out.println("No Incentives");
		}
		TotalSalary=salary+incentives;
		System.out.println("TotalSalary of an Employee: "+TotalSalary);
		
	}
	


}
