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
            String ans = obj.preToInfix(s);
            System.out.println(ans);
        
System.out.println("~");
}
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    static String preToInfix(String pre_exp) {
        // code here
        int i=0;
        int n = pre_exp.length()-1;
        Stack<String>st = new Stack<>();
        for(i=n;i>=0;i--){
            if((pre_exp.charAt(i)>='A' && pre_exp.charAt(i)<='Z') || (pre_exp.charAt(i)>='a' && pre_exp.charAt(i)<='z') ||(pre_exp.charAt(i)>='0' && pre_exp.charAt(i)<='9')){
                st.push(pre_exp.charAt(i)+"");
            }
            else{
                String t1 = st.peek();
                st.pop();
                String t2 = st.peek();
                st.pop();
                st.push('('+t1+pre_exp.charAt(i)+t2+')');
                
            }
        
        }
        return st.peek();
    }
}
