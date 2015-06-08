import java.io.*;
import java.util.Scanner;


public class SolutionFizz {
    
    public static void dive(int k){
    if((k%3==0) && (k%5!=0))
        System.out.println("Fizz");
    else if((k%5==0) && (k%3 !=0))
        System.out.println("Buzz");
    else if((k%5==0)&&(k%3 ==0))
        System.out.println("FizzBuzz");
    else
        System.out.println(k);
    
}
    
    public static int dup(int [] array){
    	int dup_val=0;
    	for (int j=0;j<array.length;j++){
    		  for (int k=j+1;k<array.length;k++){
    			    if (k!=j && array[k] == array[j])
    			      dup_val++;
    		  }
    	}
    	return dup_val;
    }
    
    
    
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        Scanner in = new Scanner(System.in);
        
        int _case = in.nextInt();
        
        for(int i=0; i<_case; i++){
            
            int _val = in.nextInt();
            
            dive(_val);
            
           
            
        }
        
    }
}