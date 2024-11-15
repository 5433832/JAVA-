package com.itheima.YunSuanFu;

public class AritheimaticoperatorDemo {
        public static void main(String[] args) {
                //+
                System.out.println(3 + 2);
                //-
                System.out.println(5 - 1);
                //*
                System.out.println(7 * 9);
                // /
                System.out.println(9 / 3);

                System.out.println(10 / 3);//3
                //若要得到小数需要让小数参与计算
                System.out.println(10.0 / 3);//3.3333333333333335

                //%
                System.out.println(5 % 2);//1
                //如果计算中有小数参与结果是有可能不精确的
                System.out.println(1.1 * 1.01);
                System.out.println(5.05 - 1.01);
                System.out.println(5.06 + 1.04);

        }
}