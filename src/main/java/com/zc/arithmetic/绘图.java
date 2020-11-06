package com.zc.arithmetic;

import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdRandom;
import org.junit.jupiter.api.Test;

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
        suiJi();
       // ceshi();
    }

    //函数值
    public static void ceshi() {
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

    //随机数组
    public  static void  suiJi()
    {
        int N=50;
        double[]a=new double[N];
        for (int i=0;i<N;i++)
        {
            a[i]= StdRandom.random();
        }
        for(int i = 0; i<N; i++)
        {
            double x=1.0*i/N;
            double y=a[i]/2.0;
            double rw=0.5/N;
            double rh=a[i]/2.0;
            StdDraw. filledRectangle(x,y, rw, rh);
        }
    }

}
