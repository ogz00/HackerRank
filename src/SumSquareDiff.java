import java.util.Scanner;


public class SumSquareDiff
{
	public static void main(String[] args)
	{

		Scanner in = new Scanner(System.in);
		int _k = 0;
		long diff;


		int _case = in.nextInt();
		long[] numberArr = new long[_case];
		long[] diffArr = new long[_case];

		for (int i = 0; i < _case; i++)
		{
			_k = in.nextInt();
			numberArr[i] = _k;
			
		}
		
		for(int i=0; i<numberArr.length; i++){
			diff =findSumSquareDiff(numberArr[i]);
			diffArr[i] = diff;
		}
		
		for(int i=0; i<diffArr.length;i++){
			System.out.println(diffArr[i]);
		}
	}

	private static long findSumSquareDiff(long N)
	{
		long sumSq, squared =0, sum =0 ;
		
		
		sum = (N * (N+1))/2;
		sumSq =sum*sum;
		
		squared = (N * (N + 1) * (2 * N + 1)) / 6;
		
		
		return sumSq-squared;
	}

}
