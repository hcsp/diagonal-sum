package com.github.hcsp.controlflow;

public class Main {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] matrix2 = {{1, 2, 3,4}, {5, 6,7,8}, { 9,10,11,12}, { 13,14,15,16}};
        System.out.println(diagonalSum(matrix2));
    }

    /**
     * 给定一个二维数组，返回其主对角线（从左上到右下）元素之和。你可以假设该数组是NxN的，即一维和二维长度相同，都是N。
     *
     * @param matrix 给定的二维数组
     * @return 对角线元素之和
     */
    public static int diagonalSum(int[][] matrix) {
        int sideLength = matrix.length;
        int sum = 0;
        for (int i = 0,j=sideLength-1; i <  sideLength; i++,j--) {
            sum += matrix[i][i];
        }
        return sum;
    }
}
