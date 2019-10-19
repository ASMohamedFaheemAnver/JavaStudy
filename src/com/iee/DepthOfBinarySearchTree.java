package com.iee;

import java.util.Scanner;

class Node{
    int data;
    Node left;
    Node right;

    Node(int data){
        this.data = data;
        left = right = null;
    }
}

public class DepthOfBinarySearchTree {
    private static int[] heights;
    private static int index = 0;

    public static Node insert(Node root, int data){
        if (root==null){
            heights[index] = 1;
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
            heights[index] += 1;
        }
        return root;
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt();
        heights = new int[T];

        Node root = null;
        while (T-->0){
            int data = scanner.nextInt();
            root = insert(root, data);
            index++;
        }

        for (int height : heights){
            System.out.print(height + " ");
        }
    }
}
