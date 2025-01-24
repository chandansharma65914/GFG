//{ Driver Code Starts
import java.util.*;


// } Driver Code Ends
class Solution {
    public int findUnique(int k, int[] arr) {
       HashMap<Integer,Integer> map = new HashMap<>();
       for(int x : arr){
           if(map.containsKey(x)){
               map.put(x, map.get(x)+1);
           }else{
               map.put(x,1);
           }
       }
       for(int x : map.keySet()){
           if(map.get(x)%k !=0){
               return x;
           }
       }
       return -1;
    }
}

//{ Driver Code Starts.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = Integer.parseInt(scanner.nextLine().trim());
        for (int i = 0; i < t; i++) {
            int k = Integer.parseInt(scanner.nextLine().trim());
            String[] inputLine = scanner.nextLine().trim().split(" ");
            int[] arr = new int[inputLine.length];
            for (int j = 0; j < inputLine.length; j++) {
                arr[j] = Integer.parseInt(inputLine[j]);
            }

            Solution solution = new Solution();
            System.out.println(solution.findUnique(k, arr));
        
System.out.println("~");
}

        scanner.close();
    }
}

// } Driver Code Ends