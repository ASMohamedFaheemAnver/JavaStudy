package com.company;

public class LinkedStack {
    class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public Node head = null;
    public Node tail = null;

    public void addNode(int data){
        Node newNode = new Node(data);

        if(head==null){
            head = newNode;
            tail = newNode;
        }else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void display(){
        Node current = head;

        if(head.equals(null)){
            System.out.println("List is empty!");
        }else {
            while (current!=null){
                System.out.println(current.data + " ");
                current = current.next;
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        LinkedStack sList = new LinkedStack();
        sList.addNode(1);
        sList.addNode(2);
        sList.addNode(6);

        sList.display();
    }
}
