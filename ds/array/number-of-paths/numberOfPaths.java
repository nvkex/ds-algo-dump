/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int t = sc.nextInt();
	    while(t-->0){
		    int n = sc.nextInt();
		    int m = sc.nextInt();
		
		    System.out.println(countPath(n,m));
	    }
	}
	
	static int countPath(int r, int c){
	    if(r == 1 || c == 1)
	        return 1;
	    
	    return countPath(r-1,c) + countPath(r,c-1);
	}
}