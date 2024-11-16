package com.itheima.test;

public class Test5 {
        public static void main(String[] args) {
                /*
                 * 一座寺庙里住着三个和尚, 已知他们的身高分别为150cm, 210cm, 165cm
                 * 请用程序实现获取这三个和尚的最高身高
                 * */

                //定义三个变量记录三个身高
                int height1 = 150;
                int height2 = 165;
                int height3 = 210;

                //将第一个和尚和第二个和尚进行比较
                //再拿结果跟第三个和尚比较
                int temp = height1 > height2 ? height1 : height2;
                int max = temp > height3 ? temp : height3;
                System.out.println(max);


        }
}
