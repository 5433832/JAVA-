package com.itheima.YunSuanFu;

public class AritheimaticoperatorDemo6 {
        public static void main(String[] args) {
                //& 并且
                //两边都为真, 结果为真
                System.out.println(true & true);
                System.out.println(false & false);
                System.out.println(true & false);
                System.out.println(false & true);

                System.out.println("-----------------");

                //| 或者
                //两边都为假, 结果为假
                System.out.println(true | true);
                System.out.println(false | false);
                System.out.println(true | false);
                System.out.println(false | true);

                System.out.println("-----------------");

                //^ 异或
                //相同为假, 不同为真
                System.out.println(true ^ true);
                System.out.println(false ^ false);
                System.out.println(true ^ false);
                System.out.println(false ^ true);

                System.out.println("-----------------");

                //! 非(取反)
                //注意取反感叹号不要写多次
                System.out.println(!false);
                System.out.println(!true);



        }
}
