import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


public class InsertionSortPartOne
{
	public static void insertIntoSorted(int[] ar)
	{
		 int newvalue = ar[ar.length-1];
         for(int i=ar.length-1;i>0;i--)
         {
             if(newvalue<ar[i-1])
             {
              ar[i]=ar[i-1];
              printArray(ar);  
             }
             else
             {
                 ar[i]=newvalue;
                  printArray(ar);
                 return;
             }   
         }
         ar[0] = newvalue;
         printArray(ar);

	}


/* Tail starts here */
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int s = in.nextInt();
		int[] ar = new int[s];
		for (int i = 0; i < s; i++)
		{
			ar[i] = in.nextInt();
		}
		insertIntoSorted(ar);
	}


	private static void printArray(int[] ar)
	{
		for (int n : ar)
		{
			System.out.print(n + " ");
		}
		System.out.println("");
	}


}