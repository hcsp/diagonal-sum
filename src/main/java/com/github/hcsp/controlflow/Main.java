package com.github.hcsp.controlflow;

public class Main {
    public static void main(String[] args) {
        int[][] matrix = {{10, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println(diagonalSum(matrix));
    }

    /**
     * 给定一个二维数组，返回其对角线元素之和。你可以假设该数组是NxN的，即一维和二维长度相同，都是N。
     *
     * @param matrix 给定的二维数组
     * @return 对角线元素之和
     */
    public static int diagonalSum(int[][] matrix) {
        int len = matrix.length;
        int result1=0;
        int result2=0;
        for (int i = 0;i<len;i++){
            for (int j = 0; j < len; j++) {
                //上左--下右
                if (i == j) {
                    result1 = result1 + matrix[i][j];
                }
                //上右---下左

                if ((i + j) == (len - 1)) {
                    result2 = result2 +matrix[i][j];
                }
            }
        }
        return result1+result2;
    }
}
