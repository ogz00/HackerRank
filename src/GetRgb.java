import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Scanner;


public class GetRgb
{
	
	static Double findRgbBlack(int x, int y, int z){
		
		Double res=Math.pow(Math.pow(x, 2)+Math.pow(y, 2)+Math.pow(z, 2),1/2);			
			
		return res;
	}
	static Double findRgbWhite(int x, int y, int z){
		
		Double res=Math.pow(Math.pow(x-255, 2)+Math.pow(y-255, 2)+Math.pow(z-255, 2),1/2);			
			
		return res;
	}
	
static Double findRgbRed(int x, int y, int z){
		
		Double res=Math.pow(Math.pow(x-255, 2)+Math.pow(y, 2)+Math.pow(z, 2),1/2);			
			
		return res;
	}

static Double findRgbGreen(int x, int y, int z){
	
	Double res=Math.pow(Math.pow(x, 2)+Math.pow(y-255, 2)+Math.pow(z, 2),1/2);			
		
	return res;
}

static Double findRgbBlue(int x, int y, int z){
	
	Double res=Math.pow(Math.pow(x, 2)+Math.pow(y, 2)+Math.pow(z-255, 2),1/2);			
		
	return res;
}

	public static void main(String[] args)
	{

		int red, green, blue;
		int redr, greenr, bluer;

		Scanner in = new Scanner(System.in);

		int _case = in.nextInt();
		for (int i = 0; i < _case; i++)
		{
			

			String _val = in.nextLine();
			String[] valt = _val.split("");
			String[] redt = new String[8];
			String[] bluet = new String[8];
			String[] greent = new String[8];
			for (int j = 0; j < 8; j++)
			{
				redt[j] = valt[j];

			}
			for (int j = 8; j < 16; j++)
			{
				greent[j - 8] = valt[j];
			}

			for (int j = 16; j < 24; j++)
			{
				bluet[j - 16] = valt[j];
			}
			
			String reds = Arrays.toString(redt);
			String greens = Arrays.toString(greent);
			String blues=Arrays.toString(bluet);
			
			red= Integer.parseInt(reds,2);
			green=Integer.parseInt(greens,2);
			blue=Integer.parseInt(blues,2);
			
			double [] rgb = new double[5];
			rgb[0]=findRgbBlack(red, green, blue);
			rgb[1]=findRgbWhite(red, green, blue);
			rgb[2]=findRgbRed(red, green, blue);
			rgb[3]=findRgbGreen(red, green, blue);
			rgb[4]=findRgbBlue(red, green, blue);
			double tmp =rgb[0];
			for(int x=1; x<5;x++){
				if(rgb[x]<tmp){
					tmp=rgb[x];
				}
				
				if(tmp ==rgb[0]){
					System.out.println("Black");
				}
				if(tmp ==rgb[1]){
					System.out.println("White");
				}
				if(tmp ==rgb[2]){
					System.out.println("Red");
				}
				if(tmp ==rgb[3]){
					System.out.println("Green");
				}
				if(tmp ==rgb[4]){
					System.out.println("BLue");
				}
				
				
			}
			
			
			

		}


	}

}
