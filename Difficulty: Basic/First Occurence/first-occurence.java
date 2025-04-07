//{ Driver Code Starts
import java.util.*;

class Implement_strstr {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t > 0) {
            String line = sc.nextLine();
            String a = line.split(" ")[0];
            line = sc.nextLine();
            String b = line.split(" ")[0];

            Solution g = new Solution();
            System.out.println(g.firstOccurence(a, b));

            t--;

            System.out.println("~");
        }
    }
}
// } Driver Code Ends


class Solution {
    // Function to locate the occurrence of the string x in the string s.
    int firstOccurence(String txt, String pat) {
        // Your code here
        int n1= txt.length();
        int n2= pat.length();
        for(int i=0;i<n1;i++){
            if(txt.charAt(i)==pat.charAt(0)){
                int a=i;
                int b=0;
                int count =0;
                while(a<n1 && b<n2){
                    if(txt.charAt(a)==pat.charAt(b)){
                        count++;
                    }else{
                        break;
                    }
                    a++; 
                    b++;
                }
                if(count==n2){
                    return i;
                }
            }
        }
        return -1;
    }
}
