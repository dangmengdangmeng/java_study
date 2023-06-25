package Operator;

public class MethodTest {
    public static void main(String[] args) {
        sumInt(1, 2);
        System.out.println('1');
    }

    public static void sumInt(int a, int b) {
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                return;
            }
        }
        System.out.println("asd");
        // return a + b;
    }
}
