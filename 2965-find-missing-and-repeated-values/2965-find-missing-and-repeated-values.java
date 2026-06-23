import java.util.HashSet;

class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {

        int n = grid.length;
        int total = n * n;

        HashSet<Integer> set = new HashSet<>();

        int repeated = -1;

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {

                if(set.contains(grid[i][j])) {
                    repeated = grid[i][j];
                } else {
                    set.add(grid[i][j]);
                }
            }
        }

        int missing = -1;

        for(int num = 1; num <= total; num++) {
            if(!set.contains(num)) {
                missing = num;
                break;
            }
        }

        return new int[]{repeated, missing};
    }
}