/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int n,r,sum=0,re;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		while(n>0)
		{
			r=n%10;
			sum=sum*10+r;
			n=n/10;
			
		}
		 while(sum>0)
		 {
		 	re=sum%10;
		 	System.out.print(" "+re);
                    		 sum=sum/10;
		 }
	}
}
