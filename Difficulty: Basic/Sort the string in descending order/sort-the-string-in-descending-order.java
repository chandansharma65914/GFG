//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine().trim());
        while (t-- > 0) {
            String str = read.readLine().trim();
            Solution ob = new Solution();
            System.out.println(ob.ReverseSort(str));

            System.out.println("~");
        }
    }
}
// } Driver Code Ends


// User function Template for Java
class Solution {
    String ReverseSort(String s) {
       char[] charArray = s.toCharArray();
        Arrays.sort(charArray);  // Sorts in ascending order
        String sorted = new String(charArray);
        return new StringBuilder(sorted).reverse().toString();
    }
}