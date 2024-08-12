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
        Node neew = new Node(data);
        if (head == null) {
            head = neew;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = neew;
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
    public void length(){
        Node temp=head;
        int count=0;
        while (temp != null) {
            
            count++;
            temp = temp.next;
        }
        System.out.println(count);
    }
    public int find(int data) {
        Node temp = head;
        int count = 0;   
        while (temp != null) {
            if (temp.data == data) {
                return count; 
            }
            temp = temp.next; 
            count++; 
        }
        return -1; 
    }
    
    
    }


    public class linkedlist2 { 
        public static void main(String[] args) {
            LinkedList nodedata = new LinkedList(); 
            nodedata.insert(2);
            nodedata.insert(5);
            nodedata.insert(1);
            nodedata.insert(4);
            nodedata.insert(3);
            nodedata.insert(5);
            nodedata.display();
            System.out.print("Length of the Linked list is ");
            nodedata.length();
           int d= nodedata.find(4);
           System.out.println("the element is at "+d);
        }
    }
