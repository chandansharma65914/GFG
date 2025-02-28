//{ Driver Code Starts
import java.util.*;


// } Driver Code Ends
// User function Template for Java

class Solution {

    public long firstIndex(int arr[]) {
         int i=0;
        int n=arr.length;
        int j=n-1;
        while(i<=j){
            int mid =  i + (j-i)/2;
            if(arr[mid]==0){
                i=mid+1;
            }else if(arr[mid]==1){
                j=mid-1;
            }
        }
        
        if(i<n &&arr[i]==1){
            return i;
        }return -1;
        
    }
}

//{ Driver Code Starts.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine(); // Consume the newline character
        while (t-- > 0) {
            String input = sc.nextLine();
            String[] parts = input.split(" ");
            int[] arr = new int[parts.length];
            for (int i = 0; i < parts.length; i++) {
                arr[i] = Integer.parseInt(parts[i]);
            }
            Solution ob = new Solution();
            System.out.println(ob.firstIndex(arr));
        
System.out.println("~");
}
        sc.close();
    }
}
// } Driver Code Ends