package com.rank.thirtydayofcode.daytwentythree;

import java.util.Scanner;

class Node{
    Node left, right;
    int data;
    Node(int data){
        this.data = data;
        left = right = null;
    }
}

public class BSTSearchTree {
    public static int getHeight(Node root){
        int height = 0;

        if ((root==null)||(root.right==null&&root.left==null)){
            height = 0;
        }else if ((root.left!=null)||(root.right!=null)){
            height = 1 + (getHeight(root.left)>getHeight(root.right) ? getHeight(root.left) : getHeight(root.right));
        }



        return height;
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
        }
        return root;
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt();
        Node root = null;
        while (T-->0){
            int data = scanner.nextInt();
            root = insert(root, data);
        }

        int height = getHeight(root);
        System.out.println(height);
    }
}
