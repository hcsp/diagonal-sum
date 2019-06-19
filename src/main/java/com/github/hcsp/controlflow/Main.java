package com.github.hcsp.controlflow;

public class Main {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println(diagonalSum(matrix));
    }

    /**
     * 给定一个二维数组，返回其对角线元素之和。你可以假设该数组是NxN的，即一维和二维长度相同，都是N。
     *
     * @param matrix 给定的二维数组
     * @return 对角线元素之和
     */
    public static int diagonalSum(int[][] matrix) {
        int result = 0;
        int n = matrix.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j || i + j == n - 1) {
                    result += matrix[i][j];
                }
            }
        }
        result = result - matrix[(n - 1) / 2][(n - 1) / 2];
        return result;
    }
}
