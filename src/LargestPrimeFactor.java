import java.util.Scanner;


public class LargestPrimeFactor
{

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int _k = 0, prime;
		
		
		int _case = in.nextInt();
		int [] numberArr = new int[_case];
		int [] primeArr = new int[_case];
		
		for (int i = 0; i < _case; i++)
		{			
			_k = in.nextInt();
			numberArr[i] = _k;
			//System.out.println(numberArr[i]);
		}
		for(int i=0; i<numberArr.length; i++){
			prime =findLargestPrime(numberArr[i]);
			primeArr[i] = prime;
		}
		for(int i=0; i<primeArr.length;i++){
			System.out.println(primeArr[i]);
		}
		
	}

	private static int findLargestPrime(int i)
	{
		int j;
		for(j=2;j<i;j++){
			if(i%j ==0){
				i /=j;
				j--;
			}
		}
		return j;
		
	}

}
