/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int n,sum=0,average,i;
		Scanner sc=new Scanner(System.in);
		int a[]=new int[20];
		n=sc.nextInt();
		for(i=0;i<n;i++)
		{
                             a[i]=sc.nextInt();
		}
		for(i=0;i<n;i++)
		{
			sum=sum+a[i];
		}
		average=sum/n;
		System.out.println(average);
	}
}
