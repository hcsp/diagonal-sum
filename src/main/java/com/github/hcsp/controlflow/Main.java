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
        //创建三个存储数字的值
        int a = 0;
        int b = 0;
        int c = 0;
        //循环遍历数组拿到下标的值
        while (a < matrix.length && b < matrix.length) {
            //下标加1
            c += matrix[a++][b++];
        }

        return c;
    }

}
