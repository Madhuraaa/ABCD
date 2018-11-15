package datas;

import java.util.Arrays;
import java.util.Scanner;

public class sample
{
	void sort()
	{   int number[]={200,300,500,100,350};
		 boolean flag=true;
		   while(flag)
		   {
			   flag=false;
			   int temp=0;
			   for(int i=0;i<number.length-1;i++)
			   {
				   if(number[i]>number[i+1])
				   {temp=number[i];
				   number[i]=number[i+1];
				   number[i+1]=temp;
				   flag=true;
					   
			    } 
			   }
		   }System.out.print(Arrays.toString(number));
		   }
     
	void sort1()
	{
		int number1[]={200,300,500,100,350};
		 boolean flag1=true;
		   while(flag1)
		   {
			   flag1=false;
			   int temp1=0;
			   for(int j=0;j<number1.length-1;j++)
			   {
				   if(number1[j]<number1[j+1])
				   {temp1=number1[j];
				   number1[j]=number1[j+1];
				   number1[j+1]=temp1;
				   flag1=true;
					   
			    } 
			   } 
			   
    }System.out.println(Arrays.toString(number1));
		   }
		
		
		
	
	
	public static void main(String args[])
	{   sample s1=new sample();
	    s1.sort();
	    s1.sort1();
	}
		}


