import java.math.BigInteger;
import java.util.Scanner;

public class FlippingBits
{


	public static void main(String[] args)
	{

		Scanner in = new Scanner(System.in);
		int s = in.nextInt();
		BigInteger original, sub;
		sub = new BigInteger("4294967295");
		for (int i = 0; i < s; i++)
		{
			original = new BigInteger(in.next());
			original = sub.subtract(original);
			System.out.println(original);
		}

	}
}