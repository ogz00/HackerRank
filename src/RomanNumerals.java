import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class RomanNumerals
{
	public static int I = 1, V = 5, X = 10, L = 50, C = 100, D = 500, M = 1000;

	public static int[] convert(String[] romen_numb)
	{
		int length = romen_numb.length;

		int[] converted_arr = new int[length];
		for (int i = 0; i < length; i++)
		{
			int value = 0;
			String str = romen_numb[i];
			for (int j = 0; j < str.length(); j++)
			{
				char c = str.charAt(j);
				if (c == 'I')
					value += I;

				else if (c == 'V')
					value += V;

				else if (c == 'X')
					value += X;

				else if (c == 'L')
					value += L;

				else if (c == 'C')
					value += C;

				else if (c == 'D')
					value += D;

				else if (c == 'M')
					value += M;
			}
			converted_arr[i] = value;
		}


		return converted_arr;
	}

	static int[] smashing(int x)
	{
		int digits[] = new int[4];
		int th, hun, ten, unx;
		digits[0] = x / 1000;
		th = digits[0] * 1000;

		digits[1] = (x - th) / 100;
		hun = digits[1] * 100;

		digits[2] = (x - th - hun) / 10;
		ten = digits[2] * 10;

		digits[3] = (x - th - hun - ten);
		unx = digits[3];

		return digits;
	}


	public static void main(String[] args) throws IOException
	{
		Scanner in = new Scanner(System.in);
		


		int count = Integer.parseInt(in.nextLine());
		String[] numbers = new String[count];
		String numbers_item;
		String true_numb[] = new String[count];
		for (int i = 0; i < count; i++)
		{
			numbers_item = in.nextLine();
			numbers[i] = numbers_item;
		}
		int[] converted_arr = new int[count];
		converted_arr = convert(numbers);

		for (int i = 0; i < count; i++)
		{
			StringBuilder sb = new StringBuilder();
			int[] digits = new int[4];
			digits = smashing(converted_arr[i]);
			

			if (digits[0] > 0)
			{
				for (int t = 0; t < digits[0]; t++)
					sb.append("M");
			}
			if (digits[1] > 0 && digits[1] < 4)
			{
				for (int t = 0; t < digits[1]; t++)
					sb.append("C");
			}
			else if (digits[1] == 4)
			{
				sb.append("CD");
			}
			else if (digits[1] == 5)
			{
				sb.append("D");
			}
			else if (digits[1] > 5 && digits[1] < 9)
			{
				sb.append("D");
				for (int t = 5; t < 8; t++)
				{
					sb.append("C");
				}
			}
			else if (digits[1] == 9)
			{
				sb.append("CM");
			}


			if (digits[2] > 0 && digits[2] < 4)
			{
				for (int t = 0; t < digits[2]; t++)
					sb.append("X");
			}
			else if (digits[2] == 4)
			{
				sb.append("XL");
			}
			else if (digits[2] == 5)
			{
				sb.append("L");
			}
			else if (digits[2] > 5 && digits[2] < 9)
			{
				sb.append("L");
				for (int t = 5; t < 8; t++)
				{
					sb.append("X");
				}
			}
			else if (digits[2] == 9)
			{
				sb.append("XC");
			}


			if (digits[3] > 0 && digits[3] < 4)
			{
				for (int t = 0; t < digits[3]; t++)
					sb.append("I");
			}
			else if (digits[3] == 4)
			{
				sb.append("IV");
			}
			else if (digits[3] == 5)
			{
				sb.append("V");
			}
			else if (digits[3] > 5 && digits[3] < 9)
			{
				sb.append("V");
				for (int t = 5; t < 8; t++)
				{
					sb.append("I");
				}
			}
			else if (digits[3] == 9)
			{
				sb.append("IX");
			}


			true_numb[i] = sb.toString();
		}

		for (int z = 0; z < true_numb.length; z++)
		{
			System.out.println(true_numb[z]);
		}


	}
}
