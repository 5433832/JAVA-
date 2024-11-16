package com.itheima.YunSuanFu;

public class AritheimaticoperatorDemo4 {
        public static void main(String[] args) {
                //+=
                //规则: 将左边和右边进行相加, 然后赋值给左边
                int a=10;
                int b=20;
                a+=b;
                //等同于a=(int)(a+b);
                System.out.println(a);
                System.out.println(b);

                //细节
                //+= -= *= /= %=都隐藏了一个强制转换
                //short在计算时会先转为int型再进行计算,根据左边的变量类型再把结果转换类型
                short s=1;
                //等同于s=(short)(s+1);
                s+=1;
                System.out.println(s);
        }
}
