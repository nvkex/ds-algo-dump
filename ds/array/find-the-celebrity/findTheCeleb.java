/**
 * Complexity: O(n^2)
 */

import java.util.Scanner;


// Driver Code
class Celebrity_Problem
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
int t = sc.nextInt();
while(t>0)
{
int N = sc.nextInt();
int M[][] = new int[N][N];
for(int i=0; i<N; i++)
{

    for(int j=0; j<N; j++)
{
M[i][j] = sc.nextInt();
}
}
System.out.println(new Celebrity().getId(M,N));
t--;
}
}
}

// My Code
class Celebrity
{
    int getId(int M[][], int n)
    {
        int arr[] = new int[n];
        int celeb = -1,sum=0;
        for(int i =0;i<n;i++){
            sum = 0;
            for(int j =0;j<n;j++){
                sum+=M[i][j];
                arr[j] = arr[j]+M[i][j];
            }
            if(sum==0)
                celeb = i;
        }
        if(celeb != -1 && arr[celeb] == n-1)
            return celeb;
        else
            return -1;
    }
}