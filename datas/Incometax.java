package datas;

import java.util.Scanner;

public class Incometax {
	public static void main(String[] args)
	{    int amount;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Amount");
		amount=sc.nextInt();
		if(amount>0 && amount<=180000)
		{
			System.out.println("NIL");
	}
		else if(amount>=181001 && amount<=300000){
				int amount1=(int) (amount*0.1);
			System.out.println(amount1);}
			
		else	if(amount>=300000 && amount<=500000){
			   int  amount2=(int) (amount*0.2);
					System.out.println(amount2);}
				
		else	if(amount>500001 && amount<=1000001){
		int 	amount3=(int) (amount*0.3);
						System.out.println(amount3);
		}
	}

}
