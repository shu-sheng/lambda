package com.shusheng.tihuzhai.example;

import com.shusheng.tihuzhai.functionalinterface.MathAdd;
import com.shusheng.tihuzhai.functionalinterface.MathMultiplication;
import com.shusheng.tihuzhai.functionalinterface.MathSubtraction;

/**
 * @Description Lambda表达式用法
 * @Author Created by wupeng.
 * @Email eric_wu_peng@126.com
 * @Date 2017-01-17
 */
public class LambdaStudyDemo1 {

    public static void main(String[] args) {
        //【接口名字 接口对象 = 参数 -> 重写的方法体】
        // 例如:Inter inter = （a,b）->a+b
        MathAdd ma = (int a,int b)->a+b;
        MathSubtraction ms = (int a,int b)->a-b;
        MathMultiplication mm = (int a,int b)->a*b;

        int x = ma.add(1,2);
        int y = ms.subtraction(2, 3);
        int z = mm.subtraction(3,4);

        System.out.print(x+":"+y+":"+z);
    }

}
