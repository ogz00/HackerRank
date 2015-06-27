import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class LumberMill
{
	/*
	 * Complete the function below.
	 */

	static int maxProfit(int cost_per_cut, int wood_price, int[] lengths)
	{
		int _gcd = gcd(lengths);
		int cut=0;
		int waste=0;
		
		if (lengths.length == 0){
		    return 0;
		}
		else if(_gcd>cost_per_cut){
			for(int i=0; i<lengths.length;i++){
				cut+=lengths[i]/_gcd;
				waste+=lengths[i]%_gcd;
			}
			
			return cut*wood_price*_gcd - cost_per_cut*cut;
		}
		else{
			
			int small = lengths[0];
			int index = 0;
			for (int i = 0; i < lengths.length; i++)
			    if (lengths[i] < small)
			    {
			        small = lengths[i];
			        index = i;
			    }
			
			for(int i=0; i<lengths.length;i++){
				cut+=lengths[i]/_gcd;
				waste+=lengths[i]%_gcd;
			}
			
			return cut*wood_price*_gcd - cost_per_cut*cut;
		}


	}
	

	private static int gcd(int a, int b)
	{
	    while (b > 0)
	    {
	        int temp = b;
	        b = a % b; // % is remainder
	        a = temp;
	    }
	    return a;
	}

	private static int gcd(int[] input)
	{
	    int result = input[0];
	    for(int i = 1; i < input.length; i++) result = gcd(result, input[i]);
	    return result;
	}

	public static void main(String[] args) throws IOException
	{
		Scanner in = new Scanner(System.in);
		final String fileName = System.getenv("OUTPUT_PATH");
		BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));
		int res;
		int _cost_per_cut;
		_cost_per_cut = Integer.parseInt(in.nextLine());

		int _wood_price;
		_wood_price = Integer.parseInt(in.nextLine());


		int _lengths_size = Integer.parseInt(in.nextLine());
		int[] _lengths = new int[_lengths_size];
		int _lengths_item;
		for (int _lengths_i = 0; _lengths_i < _lengths_size; _lengths_i++)
		{
			_lengths_item = Integer.parseInt(in.nextLine());
			_lengths[_lengths_i] = _lengths_item;
		}

		res = maxProfit(_cost_per_cut, _wood_price, _lengths);
		bw.write(String.valueOf(res));
		bw.newLine();

		bw.close();
	}


}
