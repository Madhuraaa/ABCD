package datas;

import java.util.Arrays;

public class Big {
	
	void check1(){
		int i;
	
		int number[]={200,300,500,100,350};
		 boolean flag=true;
		   while(flag)
		   {
			   flag=false;
			   int temp=0;
			   for(i=0;i<number.length-1;i++)
			   {
				   if(number[i]<number[i+1])
				   {temp=number[i];
				   number[i]=number[i+1];
				   number[i+1]=temp;
				   flag=true;
					   
			    } 
			   }}System.out.println(Arrays.toString(number));
			   
			   
			   
	}
	    void largest() 
	     { 
	         int j; 
	           
	        int arr1[]= {00,50,70,45};
	       
	         int max = arr1[0]; 
	        
	         for (j = 1; j < arr1.length; j++) 
	             if (arr1[j] > max) 
	                 max = arr1[j]; 
	        System.out.println("Length of the array:" +arr1.length);
	         System.out.println("Biggest Number:"+max);
	     } 

		    public static void main(String[] args)
		    {
		    	Big b=new Big();
		    	b.check1();
		    	b.largest();
		    	
		    	
		    }
             }
