package 算法;

import javax.swing.tree.TreeNode;
import javax.xml.soap.Node;

/*
题目：求1+2!+3!+…+20!的和
 */
public class 求阶乘的和_不使用递归 {
    public static void main(String[] args) {
        Integer result = getResult(3);
        System.out.println(result);
    }

    private static Integer getResult(Integer n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            int data = 1;

            for (int j = 1; j <= i; j++) {
                data *= j;
            }
            sum += data;
        }
        return sum;
    }
}
