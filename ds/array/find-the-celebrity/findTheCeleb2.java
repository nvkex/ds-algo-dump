
/**
 * Complexity: O(n)
 */

import java.util.Scanner;

// Driver Code
class Celebrity_Problem2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int N = sc.nextInt();
            int M[][] = new int[N][N];
            for (int i = 0; i < N; i++) {

                for (int j = 0; j < N; j++) {
                    M[i][j] = sc.nextInt();
                }
            }
            System.out.println(new Celebrity2().getId(M, N));
            t--;
        }
    }
}

// My Code
class Celebrity2 {

    int getId(int M[][], int n) {
        int start = 0, end = n - 1, sum = 0;
        while (start < end) {
            sum += M[start][end] + M[end][start];
            if (M[start][end] == 1)
                start++;
            else
                end--;
        }
        for (int i = 0; i < n; i++) {
            if (M[start][i] == 1)
                return -1;
        }
        if (sum == 0)
            return -1;
        return start;
    }
}