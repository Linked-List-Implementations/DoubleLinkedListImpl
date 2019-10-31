package com.kamaldwip.coding.linkedlist;

public class Main {

    public static void main(String[] args) {
        Employee emp1 = new Employee("Kamaldwip","Choudhury","585199");
        Employee emp2 = new Employee("Abhinav","Borgohain","585162");
        Employee emp3 = new Employee("Prateek","Sahu","585196");
        Employee emp4 = new Employee("Raktim","Rajkhowa","585192");

        EmployeeDoublyLinkedList empList = new EmployeeDoublyLinkedList();

        empList.addToFront(emp1);
        empList.addToFront(emp2);
        empList.addToFront(emp3);
        empList.addToFront(emp4);

        empList.printList();
        System.out.println(empList.getSize());

        Employee emp5 = new Employee("Kaushik","Talukdar","585176");

        empList.addToEnd(emp5);
        empList.printList();
        System.out.println(empList.getSize());

        empList.removeFromFront();
        empList.printList();
        System.out.println(empList.getSize());

        empList.removeFromEnd();
        empList.printList();
        System.out.println(empList.getSize());

    }
}
