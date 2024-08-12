class Node {

    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
class LinkedList { 
    Node head;

    public void insert(int data) {
        Node New = new Node(data);
        if (head == null) {
            head = New;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = New;
        }
    }
    public void display() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + "->");
                temp = temp.next;
            }
            System.out.print("Null");
            System.out.println();
        }   
   
        public void reverse() {
            Node prev = null;       // Previous node, initially null
            Node current = head;    // Current node, starting at head
            Node next = null;       // Next node, will be updated in each iteration
            
            while (current != null) {
                next = current.next; // Store the next node
                current.next = prev; // Reverse the link
                prev = current;      // Move prev to current
                current = next;      // Move current to next
            }
            
            head = prev; // Update head to the new front of the list
        }
    }


    public class Linkedlist3 { 
        public static void main(String[] args) {
            LinkedList nodedata = new LinkedList(); 
            nodedata.insert(2);
            nodedata.insert(5);
            nodedata.insert(1);
            nodedata.insert(4);
            nodedata.insert(3);
            nodedata.insert(5);
            nodedata.display();
    
            nodedata.reverse();
            nodedata.display();
        }
    }
