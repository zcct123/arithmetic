package com.zc.arithmetic;

/**
 * @description:
 * @projectName:arithmetic
 * @see:com.zc.arithmetic
 * @author:赵冲
 * @createTime:2020/11/5 15:41
 * @version:1.0
 */

//计算两个非负整数p和q的最大公约数：若q是0，则最大公约数为p。否则，将p除以q得到余数r，p和q的最大公约数即为q和r的最大公约数。
public class 最大公约数 {

    public static void main(String[] args) {
        System.out.println(gcd(3,7));
    }
    public  static  int gcd (int p , int q)
    {
        if(q == 0)
        {
            return p;
        }
        int r = q % p;
        return r;

    }

}
