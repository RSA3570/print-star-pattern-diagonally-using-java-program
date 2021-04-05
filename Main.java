/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    
	    int n, i, j;
	    Scanner scn = new Scanner(System.in);
	    n = scn.nextInt();
	    for(i=0; i<n; i++)
	    {
	        for(j=0; j<n; j++)
	        {
	            int k = n-j-1;
	            int l = n-i-1;
	            if (i==j || i==k && j==l)
	            {
	                System.out.print(" {*,*} ");
	            }
	            else
	            {
	                System.out.print(" {"+i+","+j+"} ");
	            } 
	           //System.out.print("*");
	        }
	        System.out.println();
	    }  
		
	}
}
