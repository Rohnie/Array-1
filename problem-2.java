// Time Complexity : O(mn)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int len=mat.length*mat[0].length;
        int[] res = new int[len];
        int c=0;
        int dir=1;
        int i=0, j=0;
        while(c<len){
            //When direction is up
            if(dir==1){
                res[c]=mat[i][j];
                c++;
                //Check if top line of the matrix is reached, cover the edge case of the diagonal
                if(i==0 && j<mat[0].length-1){
                    dir=0;
                    j++;
                }
                //Check if right line of the matrix is reached
                else if(j==mat[0].length-1){
                    dir=0;
                    i++;
                }
                //do the normal case traversal
                else{
                    i--;
                    j++;
                }
            }
            //When direction is up
            else{
                res[c]=mat[i][j];
                c++;
                //Check if left line of the matrix is reached, cover the edge case of the diagonal
                if(j==0 && i<mat.length-1){
                    dir=1;
                    i++;
                }
                //Check if bottom line of the matrix is reached
                else if(i==mat.length-1){
                    dir=1;
                    j++;
                }
                //do the normal case traversal
                else{
                    i++;
                    j--;
                }
            }
        }
        return res;
    }
}
