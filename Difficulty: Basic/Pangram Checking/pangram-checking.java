//{ Driver Code Starts
//Initial Template for Java



import java.util.*;
import java.io.*;
import java.lang.*;

class Driver
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        
        while(t-- > 0)
        {
            String str = read.readLine();
            System.out.println(new Solution().isPanagram(str)? "1":"0");
        
System.out.println("~");
}
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{

    // Complete the function
    // str: input string
    public static boolean isPanagram(String str)
    {
        // Check if given string is panagram
         
        int[] arr= new int[26];
        for(char c : str.toLowerCase().toCharArray()){
            arr[c-'a']++;
        }
        for(int x : arr){
            if(x==0){
                return false;
            }
        }
        return true;
    }
}