/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project1;
/**
 * 
 * @author Tuyet Ngo
 */
import java.util.Scanner;

public class Project1 
{
    public static void main(String[] args) 
    {
        CircularDoublyLinkedList cdll = new CircularDoublyLinkedList();
        
        /*int choice = 0;
        int n, o;
        System.out.println("+----Circular Doubly Linked List---+");
        System.out.println("|                ***               |");
        System.out.println("|    1-Insert before current.      |");
        System.out.println("|    2-Insert after current.       |");
        System.out.println("|    3-Search.                     |");
        System.out.println("|    4-Update.                     |");
        System.out.println("|    5-Delete.                     |");
        System.out.println("|    6-Print size.                 |");
        System.out.println("|    7-Print current.              |");
        System.out.println("|    8-Print forward.              |");
        System.out.println("|    9-Print reverse.              |");
        System.out.println("|    0-Exit;                       |");
        System.out.println("+----------------------------------+");
        
        while ( choice <= 9)
        {   
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            
            switch(choice)
            {
                case 1:
                    System.out.print("Enter the number you want to insert: ");
                    n = scanner.nextInt();
                    cdll.insertBeforeCurrent(n);
                    break;
                case 2:
                    System.out.print("Enter the number you want to insert: ");
                    n = scanner.nextInt();
                    cdll.insertAfterCurrent(n);
                    break;
                case 3:
                    System.out.print("Enter the number you want to search: ");
                    n = scanner.nextInt();
                    cdll.search(n);
                    break;
                case 4:
                    System.out.print("Enter the number you want to update: ");
                    o = scanner.nextInt();
                    n = scanner.nextInt();
                    cdll.update(o, n);
                    break;
                case 5:
                    System.out.print("Enter the number you want to delete: ");
                    n = scanner.nextInt();
                    cdll.delete(n);
                    break;
                case 6:
                    cdll.printSize();
                    break; 
                case 7:
                    cdll.printCurrent();
                    break;  
                case 8:
                    cdll.printForward();
                    System.out.println();
                    break;  
                case 9:
                    cdll.printReverse();
                    System.out.println();
                    break;         
                case 0 :
                    return;
                default: 
                    System.out.println("Please enter a valid choise.");
            }
        }
        */
        /* TEST 1:
        cdll.insertBeforeCurrent(5);
        cdll.insertBeforeCurrent(3);
        cdll.insertBeforeCurrent(4);
        
        cdll.printCurrent();
        cdll.printForward();
        cdll.printReverse();
        cdll.printSize();
 
        cdll.search(5);
        cdll.printForward();
        cdll.printReverse();
        cdll.search(10);
        cdll.printForward();
        cdll.printReverse();
        
        
        cdll.update(4, 6);
        cdll.printForward();
        cdll.printCurrent();        
        cdll.printReverse();
        
        cdll.update(10, 5);
        cdll.printForward();
        cdll.printCurrent();        
        cdll.printReverse();
        
        cdll.insertAfterCurrent(10);
        cdll.insertAfterCurrent(20);
        cdll.printForward();
        cdll.printReverse();  
        
        cdll.delete(6);
        cdll.printCurrent();
        cdll.printForward();
        cdll.printReverse();  
        
        cdll.delete(2);
        cdll.printCurrent();
        cdll.printForward();
        cdll.printReverse();
   
        */
        
        
        /*cdll.search(5);
        cdll.update(7, 10);
        cdll.delete(6);
        cdll.printCurrent();
        cdll.printForward();
        cdll.printReverse();
        cdll.printSize();
        
        cdll.insertAfterCurrent(5);
        cdll.update(5, 6);
        cdll.delete(5);
        cdll.delete(6);
        cdll.search(6);
        */
        
                cdll.insertBeforeCurrent(7);
        cdll.insertBeforeCurrent(5);
        cdll.insertBeforeCurrent(2);
        cdll.insertBeforeCurrent(5);
        cdll.insertBeforeCurrent(5);
        cdll.insertBeforeCurrent(8);
        cdll.insertBeforeCurrent(1);
        cdll.insertBeforeCurrent(3);
        cdll.insertBeforeCurrent(5);
        cdll.insertBeforeCurrent(4);
        cdll.printForward();
        cdll.removeDuplicates(5);
        cdll.printForward();

    } //end of main
    
} //end of public class
