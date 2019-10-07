package com.rank.thirtydayofcode.daytwentyfour;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Node{
    Node left, right;
    int data;

    Node(int data){
        this.data = data;
        left = right = null;
    }
}

public class BSTLevelOrderTraversal {
    static void levelOrder(Node root){
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty()){
            Node removedNode = queue.poll();
            System.out.print(removedNode.data+" ");

            if(removedNode.left != null)
                queue.add(removedNode.left);
            if(removedNode.right != null)
                queue.add(removedNode.right);
        }

    }

    public static Node insert(Node root, int data){
        if (root==null){
            return new Node(data);
        }else {
            Node cur;
            if (data<=root.data){
                cur = insert(root.left, data);
                root.left = cur;
            }else {
                cur = insert(root.right, data);
                root.right = cur;
            }

            return root;
        }
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();

        Node root = null;

        while (T-->0){
            int data = scanner.nextInt();
            root = insert(root, data);
        }
        levelOrder(root);
    }
}
