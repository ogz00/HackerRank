import java.util.Scanner;

public class ChocolateFest
{


	public static int _noc(int _N, int _C)
	{
		return _N / _C;
	}

	public static int noc_wrappers(int _total, int _M)
	{
		int _result = 0;
		while (_total / _M > 0)
		{
			_result += _total / _M;

			_total = (_total / _M) + (_total % _M);
		}

		return _result;
	}

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int _case = in.nextInt();

		for (int i = 0; i < _case; i++)
		{

			int _N = in.nextInt();
			int _C = in.nextInt();
			int _M = in.nextInt();

			int noc = _noc(_N, _C);

			int noc_wrapper = noc_wrappers(noc, _M);

			int _result = noc_wrapper + noc;

			System.out.println(_result);
		}

	}

}
