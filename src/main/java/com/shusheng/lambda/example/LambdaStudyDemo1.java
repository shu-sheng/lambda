package com.shusheng.lambda.example;


import com.shusheng.lambda.functionalinterface.demo1.MathAdd;
import com.shusheng.lambda.functionalinterface.demo1.MathMultiplication;
import com.shusheng.lambda.functionalinterface.demo1.MathSubtraction;

/**
 * @Description Lambda表达式用法
 * @Author Created by wupeng.
 * @Email eric_wu_peng@126.com
 * @Date 2019-11-06
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
        int z = mm.multiplication(3, 4);

        System.out.print(x+":"+y+":"+z);
    }

}
