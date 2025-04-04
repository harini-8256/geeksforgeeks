//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            sc.nextLine();
            String s = sc.next();
            Solution obj = new Solution();
            String ans = obj.postToPre(s);
            System.out.println(ans);
        
System.out.println("~");
}
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    static String postToPre(String post_exp) {
        // code here
        int i=0;
        int n = post_exp.length();
        Stack<String>st = new Stack<>();
        while(i<n){
            if((post_exp.charAt(i)>='A' && post_exp.charAt(i)<='Z')||(post_exp.charAt(i)>='a' && post_exp.charAt(i)<='z')||(post_exp.charAt(i)>='0' && post_exp.charAt(i)<='9')){
                st.push(post_exp.charAt(i)+"");
            }
            else{
                String t1= st.peek();
                st.pop();
                String t2= st.peek();
                st.pop();
                st.push(post_exp.charAt(i)+t2+t1);
                
            }
            i++;
        }
        return st.peek();
    }
}
