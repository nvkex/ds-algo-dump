/**
 * Find peak of an array containing only one peak.
 */
import java.util.Scanner;

class Peak{

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []arr = new int[n];
        for(int i = 0;i<n;i++)
            arr[i] = sc.nextInt();
        
        System.out.println(new Peak().getPeak(arr,0,n-1));
        sc.close();
    }

    int getPeak(int []arr, int u, int l){
        if(l-u ==1)
            return arr[l]>arr[u]?arr[l]:arr[u];
        int m = (u+l)/2;

        if(arr[m-1]==arr[m] && arr[m+1] == arr[m])
            return arr[m];
        if(arr[m-1]<=arr[m] && arr[m+1]>=arr[m])
            return getPeak(arr,m,l);
        else if(arr[m-1]>=arr[m] && arr[m+1]<=arr[m])
            return getPeak(arr,u,m);
        return arr[m];
    }
}