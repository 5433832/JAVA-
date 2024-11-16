package com.itheima.test;

import java.util.Scanner;

public class Test3 {
        public static void main(String[] args) {
                /*
                 * 数字6是一个真正伟大的数字, 键盘录入两个整数
                 * 如果其中一个为6, 最终结果输出true
                 * 如果他们的和为6的倍数,最终结果输出true
                 * 其他情况都为false
                 * */

                //提示
                System.out.println("请输入两个整数:");
                //创建输入对象
                Scanner sc = new Scanner(System.in);

                //键盘输入两个整数
                int a = sc.nextInt();
                int b = sc.nextInt();


                //为真的情况a==6 b==6 (a+b)%6==0
                //进行短路逻辑运算符连接三个判断
                boolean result = (a + b) % 6 == 0 || a == 6 || b == 6;
                System.out.println(result);
        }
}
