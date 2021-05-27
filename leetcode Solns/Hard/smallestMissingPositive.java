class Solution {
    public int firstMissingPositive(int[] arr) {
        final int n = arr.length;
        int curr, next;
        for(int i=0;i<n;i++){
            curr = arr[i];
            while(curr-1 >=0 && curr-1 < n && curr != (next = arr[curr-1])){
                arr[curr-1] = curr;
                curr = next;
            }
        }
        
        for(int i=0;i<n;i++){
            if(arr[i] != i+1)
                return i+1;
        }
        return n+1;
    }
}