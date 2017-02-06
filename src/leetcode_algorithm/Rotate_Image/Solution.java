package leetcode_algorithm.Rotate_Image;


import java.util.Arrays;

public class Solution {


    public static void main(String[] args) {
        int[][] matrix = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        new Solution().rotate(matrix);
        for (int[] nums : matrix) {
         System.out.println(Arrays.toString(nums));
        }
    }

    /**
     * �Ƽ��ⷨ
     * @param matrix
     */
    public void rotate(int[][] matrix) {
        for(int i = 0; i< matrix.length; i++) {
            for(int j  = i + 1; j < matrix.length; j++) {
                int temp = 0;
                temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        for(int i = 0; i< matrix.length; i++) {
            for(int j  = 0; j < matrix.length / 2; j++) {
                int temp = 0;
                temp = matrix[i][j];
                matrix[i][j] = matrix[i][matrix.length - 1 - j];
                matrix[i][matrix.length - 1 - j] = temp;
            }
        }
    }

}
