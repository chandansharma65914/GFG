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

    		System.out.println (new Sol().divisibleBy4 (s));
        
System.out.println("~");
}
        
    }
}

// Contributed By: Pranay Bansal

// } Driver Code Ends


//User function Template for Java

class Sol
{
    int divisibleBy4 (String N)
    {
         int a= N.length();
        // Your Code Here
        if(a>2){
           String x="";
       
        x+= N.charAt(a-2);
        x+=N.charAt(a-1);
        int y = Integer.parseInt(x);
        if(y%4==0){
            return 1;
        } 
        }else{
             int m = Integer.parseInt(N);
             if(m%4==0){
                 return 1;
             }
        }
        
        return 0;
    }
}