// Time Complexity : O(mn)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<Integer>();
        int len=matrix.length*matrix[0].length;
        //System.out.println(res.size());
        int top=0, bottom=matrix.length-1, left=0, right=matrix[0].length-1;
        while(res.size()<len){
            for(int i=left; i<=right; i++){
                res.add(matrix[top][i]);
            }
            top++;
            for(int i=top; i<=bottom && res.size()<len; i++){ //always check for base boundary condition when they are being manipulated more than once inside the loop.
                res.add(matrix[i][right]);
            }
            right--;
            for(int i=right; i>=left && res.size()<len; i--){ //always check for base boundary condition when they are being manipulated more than once inside the loop.
                res.add(matrix[bottom][i]);
            }
            bottom--;
            for(int i=bottom; i>=top && res.size()<len; i--){ //always check for base boundary condition when they are being manipulated more than once inside the loop.
                res.add(matrix[i][left]);
            }
            left++;
        }
        return res;
    }
}
