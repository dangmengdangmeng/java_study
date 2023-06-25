package Operator;

/**
 * 逻辑运算符
 * & 与
 * | 或
 * ! 非
 * ^ 异或 两边算子不一样返回 true
 * 
 * && 短路与
 * || 短路或
 * 
 */
public class OperatorTest01 {
    public static void main(String[] args) {
        int a = 5;
        int b = 6;
        System.out.println(a > b & ++a <= b);
        System.out.println(a);
    }
}
