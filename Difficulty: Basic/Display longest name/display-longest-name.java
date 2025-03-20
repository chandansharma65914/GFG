//{ Driver Code Starts
import java.util.*;

public class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine(); // Consume the newline character
        while (t-- > 0) {
            List<String> names = new ArrayList<>();
            String input1 = sc.nextLine();
            Scanner ss1 = new Scanner(input1);
            while (ss1.hasNext()) {
                names.add(ss1.next());
            }
            Solution obj = new Solution();
            String res = obj.longest(names);
            System.out.println(res);

            System.out.println("~");
        }
    }
}

// } Driver Code Ends



class Solution {
    public String longest(List<String> arr) {
        // code here
        
        int a=0;
        int b=0;
        int n= arr.size();
        for(int i=0;i<n;i++){
            int x= arr.get(i).length();
           if(x>b){
               a=i;
               b=x;
           }
        }
        return arr.get(a);
    }
}
