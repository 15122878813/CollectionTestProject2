package 算法;

/*
题目：求s=a+aa+aaa+aaaa+aa…a的值，其中a是一个数字。例如2+22+222+2222+22222(此时共有5个数相加)，几个数相加有键盘控制。
 */
public class a_aa_aaa_aaaa_aaaaa {
    public static void main(String[] args) {
        Integer result = f(2, 3);
//                           a n
        System.out.println(result);
    }

    private static Integer f(int a, int n) {
        //对于n进行遍历
        Integer sum = 0;
        while (n > 0) {
            Integer s = n;
            //对每个位置进行连接
            String number = "";
            while (s-- > 0) {
                number += a;
            }
            sum += Integer.parseInt(number);
            n--;
        }
        return sum;
    }
}
