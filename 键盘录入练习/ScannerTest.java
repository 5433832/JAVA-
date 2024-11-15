//导包
import java.util.Scanner;
public class ScannerTest {
        public static void main(String[] args) {
                //创建对象
                Scanner sc = new Scanner(System.in);

                System.out.println("请输入第一个数字");
                int n = sc.nextInt();
                System.out.println("请输入第二个数字");
                int m = sc.nextInt();
                System.out.println("他们的和为："+(m+n));
        }
}
