package DataType;

// 数据类型 - 整型测试 byte short int long
public class DataTypeTest03 {
    public static void main(String[] args) {
        // int a = 10;
        // System.out.println(a);
        // long b = 3223;
        // System.out.println(b);
        /**
         * 整数默认是 int 类型 如果想改为 long 类型在赋值时的后边增加 l/L
         * int是小容量
         * long 是大容量
         * 小容量可以自动转换成大容量
         */
        // long b1 = 3223123123L;
        // System.out.println(b1);

        byte b = 50;
        System.out.println(b);

        /**
         * 大容量不能直接赋值给小容量, 需要增加类型转换符,可能会损失精度,慎用.
         */
        // long x = 100L;
        // int y = (int) x;

        // long k = 2147483648L;
        // int e = (int) k;
        // System.out.println(e); // -2147483648 损失精度
    }
}
