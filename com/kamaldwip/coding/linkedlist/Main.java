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

        System.out.println("Employee Object in list : "+ empList.contains(emp3));

        Employee emp5 = new Employee("Kaushik","Talukdar","585176");

        System.out.println("Employee Object in list : "+empList.contains(emp5));

        empList.addToEnd(emp5);
        empList.printList();
        System.out.println(empList.getSize());

        empList.removeFromFront();
        empList.printList();
        System.out.println(empList.getSize());

        empList.removeFromEnd();
        empList.printList();
        System.out.println(empList.getSize());


        Employee emp6 = new Employee("Parth","Nikhra","585178");

        empList.addToBefore(emp6,emp2);
        empList.printList();
        System.out.println(empList.getSize());

        empList.addToBefore(new Employee("Prantar","Bora","567189"),emp3);
        empList.printList();
        System.out.println(empList.getSize());

        empList.addAfter(new Employee("Shaibal","Nandy Mazumdar","453276"),emp3);
        empList.printList();
        System.out.println(empList.getSize());


    }
}
