package com.itheima.test;

import java.util.Scanner;

public class Test2 {
        public static void main(String[] args) {
                /*
                 * 你和你的约会对象在餐厅里面正在约会. 键盘输入两个整数, 表示你和你约会对象衣服的时髦成都.(手动录入0-10之间的整数, 不能录入其他)
                 * 如果你的时髦度大于你对象的时髦度, 相亲成功输出true, 否则false
                 */

                //创建输入对象
                Scanner sc = new Scanner(System.in);
                System.out.println("请输入你的时髦度:");

                //创建接收变量,并使用接收对象将接收的数据赋予变量
                int n = sc.nextInt();
                System.out.println("请输入你约会对象的时髦度:");
                int m = sc.nextInt();

                //创建布尔变量
                boolean a = n > m;
                System.out.println(a);

        }
}
