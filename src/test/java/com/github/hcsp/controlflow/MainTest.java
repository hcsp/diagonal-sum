package com.github.hcsp.controlflow;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class MainTest {
    @Test
    public void test() {
        java.util.Random r = new java.util.Random();
        int[][] m = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        m[0][0] = r.nextInt(100);
        m[1][1] = r.nextInt(100);
        m[2][2] = r.nextInt(100);
        assertEquals(m[0][0] + m[1][1] + m[2][2], Main.diagonalSum(m));
    }
}
