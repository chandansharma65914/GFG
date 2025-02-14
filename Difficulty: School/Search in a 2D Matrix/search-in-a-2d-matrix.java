//{ Driver Code Starts
import java.io.*;
import java.util.*;


// } Driver Code Ends
class Solution {
    public boolean searchMatrix(int[][] mat, int target) {
        // code here[]
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[i].length;j++){
                if(mat[i][j]==target){
                    return true;
                }
            }
        }
        return false;
    }
}

//{ Driver Code Starts.

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine().trim()); // Read number of test cases
        while (t-- > 0) {
            String[] dimensions = br.readLine().split(" ");
            int n = Integer.parseInt(dimensions[0]);
            int m = Integer.parseInt(dimensions[1]);

            int[][] matrix = new int[n][m];
            for (int i = 0; i < n; i++) {
                String[] row = br.readLine().split(" ");
                for (int j = 0; j < m; j++) {
                    matrix[i][j] = Integer.parseInt(row[j]);
                }
            }

            int target = Integer.parseInt(br.readLine().trim());
            Solution sol = new Solution();
            boolean found = sol.searchMatrix(matrix, target);
            System.out.println(found ? "true" : "false");
            System.out.println("~");
        }
    }
}

// } Driver Code Ends