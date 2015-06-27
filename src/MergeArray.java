import java.util.Scanner;

public class MergeArray
{

	public static void main(String[] args)
	{

		Scanner sc = new Scanner(System.in);
		int _a_cnt = 0;
		int[] _a = new int[3];
		int[] _b = new int[6];

		try
		{
			_a_cnt = sc.nextInt();
		}
		catch (Exception e)
		{
			System.out.println("Here: " + e.getMessage());
		}

		for (int i = 0; i < _a_cnt; i++)
		{
			_a[i] = sc.nextInt();
		}
		for (int i = 0; i < _a_cnt; i++)
		{
			_b[i] = sc.nextInt();
		}
		mergeArray(_a, _b, _a_cnt);
		for (int i = 0; i < 2 * _a_cnt; i++)
		{
			System.out.print(_b[i] + " ");
		}
	}


	static void mergeArray(int[] a, int[] b, int M)
	{
		int[]c = new int[2*M];
		  int i;
		  for(i=0; i<a.length; i++)
		     c[i] = a[i];

		     for(int j=0; j<b.length/2; j++)
		        c[i++]=b[j];
		        
		    bubbleSort(c);
		    
		    for(int k=0; k<b.length;k++){
		    	b[k]=c[k];
		    }
	}
	
	 /*static void insertionSort(int[] ar)
	    {       
	    	 for (int i = 1; i < ar.length; i++) {
	             int next = ar[i];
	             // find the insertion location while moving all larger element up
	             int j = i;
	             //Correctness and the Loop Invariant
	             while (j >= 0 && ar[j - 1] > next) {
	                 ar[j] = ar[j - 1];
	                 j--;
	             }
	             // insert the element
	             ar[j] = next;
	            
	         }
	         
	    }  */
	 
	 static void bubbleSort(int[] ar){
		 int n=ar.length;
		 for (int c = 0; c < ( n - 1 ); c++) {
		      for (int d = 0; d < n - c - 1; d++) {
		        if (ar[d] > ar[d+1]) /* For descending order use < */
		        {
		          int swap       = ar[d];
		          ar[d]   = ar[d+1];
		          ar[d+1] = swap;
		        }
		      }
		    }
	 }


}
