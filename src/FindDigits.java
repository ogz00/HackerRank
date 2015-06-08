import java.util.Scanner;


public class FindDigits
{
	static public int[] _toArray(int _k)
	{

		String tempArr = Integer.toString(_k);

		int[] newArr = new int[tempArr.length()];
		for (int i = 0; i < newArr.length; i++)
		{
			newArr[i] = tempArr.charAt(i) - '0';
		}

		return newArr;
	}

	static public int _divide(int[] _arr, int _val)
	{
		int _digits = 0;
		for (int i = 0; i < _arr.length; i++)
		{
			if (_arr[i] != 0 && _val % _arr[i] == 0)
			{
				_digits++;
			}
		}

		return _digits;
	}


	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int _k = 0, digits = 0;
		int _case = in.nextInt();

		for (int i = 0; i < _case; i++)
		{			
			_k = in.nextInt();
			int[] intArr = _toArray(_k);
			digits = _divide(intArr, _k);
			System.out.println(digits);
		}


	}

}
