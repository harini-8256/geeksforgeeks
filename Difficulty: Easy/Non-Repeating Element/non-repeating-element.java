// User function Template for Java

class Solution {
    public int firstNonRepeating(int[] arr) {
        // Complete the function
        HashMap<Integer,Integer>ans = new HashMap<>();
        for(int num:arr){
            ans.put(num,ans.getOrDefault(num,0)+1);
        }
        for(int num:arr){
            if(ans.get(num)==1){
                return num;
            }
        }
        return 0;
    }
}
