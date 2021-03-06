package com.bridgelabz;

import java.util.Scanner;

public class LinkedListMain {
    public static void main( String[] args )
    {
        System.out.println(" Welcome to DataStructure Program On LinkedList ");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 1 to add the data at the start");
        System.out.println("Enter 2 to add the data at the end");
        System.out.println("Enter 3 to add the data at In Between");
        System.out.println("Enter 4 to delete First Element");
        System.out.println("Enter 5 to delete last Element");
        System.out.println("Enter 6 to Search Node");
        System.out.println("Enter 7 to add data at specific Node");
        System.out.println("Enter 8 to delete data In Between");
        System.out.println("Enter 9 to Sort LinkedList");

        switch (scanner.nextInt()) {
            case 1:
                Operations.addDataAtStart();
                break;
            case 2:
                Operations.addDataAtEnd();
                break;
            case 3:
                Operations.insertInBetween();
                break;
            case 4:
                Operations.pop();
                break;
            case 5:
                Operations.deleteLastNode();
                break;
            case 6:
                Operations.searchNodeBaseOnValue();
                break;
            case 7:
                Operations.insertAtGivenNode();
                break;
            case 8:
                Operations.deleteInBetweenNode();
                break;
            case 9:
                Operations.sortNode();
        }
        }
        }
