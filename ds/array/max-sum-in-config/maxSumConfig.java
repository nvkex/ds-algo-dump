
/**
 * QUESTION:
 * Given an array(0-based indexing), you have to find the max sum of i*A[i] where A[i] is the element at index i in the array. 
 * The only operation allowed is to rotate(clock-wise or counter clock-wise) the array any number of times.
 * 
 * INPUT:
 * The first line of input is the number of test cases T. Then T test cases follow. 
 * The first line of each test case is an integer N denoting the size of the array. 
 * Then in the next line are N space separated values of the array A [ ].
 *  
 * OUTPUT:
 * For each test case, the output will be the required max sum in a new line.
 *
 * Time Complexity: O(n)
 */
import java.util.*;

// Driver Code
class Maxsum_Among_All_Rotations_Array {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++)
                arr[i] = sc.nextInt();
            System.out.println(new GfG().max_sum(arr, n));
            t--;
        }
    }
}

// My Code
class GfG
{
    int max_sum(int A[], int n)
    {
    	// Find sum and iSum
    	int sum =0,iSum=0,res;
    	for(int i=0;i<n;i++){
    	    sum+=A[i];
    	    iSum+=A[i]*i;
    	}
        res = iSum;
        
    	// Find the max sum config
    	for(int i=0;i<n-1;i++){
    	    iSum = iSum-(sum-A[i])+A[i]*(n-1);
    	    res = Math.max(res,iSum);
    	}
    	return res;
    }	
}