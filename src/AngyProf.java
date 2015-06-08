import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class AngyProf
{

	public static void main(String[] args)
	{
		 int _case, total ,least;
		
		
		 
		 Scanner in = new Scanner(System.in);
		 _case = in.nextInt();
		 in.nextLine();
		 
		 
		 //System.out.println(_case +" "+ total +" "+ least);
		 
		 for(int i =0; i<_case; i++){
			 List<Integer> stlist =new ArrayList<Integer>(); 
			 int late =0;
			 
			 total=in.nextInt();		
			 least=in.nextInt();
			 for(int j=0; j<total;j++){
				 stlist.add(in.nextInt());
			 }
			// System.out.println("list: " + stlist.toString());
			 for (int x=0; x<stlist.size();x++){
				 if(stlist.get(x)>0)
					 late++;
				 
			 }
			 
			 
			// System.out.println("late: "+ late);
			 if(total-late<least)
				 System.out.println("YES");
			 else
				 System.out.println("NO");
			 
			/* for(int x=0; x<stlist.size();x++){
				 stlist.remove(x);
			 }*/
			// System.out.println("last size of stlist: " + stlist.size());
		 }
		 
		 
		 
		 

	}

}
