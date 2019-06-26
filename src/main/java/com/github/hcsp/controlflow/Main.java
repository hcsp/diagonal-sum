package com.github.hcsp.controlflow;

public class Main {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println(diagonalSum(matrix));
    }

    /**
     * 给定一个二维数组，返回其主对角线（从左上到右下）元素之和。你可以假设该数组是NxN的，即一维和二维长度相同，都是N。
     *
     * @param matrix 给定的二维数组
     * @return 对角线元素之和
     */
    public static int diagonalSum(int[][] matrix) {
        int n = matrix.length;

        int result1 = 0;
        int result2 = 0;
        for (int i = 0; i < n ; i++) {
            result1 += matrix[i][i];
//            result2 += matrix[i][n-i-1];
        }

        int result = result1 + result2;

        if(n % 2 == 0) {
            return result;
        }else {
//            int center = (1 + n) / 2 - 1;
            return result;
//            return result - matrix[center][center];
        }


    }
}
