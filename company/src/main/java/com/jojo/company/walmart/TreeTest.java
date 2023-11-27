package com.jojo.company.walmart;

public class TreeTest {

    //Count all k-sum paths in a Binary Tree
    /**
     *          1
     *     3       -1
     *   2   1    4     5
     *     1    1   2     6
     *
     *
     *     k = 5 {1, 3, 1} {3, 2} {3, 1, 1} {4,1} {1, -1, 4, 1} {-1, 4, 2} {5} {1, -1, 5}
     *
     *     output: 8
     */

    public static void main(String[] args) {
        Node a1 = new Node(1);
        Node a2 = new Node(3);
        Node a3 = new Node(-1);
        Node a4 = new Node(2);
        Node a5 = new Node(1);
        Node a6 = new Node(4);
        Node a7 = new Node(5);
        Node a8 = new Node(1);
        Node a9 = new Node(1);
        Node a10 = new Node(2);
        Node a11 = new Node(6);

        /*a1.left = a2;
        a1.right = a3;
        a2.left = a4;
        a2.right = a5;
        a3.left = a6;
        a3.right = a7;
        a5.left = a8;
        a6.left = a9;
        a6.right = a10;
        a7.right = a11;
*/


    a1.right = a2;
    a2.right = a3;





    }


    static Node reverse(Node node)  {

        // 1-> 3 -> -1

        // -1 -> 3 -> 1
        Node temp = node;
        while(node != null) {
            node.right = temp;
        }



        return null;
    }
    static int countKSum(Node node, int sum)    {

        if(node == null)
            return 0;

        int totalCount = countSum(node, sum) + countSum(node.left, sum) + countSum(node.right, sum);

        return totalCount;
    }

    static int countSum(Node node, int sum) {
        if(node == null)
            return 0;

        int count  = 0;
        if(node.value == sum)
            count++;

        count = count + countKSum(node.left, sum - node.value);
        count = count + countKSum(node.right, sum - node.value);

        return count;
    }
}

class Node{

    int value;
    Node left;
    Node right;

    public Node(int value)  {
        this.value = value;
    }
}
