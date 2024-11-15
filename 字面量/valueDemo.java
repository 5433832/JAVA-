public class valueDemo {
    public static void main(String[] args) {

        //整数
        System.out.println(666);

        //小数
        System.out.println(1.93);
        //字符串
        System.out.println("嘿嘿嘿");
        //字符
        System.out.println('男');
        //布尔
        System.out.println(true);
        System.out.println(false);
        //空
        //null不能直接打印，只能通过字符串打印
        System.out.println("null");
        //制表符
        System.out.println("name"+"age");//连接字符串会输出nameage
        System.out.println("tom"+"23");//tom23
        //使用制表符后
        System.out.println("name"+'\t'+"age");
        System.out.println("tom"+'\t'+'\t'+"23");
    }
}
