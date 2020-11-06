package com.zc.arithmetic;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import java.util.Arrays;

/**
 * @description:
 * @projectName:arithmetic
 * @see:com.zc.arithmetic
 * @author:赵冲
 * @createTime:2020/11/6 8:47
 * @version:1.0
 */

//二分查找前提是有序的
public class 二分查找 {
    public static int rank(int key , int[] a)
    {
        int lo = 0;
        int hi =a.length - 1;
        while (lo<=hi)
        {
            int mid = lo + (hi - lo) / 2;
            if (key < a[mid])
            {
                hi = mid - 1;
            }else if (key > a[mid]){
                lo = mid + 1;
            }else {
                return  mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1,3,7,9,11,41,66,88,99,142,456,982,1000};
        System.out.println(rank(88,arr));
//        int[] arr = In.readInts(args[0]);
//        Arrays.sort(arr);
//        while (!StdIn.isEmpty())
//        {
//            int key = StdIn.readInt();
//            if (rank(key , arr)<0)
//            {
//                StdOut.print(key);
//            }
//        }
    }


}
