// My code

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		
		int t;
		Scanner sc = new Scanner(System.in);
		t = sc.nextInt();
		Node head = null;
		while(t-->0){
		    int n = sc.nextInt();
		    int []arr = new int[n];
		    for(int i=0;i<n;i++){
		        arr[i] = sc.nextInt();
		    }

		    // Calculate and display height
		    System.out.println((int)(Math.log10(n)/Math.log10(2)));
		}
		
	}
}