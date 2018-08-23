/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		int count=1,max=0;
		char c=' ';
		int i;
		for(i=0;i<str.length();i++)
		{
			for(int j=i+1;j<str.length();j++)
			{
				if(str.charAt(i)==str.charAt(j))
				{
					count++;
				}
				if(count>max)
				{
			          max=count;
			     	    c=str.charAt(i);
        
				}
			}
		}
		System.out.println(c);
		
	}
}
