package Operator;

public class IfTest {
    public static void main(String[] args) {
        // java.util.Scanner s = new java.util.Scanner((System.in));
        // System.out.print("请输入第一个数字:");
        // int firstNumber = s.nextInt();
        // System.out.print("请输入运算符:");
        // String str = s.next();
        // System.out.print("请输入第二个数字:");
        // int secondNumber = s.nextInt();
        // switch (str) {
        // case "+":
        // System.out.println(firstNumber + secondNumber);
        // break;
        // default:
        // System.out.println("无效内容");
        // }

        // int a = 5;
        // while (a > 1) {
        // System.out.println(a);
        // a--;
        // }

        int a = 5;
        do {
            a--;
            if (a == 3) {
                continue;
            }
            System.out.println(a);
        } while (a > 1);

        // for (int i = 0; i < 10; i++) {
        // if (i == 5)
        // continue;
        // System.out.println(i);
        // }
    }
}
