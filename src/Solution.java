import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution
{
	
	static public int findless(int[]a,int size){
		int min =0;
		for(int i =0; i<size;i++){
			if(a[i]>0){
				min=a[i];
				break;
			}
		}
	
		for(int i=0; i<size;i++){
			
			if ((a[i]<=min) && (a[i]>=0)){
				min=a[i];
			}
		}
		return min;
	}
	public static void main(String[] args)
	{

		Scanner in = new Scanner(System.in);
		//List<Integer> templist = new ArrayList<Integer>();
		int remain;
		int min=0;
		int size = in.nextInt();
		in.nextLine();
		// List<Integer> stick = new ArrayList<Integer>();
		String[] temp = (in.nextLine().split(" "));
		int stick[] = new int[size];
		
		for (int i = 0; i < temp.length; i++)
		{			
			stick[i] = Integer.parseInt(temp[i]);
			//System.out.println("\n\n: " + stick[i]);
		}
		min = findless(stick,size);
		
		remain =size;
		
		//System.out.println(remain);
		while(remain >0){
			System.out.println(remain);
			for(int i=0; i<size;i++){
				stick[i]= stick[i]-min;
				if(((-200)<stick[i]) && stick[i]<=0){	
					
					stick[i]=-200;
					remain--;
				}
			}
			
		
			min=findless(stick, size);
			
			
			
		}
	}

}