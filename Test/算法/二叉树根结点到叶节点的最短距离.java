package 算法;

import javax.swing.tree.TreeNode;

import java.util.Date;
import java.util.LinkedList;
import java.util.Queue;

//enum a{
//    Spring("a"),
//    Summer,
//    winder;
//
//    a(String a) {
//    }
//
//    a() {
//
//    }
//}
//杩愮敤闈為�掑綊鐨勬柟寮�
public class 二叉树根结点到叶节点的最短距离 {

    public static void main(String[] args) {
//        double a = 3.14e-2;
//        System.out.println(a);

    }

    public int run(TreeNode root) {

        Queue<TreeNode> queue = new LinkedList<>();

        if (root == null) {

            return 0;
        }

        queue.add(root);

        int deptth = 1;

        while (!queue.isEmpty()) {

            int len = queue.size();

            while (len > 0) {

                TreeNode tree = queue.poll();

                if (tree.getChildAt(0) == null && tree.getChildAt(1) == null) {

                    return deptth;
                }
                if (tree.getChildAt(0) != null) {

                    queue.add(tree.getChildAt(0));
                }
                if (tree.getChildAt(1) != null) {

                    queue.add(tree.getChildAt(1));
                }
                len--;
            }
            deptth++;
        }
        return deptth;
    }
}
