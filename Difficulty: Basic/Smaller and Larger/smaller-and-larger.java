//{ Driver Code Starts
import java.io.*;
import java.util.*;

public class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine(); // consume the newline
        while (t-- > 0) {
            String input = sc.nextLine();
            String[] strNumbers = input.split(" ");
            int[] arr = new int[strNumbers.length];
            for (int i = 0; i < strNumbers.length; i++) {
                arr[i] = Integer.parseInt(strNumbers[i]);
            }
            int x = Integer.parseInt(sc.nextLine()); // consume the newline
            int[] ans = new Solution().getMoreAndLess(arr, x);
            System.out.println(ans[0] + " " + ans[1]);

            System.out.println("~");
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    int[] getMoreAndLess(int[] arr, int target) {
        // code here
        int a= 0;
        int b= 0;
        
        for(int x : arr){
            if(x>=target){
                a++;
            }
            if(x<=target){
                b++;
            }
        }
        int[] ans= new int[2];
        ans[0]=b;
        ans[1]=a;
        return ans;
    }
}