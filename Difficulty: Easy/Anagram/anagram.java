//{ Driver Code Starts
import java.io.*;
import java.lang.*;
import java.util.*;
import java.util.stream.*;

class GFG {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            String s1 = br.readLine(); // first string
            String s2 = br.readLine(); // second string

            Solution obj = new Solution();

            if (obj.areAnagrams(s1, s2)) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
            System.out.println("~");
        }
    }
}
// } Driver Code Ends


class Solution {
    // Function is to check whether two strings are anagram of each other or not.
    public static boolean areAnagrams(String s1, String s2) {
            if(s1.length()!=s2.length()){
                return false;
            }
        // Your code here
        Map<Character,Integer> map= new HashMap<>();
        
        for(char c : s1.toCharArray()){
            if(map.containsKey(c)){
                map.put(c,map.get(c)+1);
            }else{
                map.put(c,1);
            }
        }
        
        for(char c : s2.toCharArray()){
            if(map.containsKey(c)){
                if(map.get(c)<=0){
                    return false;
                }else{
                    map.put(c,map.get(c)-1);
                }
            }else{
                return false;
            }
        }
        return true;
    }
}