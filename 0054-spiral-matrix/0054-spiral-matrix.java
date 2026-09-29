class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
      int top =0;
      int bottom = matrix.length-1;
      int left =0;
      int right = matrix[0].length-1;
      List<Integer>li = new ArrayList<>();
      while(top<=bottom && left<=right){
        for(int i= left; i<=right; i++){
            li.add(matrix[top][i]);
        }
        top++;
        for(int i=top; i<=bottom;i++){
            li.add(matrix[i][right]);
        }
        right--;
       
       if (top <= bottom) {

                for (int j = right; j >= left; j--) {
                    li.add(matrix[bottom][j]);
                }

                bottom--;
            }
            if (left <= right) {

                for (int i = bottom; i >= top; i--) {
                    li.add(matrix[i][left]);
                }

                left++;
            }
      }
      return li; 
    }
}