package DataType;

/**
 * 数据类型之间互相转换
 * 除布尔外都可以互相转换
 * 小容量向大容量转换,称之为自动类型转换,容量从小到大排序:byte<short<int<long<float<double
 * char 和 short 同级,但 char 可以取更大的整数
 * 浮点类型比整数型大
 * 大容量转小容量,需要强制类型转换,但运行时可能会存在精度问题
 * 整数型字面值没有超过对应类型的范围,可以直接赋值
 * byte,short,char 在做类型转换时,会先转换为 int 再做运算
 * 多种类型混合运算时,会先转换为容量最大的再做运算
 */
public class DataTypeTest06 {
    public static void main(String[] args) {

    }
}
