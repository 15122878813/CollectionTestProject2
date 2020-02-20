package algorithm;

public class 使用尾递归 {
    public static void main(String[] args) {
        int n = 26;
        int index = 1;
        Long t1 = System.currentTimeMillis();
        Integer result = f(n, index);
        Long t2 = System.currentTimeMillis();
        System.out.println(result);
        System.out.println("使用尾递归的结果为:"+(t2-t1));

        Long t3 = System.currentTimeMillis();
        Integer result2 = f2(n);
        Long t4 = System.currentTimeMillis();
        System.out.println(result2);
        System.out.println("使用普" +
                "通递归的结果为:"+(t4-t3));
    }

    private static Integer f2(int n) {
        if(n == 1){return 1;}
        return n * f2(n-1);
    }

    private static Integer f(int n, int result) {
        if(n == 1){
            return result;
        }

        return f(n-1,n * result);
    }
}
