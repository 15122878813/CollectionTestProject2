package 算法;

import java.util.Arrays;

class Node {
    public Integer data;  //数据
    public Node pre = null;
    public Node next = null;

    public Node(Integer data) {
        this.data = data;
    }
}

class MyLinkedList {
    private Node head = null;
    private Node tail = null;
    private Integer size = 0;

    public Boolean isEmpty() {
        return size == 0 ? true : false;
    }

    //当为true则视为空，则为false则视为非空
    public void insert(Node node, Integer index) throws Exception {
        if (isEmpty()) {
            head = node;
            tail = node;
        } else if (!isEmpty() && index < size) {  //当在链中插入
            //得进行查找
            Node nodeNew = get(index);
            Node nodeNewPre = get(index - 1);
//            System.out.println(nodeNew.data);
//            System.out.println(nodeNewPre.data);
            nodeNewPre.next = node;
            node.next = nodeNew;

            node.pre = nodeNewPre;
            nodeNew.pre = node;

        } else if (!isEmpty() && index >= size) { //当在链尾插入
            tail.next = node;
            node.pre = tail;
            tail = node;
        }
        size++;
    }

    public Node get(Integer index) throws Exception {
        if (isEmpty()) {
            return null;
        }
        if (index < 0 || index >= size) {
            throw new Exception("找寻的index超出了链表的长度");
        }
        Node node = head;
        if (index == 0) {
            return node;
        }
        while (index > 0) {
            node = node.next;
            index--;
        }
        return node;
    }

    public Integer[] output() {
        Integer[] nodes = new Integer[size];
        for (int i = 0; i < nodes.length; i++) {
            nodes[i] = getFirst();
        }
        return nodes;
    }

    public Integer getFirst() {
        if (isEmpty()) {
            return null;
        }
        Node node = head;
        head = head.next;
        size--;
        return node.data;
    }

    public void remove(Integer index) throws Exception { //栈帧
        if (isEmpty()) {
            return;
        }
        if (size == 1) {
            head = null;
            tail = null;
            size--;
            return;
        }
        Node node = get(index);
        if (node.pre == null) {
            //前面没有指针指向的node
            head = node.next;
        } else if (node.next == null) {
            tail = node.pre;
        } else {
            Node nodePre = get(index - 1); //1
            Node nodeNext = get(index + 1); //3

            nodePre.next = nodeNext;
            nodeNext.pre = nodePre;
        }
        size--;
    }
}

public class 手写双向链表 {
    public static void main(String[] args) throws Exception {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.insert(new Node(1), 0);
        myLinkedList.insert(new Node(2), 1);
        myLinkedList.insert(new Node(3), 2);
        myLinkedList.insert(new Node(4), 3);           //从尾部进行插入
//        myLinkedList.insert(new Node(4),1); //从中间进行插入
//        System.out.println(Arrays.toString(myLinkedList.output()));
//        System.out.println(myLinkedList.get(4).data);
        myLinkedList.remove(3);//位置
        System.out.println(Arrays.toString(myLinkedList.output()));
    }
}
