package 算法;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;

class TreeNode{
    int data;
    TreeNode leftChild;
    TreeNode rightChild;
    public TreeNode(int data) {
        this.data = data;
    }
}
public class 二叉树的遍历代码 {
    public static TreeNode createBinaryTree(LinkedList<Integer> inputList){ //新建二叉树
        TreeNode node = null;
        if(inputList == null || inputList.isEmpty()){
            return null;
        }
        Integer data = inputList.removeFirst();
        if(data != null){
            node = new TreeNode(data);
            node.leftChild = createBinaryTree(inputList);
            node.rightChild = createBinaryTree(inputList);
        }
        return node;
    }
    public static void preOrderTraveral(TreeNode node){
        if(node == null){
            return;
        }
        System.out.println(node.data);
        preOrderTraveral(node.leftChild);
        preOrderTraveral(node.rightChild);
    }
    public static void inOrderTraveral(TreeNode node){
        if(node == null){
            return;
        }
        inOrderTraveral(node.leftChild);
        System.out.println(node.data);
        inOrderTraveral(node.rightChild);
    }
    public static void postOrderTraveral(TreeNode node){
        if(node == null){
            return;
        }
        postOrderTraveral(node.leftChild);
        postOrderTraveral(node.rightChild);
        System.out.println(node.data);
    }
    public static void main(String[] args) {
        TreeNode binaryTree = createBinaryTree(
                new LinkedList<>(Arrays.asList(new Integer[]{3, 2, 9, null, null, 10, null, null, 8, null, 4}))
        );
//        preOrderTraveral(binaryTree);
//        inOrderTraveral(binaryTree);
//        postOrderTraveral(binaryTree);

    }
}
