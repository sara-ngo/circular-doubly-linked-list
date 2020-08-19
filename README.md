# circular-doubly-linked-list
The following project is a Cirular Doubly Linked List (CDLL) data structure which was modified from a Node structure. The codes are in Java.

The Node structure is defined as follows:
public class Node
{
	public int data;
	public Node next;
	public Node previous;
}

In this CDLL, each node has a reference to a next and previous Node. When new Node elements are added to the CDLL, the structure looks like a standard linked list with the last node’s next pointer pointing to the first. In this way, no “next” pointers of every Node in the CDLL are ever pointing to null. Since this is also a doubly linked list, the “previous” pointers of each Node are pointing to the Node behind it in the CDLL. Also, since this is a CDLL, the first Node’s previous pointer should also be pointing to the last Node and no “previous” pointers of every Node are ever pointing to null.

# function
CircularDoublyLinkedList()
insertBeforeCurrent(int n)
insertAfterCurrent(int n)
search(int n)
update(int o, int n)
delete(int n)
print functions
-	Size
-	Current
-	Forward
-	Reverse

#scenarios:
1. Empty List
2. Lists with only 1 Node
3. Lists with more than 1 Node
