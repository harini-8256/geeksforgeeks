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
            String ans = obj.postToInfix(s);
            System.out.println(ans);
        
System.out.println("~");
}
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    static String postToInfix(String exp) {
        // code here
        int i=0;
        int n = exp.length();
        Stack<String>st = new Stack<>();
        while(i<n){
            if((exp.charAt(i)>='A' && exp.charAt(i)<='Z') || (exp.charAt(i)>='a' && exp.charAt(i)<='z') ||(exp.charAt(i)>='0' && exp.charAt(i)<='9')){
                st.push(exp.charAt(i)+"");
            }
            else{
                String t1 = st.peek();
                st.pop();
                String t2 = st.peek();
                st.pop();
                String con = '('+t2+exp.charAt(i)+t1+')';
                st.push(con);
            }
            i++;
        }
        return st.peek();
    }
}
