import java.util.*;
class Solution {
    public int largestAltitude(int[] gain) {
        int x=0;  // reprsent current height !
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<gain.length;i++){
            x+=gain[i];
            largest=Math.max(largest,x);
        }
        if(largest<0){
            largest=0;
        }
        return largest;
        
    }
}