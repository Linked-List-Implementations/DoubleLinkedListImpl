package com.kamaldwip.coding.linkedlist;

public class EmployeeDoublyLinkedList {

    private EmployeeNode head;
    private EmployeeNode tail;
    private int size;

    public int getSize() {
        return size;
    }

    public void addToFront(Employee employee){
        EmployeeNode node = new EmployeeNode(employee);
        if(head == null){
            tail = node;
        }
        else {
            node.setNext(head);
            head.setPrevious(node);
        }
        head = node;
        size++;
    }

    public void addToEnd(Employee employee){
        EmployeeNode node = new EmployeeNode(employee);
        if(tail == null){
            head = node;
        }
        else {
            node.setPrevious(tail);
            tail.setNext(node);
        }
        tail = node;
        size ++;
    }

    public void printList(){
        EmployeeNode current = head;
        System.out.print(" HEAD --> ");
        while(current!=null){
            System.out.print(current);
            current = current.getNext();
            System.out.print(" <--> ");
        }
        System.out.println(" null ");

    }

    public boolean isEmpty(){
        return head == null;
    }

    public EmployeeNode removeFromFront(){
        EmployeeNode removedNode = head;
        if(isEmpty()){
            return null;
        }
        if(head.getNext() == null){
            tail = null;
        }
        else {
           head.getNext().setPrevious(head.getPrevious());
        }
        head = head.getNext();
        size--;
        removedNode.setNext(null);
        return removedNode;

    }

    public EmployeeNode removeFromEnd(){
        EmployeeNode removedNode = tail;
        if(isEmpty()){
            return null;
        }
        if(tail.getPrevious() == null){
            head = null;
        }
        else {
            tail.getPrevious().setNext(tail.getNext());
        }
        tail = tail.getPrevious();
        size--;
        removedNode.setPrevious(null);
        return removedNode;
    }

}
