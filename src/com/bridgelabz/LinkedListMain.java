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
            case 4 :
                Operations.pop();
                break;
        }
        }
        }
