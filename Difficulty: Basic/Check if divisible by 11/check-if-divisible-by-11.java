//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main (String[] args)
    {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            String s = sc.next ();

    		System.out.println (new Sol().divisibleBy11 (s));
        
System.out.println("~");
}
        
    }
}

// Contributed By: Pranay Bansal
// } Driver Code Ends


//User function Template for Java

class Sol
{
    int divisibleBy11 (String S)
    {
        // Your Code Here
        int n = S.length();
        int even=0;
        int odd=0;
        for(int i=0;i<n;i++){
            if(i%2==0){
                even+= Character.getNumericValue(S.charAt(i));
            }else{
                 odd+= Character.getNumericValue(S.charAt(i));
            }
        }
         if(even-odd==0 || (even-odd)%11==0){
             return 1;
         }
         return 0;
    }
}