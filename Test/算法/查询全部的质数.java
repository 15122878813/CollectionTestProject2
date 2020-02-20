package 算法;

import java.util.LinkedList;

public class 查询全部的质数 {
    public static void main(String[] args) {
        LinkedList<Integer> list = f(22);
        System.out.println(list);
    }

    private static LinkedList<Integer> f(int n) {
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 1; i <= n; i++) {  //从1到21都进行寻找
            if (i == 2 || i == 3) {
                list.add(i);
                continue;
            }
            int sqrt = (int) Math.sqrt(i);
            boolean flag = false;
            for (int j = 2; j <= sqrt; j++) { //判断每个数字是不是质数
                if (i % j == 0) {
                    flag = true;
                }
            }
            if (!flag) {
                list.add(i);
            }
        }
        return list;
    }
}
