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
		    int e = sc.nextInt();
		    
		    ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>(n);
		    
		    for(int i=0;i<n;i++){
		        list.add(new ArrayList<Integer>());
		    }
		    
		    for(int i = 0; i< e;i++){
		        int u = sc.nextInt();
		        int v = sc.nextInt();
		        // Add vertex  
		        list.get(u).add(v);
		    }
			
			// Number of dependencies is same as number of edges
		    System.out.println(e);
		}
	}
	
	
}