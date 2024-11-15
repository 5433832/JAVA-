public class VariableDemo {
        public static void main(String[] args) {
                //定义变量
                //数据类型 变量名=数据值
                //数据类型：限定变量能存储数据的类型
                //int（整数） double（小数）
                //变量名：存储空间的名字
                //等号：把右边的数据赋值给左边的变量
                int a=10;
                System.out.println(a);

                //使用方式和注意事项
                //定义变量和输出变量
                int b=10;
                System.out.println(b);//10
                System.out.println(b);//10
                //参与计算
                int c=10;
                int d=10;
                System.out.println(c+d);//20
                //修改变量的值
                System.out.println(c);//10
                c=20;
                System.out.println(c);//20

                //注意事项
                //在一条语句中，可以定义多个变量
                int e=100,f=200,g=300;
                System.out.println(e);
                System.out.println("----------------");
                System.out.println(f);
                System.out.println("----------------");
                System.out.println(g);
                //变量在使用之前必须要赋值
                int h;
                System.out.println(h);//未赋值变量会报错
                int i=500;
                System.out.println(i);

        }
}
