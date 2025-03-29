//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main(String args[])throws IOException
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    String s = sc.next();
                    Solution ob = new Solution();
                    System.out.println(ob.countWrongPlacedBalls(s));
                }
        }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    public int countWrongPlacedBalls(String s)
    {
        //code here.
        int ans =0;
        
        char[] arr= s.toCharArray();
        int n= arr.length;
        
        for(int i=0;i<n;i++){
             char c= arr[i];
             
             if(c=='R'){
                 if(i%2==1){
                     ans++;
                 }
             }else{
                 if(i%2==0){
                     ans++;
                 }
             }
        }
        return ans;
    }

}