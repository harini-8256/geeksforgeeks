// User function Template for Java

class Solution {
    ArrayList<Integer> findMissing(int[] a, int[] b) {
            ArrayList<Integer>ans = new ArrayList<>();
            HashSet <Integer>hs = new HashSet<>();
            for(int x:b){
                hs.add(x);
            }
            for(int y:a){
                if(!hs.contains(y)){
                    ans.add(y);
                }
            }
            
            
            return ans;
    }
}