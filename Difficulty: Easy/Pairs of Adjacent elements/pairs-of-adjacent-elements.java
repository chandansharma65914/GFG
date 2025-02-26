//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while (t-- > 0) {

            String a[] = in.readLine().trim().split("\\s+");
            int N = a.length;
            int arr[] = new int[N];
            for (int i = 0; i < N; i++) arr[i] = Integer.parseInt(a[i]);

            Solution ob = new Solution();
            System.out.println(ob.adjacentPairs(arr));
            System.out.println("~");
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    static int adjacentPairs(int arr[]) {
        // code here[]
        int count=0;
        for(int i=0 ;i<arr.length-1;i++){
            if(arr[i]+1 == arr[i+1]){
                count++;
            }
        }return count;
    }
}