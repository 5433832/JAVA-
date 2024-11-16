package com.itheima.YunSuanFu;

public class AritheimaticoperatorDemo7 {
        public static void main(String[] args) {
                //&& 短路与
                //运行结果和&是一样的
                //表示两边都为真, 结果才为真
                System.out.println(true && true);
                System.out.println(false && false);
                System.out.println(false && true);
                System.out.println(true && false);

                System.out.println("----------");

                //||短路或
                //运行结果和|是一样的
                //表示两边都为假, 结果才为假
                System.out.println(true || true);
                System.out.println(false || false);
                System.out.println(false || true);
                System.out.println(true || false);

                //短路逻辑运算符具有短路效果
                //当左边表达式可以确定结果时,右边就不会参与运行
                int a = 10;
                int b = 10;
                boolean c = ++a < 5 && ++b < 5;
                System.out.println(c);
                System.out.println(a);
                System.out.println(b);


        }
}
