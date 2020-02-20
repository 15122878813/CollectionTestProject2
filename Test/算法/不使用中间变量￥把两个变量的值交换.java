package 算法;

/*
不使用中间变量￥把两个变量的值交换
 */
public class 不使用中间变量￥把两个变量的值交换 {
    public static void main(String[] args) {
        Integer a = 2;
        Integer b = 3;
        swap(a, b);
    }

    private static void swap(Integer a, Integer b) {
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println(a);
        System.out.println(b);
    }
}
