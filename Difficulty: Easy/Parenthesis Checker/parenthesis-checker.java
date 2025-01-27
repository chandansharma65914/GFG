//{ Driver Code Starts
import java.io.*;
import java.lang.*;
import java.util.*;

class Driverclass {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // Reading total number of testcases
        int t = sc.nextInt();

        while (t-- > 0) {
            // reading the string
            String st = sc.next();

            // calling ispar method of Paranthesis class
            // and printing "balanced" if it returns true
            // else printing "not balanced"
            if (new Solution().isParenthesisBalanced(st) == true)
                System.out.println("true");
            else
                System.out.println("false");

            System.out.println("~");
        }
    }
}
// } Driver Code Ends



class Solution {
    // Function to check if brackets are balanced or not.
    static boolean isParenthesisBalanced(String s) {
        // code here
       Stack<Character> stk = new Stack<>();

        for (char x : s.toCharArray()) {
            // Push opening brackets to the stack
            if (x == '(' || x == '{' || x == '[') {
                stk.push(x);
            } else {
                // If stack is empty or brackets don't match, return false
                if (stk.empty()) {
                    return false;
                }
                String temp = "" + stk.peek() + x;
                if (temp.equals("()") || temp.equals("{}") || temp.equals("[]")) {
                    stk.pop(); // Matched pair, pop the stack
                } else {
                    return false; // Mismatched pair
                }
            }
    }
    return stk.empty();
    }
}
