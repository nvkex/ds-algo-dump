
import java.util.*;

public class LeftRotation {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String[] nd = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nd[0]);

        int d = Integer.parseInt(nd[1]);

        int[] a = new int[n];

        String[] aItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(aItems[i]);
            a[i] = aItem;
        }
        // My Code
        while(d-->0){
            int c = a[0];
            for(int i=0;i<n-1;i++){
                a[i]=a[i+1];
            }
            a[n-1] = c;
        }

        for(int i=0;i<n;i++)
            System.out.print(a[i]+" ");

        // END
        scanner.close();
    }
}
