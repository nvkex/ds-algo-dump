/**
 * Bubble Sort
 * Time Complexity: O(n^2)
 * 
 * Input:
 * 0 - Ascending
 * 1 - Descending
 * First line contains number of test cases.
 * Next two lines for every test case contain array length and comparator followed by array elements.
 * 
 * Example:
 * 2
 * 4 0
 * 10 45 2 8
 * 6 1
 * 8 7 10 45 82 66
 * 
 * Output:
 * 2 8 10 45
 * 82 66 45 10 8 7
 * 
 */
import java.util.Scanner;

class BubbleSort{

    public static void main(String args[]){
        BubbleSort obj = new BubbleSort();
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int n,comp=0;
        while(t-->0){
            n = sc.nextInt();
            comp = sc.nextInt();
            int []arr = new int[n];
            for(int i=0;i<n;i++)
                arr[i] = sc.nextInt();
            arr = obj.sort(arr,comp);
            obj.display(arr);
        }

        sc.close();
    }

    int [] sort(int []arr, int comp){
        int temp;
        for(int i = 0;i<arr.length;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(comparator(arr[j],arr[j+1],comp)){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }

    boolean comparator(int a, int b, int c){
        if(c==0){
            return a>b?true:false;
        }
        else{
            return a<b?true:false;
        }
    }

    void display(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}