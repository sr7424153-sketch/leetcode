class Solution {
    public int mirrorDistance(int n) {
        String s=Integer.toString(n);
        String rev="";
        for(int i=s.length()-1;i>=0;i--){
            rev+=s.charAt(i);
        }
        int k=Integer.parseInt(rev);
        if(k>n){
            return k-n;
        }
        return n-k;
        
    }
}