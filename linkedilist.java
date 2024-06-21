class linkedlist{
    class Node{
        String data;
        Node next;
        Node(String data){
            this.data=data;
            this.next=null;
        }
    }


    public Node head;
    public linkedlist(){
        this.head=null;
    }
    // Add a node at the beginning of the list
    public void addFirst(String data) {
        Node newNode = new Node(data); // Create a new node
        newNode.next = head; // Link the new node to the current head
        head = newNode; // Update the head to the new node
    }

    // Print the elements of the list
    public void printList() {
        Node current = head;
        while (current != null) { // Traverse through the list
            System.out.print(current.data + " -> ");
            current = current.next; // Move to the next node
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        linkedlist list = new linkedlist();

        list.addFirst("A");
        list.addFirst("B");


        list.printList(); // Output: B -> A -> C -> D -> null
    }}

