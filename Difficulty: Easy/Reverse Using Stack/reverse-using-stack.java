//{ Driver Code Starts
// Initial Template for Java
import java.util.*;


// } Driver Code Ends

class Solution {
    public String reverse(String S) {
        // code here
        Stack<Character>st = new Stack<>();
        for(int i=0;i<S.length();i++){
            st.push(S.charAt(i));
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<S.length();i++){
            sb.append(st.pop());
        }
        return sb.toString();
    }
}


//{ Driver Code Starts.

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());

        while (t-- > 0) {
            Solution sol = new Solution();
            String input = sc.nextLine();
            String reversed = sol.reverse(input);
            System.out.println(reversed);
            System.out.println("~");
        }
        sc.close();
    }
}

// } Driver Code Ends