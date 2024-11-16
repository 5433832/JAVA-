package com.itheima.test;

import java.util.Scanner;

public class Test4 {
        public static void main(String[] args) {
                /*
                 * 动物园里有两只老虎, 体重分别为通过键盘录入获得,
                 * 请用程序实现判断两只老虎的体重是否相同
                 * */

                //创建输入对象
                Scanner sc = new Scanner(System.in);
                System.out.println("请输入两只老虎的体重:");
                int n = sc.nextInt();
                int m = sc.nextInt();
                System.out.println(n == m ? "相同" : "不同");
        }
}
