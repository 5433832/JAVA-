package com.itheima.YunSuanFu;

public class AritheimaticoperatorDemo8 {
        public static void main(String[] args) {
                //使用三元运算符, 获取两个数的最大值

                //定义两个变量记录两个整数
                int a = 10;
                int b = 20;

                //使用三元运算符获取两个整数的较大值
                //格式: a>b?a:b
                //三元运算符的结果必须使用,否则会报错
                int max = a > b ? a : b;
                System.out.println(max);
                System.out.println(a > b ? a : b);
        }
}
