package com.zc.arithmetic;

import edu.princeton.cs.algs4.StdDraw;

/**
 * @description:
 * @projectName:arithmetic
 * @see:com.zc.arithmetic
 * @author:赵冲
 * @createTime:2020/11/5 16:33
 * @version:1.0
 */
public class 绘图 {
    public static void main(String[] args) {
        int n = 100;
        StdDraw.setXscale(0,n);
        StdDraw.setYscale(0,n*n);
        StdDraw.setPenRadius(.01);
        for (int i = 1; i <= n; i++) {
            StdDraw.point(i,i);
            StdDraw.point(i,i*i);
            StdDraw.point(i,i*Math.log(i));
        }
    }
}
