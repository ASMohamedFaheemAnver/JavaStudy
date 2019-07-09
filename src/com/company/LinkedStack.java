package com.company;

public class LinkedStack{
    class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            next = null;
        }
    }

    Node head = null;
    Node tail = null;

    void addNode(int data){
        Node newNode = new Node(data);
        if (head == null){
            head = newNode;
            tail = newNode;
        }else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    void displayList(){
        Node currentNode = head;
        if(head.equals(null)){
            System.out.println("List is empty dude!");
        }else {
            while (currentNode!=null){
                System.out.println(currentNode.data + " ");
                currentNode = currentNode.next;
            }
        }
    }

    public static void main(String[] args){
        LinkedStack newList = new LinkedStack();
        newList.addNode(1);
        newList.addNode(2);
        newList.addNode(3);

        newList.displayList();
    }
}