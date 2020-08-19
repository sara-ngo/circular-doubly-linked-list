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
public class CircularDoublyLinkedList {

    public int currentSize;
    public Node current;
    
    //constructor
    public CircularDoublyLinkedList()
    {
        this.currentSize = 0;
        this.current = null;
    }
    
    public void insertBeforeCurrent(int n) 
    {  
       System.out.println("Inserting " + n + " before current.");
       Node newNode = new Node(n);
      
       if (currentSize == 0) //if the list is empty
       {   
           current = newNode;
           newNode.next = newNode;
           newNode.prev = newNode;
           this.current = newNode;
       }
       else
       {
           newNode.next = current;
           current.prev.next = newNode;
           newNode.prev = current.prev;
           current.prev = newNode;

           current = newNode;
       }
       currentSize++;
    }
    
    public void insertAfterCurrent(int n) 
    {
       System.out.println("Inserting " + n + " after current.");
       Node newNode = new Node(n);
       
       if(currentSize == 0)
       {
            current = newNode;
            newNode.next = newNode;
            newNode.prev = newNode;          
            this.current = newNode;
       } 
       else 
       {          
            newNode.next = current.next;
            current.next.prev = newNode;
            newNode.prev = current;
            current.next = newNode;
            
            current = newNode;
       }
       currentSize++;
    }
    
    public Node search(int n) 
    {
        System.out.println("Search: " + n);
        
        if(currentSize == 0)
        {
            System.out.println("Empty list.");
        }
        else 
        {
            Node temp = current;
            do //loops until reach that data
            {
                if(temp.n == n) //found
                {
                    System.out.println(n + " was found.");
                    return current = temp;
                }
                temp = temp.next; //move to the next data
            } while (temp != current);
        }
        System.out.println(n + " was not found.");
        return null;
    }
    
    public boolean update(int o, int n) 
    {   
        System.out.println("Update: " + o + " " + n);
        
        if(currentSize == 0)
        {
            System.out.println("Empty list.");
        }
        else
        {
            Node temp = current;
            do //loops to reach that data (int o)
            {
                if(temp.n == o) 
                {
                    temp.n = n; //replace int o by int n
                    System.out.println("Updating successful.");
                    current = temp; //set it be current
                    return true;
                }
                temp = temp.next; //if not found, move to next data          
            } while (temp != current);
        }
        System.out.println("Updating fail.");
        return false;
    }
    
    public boolean delete(int n)
    {
        System.out.println("Deleting " + n);
        
        if (currentSize == 0)
        {
            System.out.println("Empty List.");
        }
        else
        {
            Node temp = current;
            do
            {
                if(temp.n == n) //if int n is found
                {
                    if(currentSize == 1)
                    {
                        temp = null;
                        currentSize--;
                        System.out.println("Deleting succesful.");
                        return true;
                    }
                    else
                    {
                        temp.prev.next = temp.next;
                        temp.next.prev = temp.prev;
                        currentSize--;
                        System.out.println("Deleting succesful.");
                        current = temp.next;
                        return true;
                    }
                }
                temp = temp.next;
            } while (temp != current);
        }
        System.out.println("Deleting failed.");
        return false;
    }
    
    public void printSize() 
    {
        System.out.println("Current size: " + currentSize);
    }
    
    public void printCurrent() 
    {
        System.out.print("This current: "); 
        
        Node temp = current;
        if (currentSize <= 0)
        {
            System.out.println("Empty list.");         
        }
        else 
        {
          System.out.println(current.n);
        }
    }
        
    public void printForward()
    {
        System.out.print("Print Forward: ");
        
        Node temp = current;
        if ( currentSize <= 0)
        {
            System.out.print("Empty list.");
        }
        else
        {
            do
            {
                System.out.print(temp.n + " ");
                temp = temp.next;
            } while (temp != this.current);
        }
        System.out.println();
    }
    
    public void printReverse() 
    {
        System.out.print("Print Reverse: ");
        
        Node temp = this.current;
        if ( currentSize <= 0)
        {
            System.out.print("Empty list.");
        }
        else
        {
            do
            {
                System.out.print(temp.n + " ");
                temp = temp.prev;
            } while (temp.prev != this.current.prev);
        }
        System.out.println();
    }
    
    public void removeDuplicates(int value)
{
	int amount = 0;

	for(int c=0; c < currentSize; c++)
	{
		if (current.n == value)
		{
			Node nextNode = current.next;
			current.prev.next = current.next;
			current.next.prev = current.prev;
			amount++;
			current = null;
			current = nextNode;
		}
		current = current.prev;
	}
currentSize -= amount;
}


}

