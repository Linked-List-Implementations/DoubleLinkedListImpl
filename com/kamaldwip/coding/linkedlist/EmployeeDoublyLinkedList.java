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

    public boolean contains(Employee employee){
        EmployeeNode current = head ;
        while (current != null){
            if(current.getEmployee().equals(employee)){
                return true;
            }
            current = current.getNext();
        }
        return false;
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

    public boolean addToBefore (Employee newEmployee, Employee existingEmployee){

        if(isEmpty()){
            return false;
        }
        EmployeeNode newNode = new EmployeeNode(newEmployee);

        EmployeeNode current = head;

        while(current != null){

            if(current.getEmployee().equals(existingEmployee)){
                if(current == head){
                    addToFront(newEmployee);
                } else {
                    newNode.setPrevious(current.getPrevious());
                    newNode.setNext(current);
                    current.setPrevious(newNode);
                    newNode.getPrevious().setNext(newNode);
                    size++;
                }

                return true;
            }
            current = current.getNext();
        }

        return false;
    }


    public boolean addAfter(Employee newEmployee, Employee existingEmployee){

        if(isEmpty()){
            return false;
        }

        EmployeeNode newNode = new EmployeeNode(newEmployee);

        EmployeeNode current = head;

        while(current != null){
            if(current.getEmployee().equals(existingEmployee)){
                if(current == tail){
                    addToEnd(newEmployee);
                } else {
                    newNode.setNext(current.getNext());
                    newNode.setPrevious(current);
                    current.setNext(newNode);
                    newNode.getNext().setPrevious(newNode);
                    size++;
                }
                return true;
            }
            current = current.getNext();
        }

        return false;
    }



}
