// { Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class Main {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		
		//taking total testcases
		int T=sc.nextInt();
		
		while(T-->0)
		{
		    Solution obj=new Solution();
		    int N;
		    
		    //taking N
		    N=sc.nextInt();
		    
		   //calling method digitsInFactorial()
		   System.out.println(obj.digitsInFactorial(N));
		    
		}
		
	}
}
// } Driver Code Ends


//User function Template for Java


class Solution{
    public static double M_E = 2.71828182845904523536;
    public static double M_PI = 3.141592654;   

    public int digitsInFactorial(int N){
    
  
if(N<0)

return 0;

if(N==0 || N==1)

    return 1;


double d=0;
//using kamenetsky formula
 d=(N * Math.log10(N / M_E) + Math.log10(2 * M_PI * N) /2.0);
return  (int)Math.floor(d) + 1;

    }
}
