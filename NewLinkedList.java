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
    public void delete_head(){
        Node temp=head;
        temp = temp.next;
        head=temp;
            
    }
    public void delete_last(){
        Node temp=head;
        Node ptr=temp.next;
        while (ptr.next!=null) {
            temp=ptr;
            ptr=ptr.next;
        }
        temp.next=null;
    }
    public void delete_at(int d){
        Node temp=head;
        Node ptr=temp.next;
        for (int i = 0; i < d-1; i++) {
            temp=ptr;
            ptr=ptr.next;
        }
        temp.next=ptr.next;
    }

    public void insert_at(int position, int data) {
        Node newNode = new Node(data);
        if (position == 0) {
            newNode.next = head;
            head = newNode;
            return;
        }
        Node temp = head;
        for (int i = 0; i < position - 1; i++) {
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }
}

public class NewLinkedList { 
    public static void main(String[] args) {
        LinkedList nodedata = new LinkedList(); // Use capital 'L' here too
        nodedata.insert(2);
        nodedata.insert(5);
        nodedata.insert(1);
        nodedata.insert(4);
        nodedata.insert(3);
        nodedata.insert(5);
        nodedata.display();
       
        nodedata.delete_at(2);
        nodedata.display();
        nodedata.insert_at(3,34);
        nodedata.display();
    }
}
