package com.itheima.YunSuanFu;

public class AritheimaticoperatorDemo2 {
        public static void main(String[] args) {
                byte b1=10;
                byte b2=20;

                byte result=(byte)(b1+b2);
                System.out.println(result);

                byte c1=100;
                byte c2=100;

                byte resultc=(byte)(c1+c2);
                //会发生错误,因为转换的数值超过了变量类型的范围
                System.out.println(resultc);
        }
}
