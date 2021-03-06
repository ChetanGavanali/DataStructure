package com.bridgelabz;

public class Operations {
    public static LinkedList addDataAtStart() {

        LinkedList linkedList = new LinkedList();

        linkedList.push(70);
        linkedList.push(30);
        linkedList.push(56);

        linkedList.print();

        return linkedList;
    }

    public static void addDataAtEnd() {
        LinkedList linkedList = new LinkedList();
        linkedList.append(56);
        linkedList.append(30);
        linkedList.append(70);
        linkedList.print();
    }

    public static void insertInBetween() {
        LinkedList linkedList = new LinkedList();
        Node secondNode = linkedList.push(70);
        Node firstNode = linkedList.push(56);
        Node newNode = new Node(30);
        System.out.println("Before");
        linkedList.print();
        linkedList.insertInBetween(firstNode, newNode);
        System.out.println();
        System.out.println("After");
        linkedList.print();
    }

    public static void pop() {
        LinkedList linkedList = new LinkedList();
        Node firstNode = linkedList.push(70);
        Node secondNode = linkedList.push(30);
        Node newNode = linkedList.push(56);
        System.out.println("Before");
        linkedList.print();
        linkedList.pop();
        System.out.println();
        System.out.println("After");
        linkedList.print();
    }

    public static void deleteLastNode() {
        System.out.println("before");
        LinkedList linkedList = addDataAtStart();
        linkedList.popLast();
        System.out.println("After");
        linkedList.print();
    }

    public static void searchNodeBaseOnValue() {
        LinkedList linkedList = addDataAtStart();
        linkedList.searchNode(30);
    }

    public static void insertAtGivenNode() {
        System.out.println("Before Insertion");
        LinkedList linkedList = addDataAtStart();
        Node newNode = new Node(40);
        Node previousNode = linkedList.insertAfter(30, newNode);
        System.out.println("After Insertion");
        linkedList.print();
    }
    public static void deleteInBetweenNode() {
        LinkedList linkedList = new LinkedList();
        linkedList.push(70);
        linkedList.push(40);
        linkedList.push(30);
        linkedList.push(56);
        System.out.println("Before deleting");
        linkedList.print();
        linkedList.deleteNode(40);
        System.out.println("After deleting");
        linkedList.print();
}public static void sortNode() {
        LinkedList linkedList = new LinkedList();
        linkedList.push(70);
        linkedList.push(40);
        linkedList.push(30);
        linkedList.push(56);
        System.out.println("Before");
        linkedList.print();
        linkedList.sort();
        System.out.println("After");
        linkedList.print();
    }
}
