public class LinkedList {
    Node head;
    public LinkedList(){
        this.head = null;
    }
//    insert a node at a specific position
    public void insertAtPos(int data, int pos){
        Node node = new Node(data);
//        if inserting at the head(position 1)
        if(pos == 1) {
            node.next = head;
            head = node;
            return;
        }
//        Traverse to the position before where the new node will be inserted
        Node current = head;
        Node prev = null;
        int count = 1;
        while (current != null && count < pos){
            prev = current;
            current = current.next;
            count += 1;
        }
//        if position is beyond the length of the list
        if (count < pos){
            throw new IndexOutOfBoundsException("position not found.");
        }
        node.next = current;
        assert prev != null;
        prev.next = node;

    }
//    displaying nodes in the LinkedList
    public void printList(){
        Node current = head;
        while(current != null){
            System.out.print( current.data + " -> ");
            current = current.next;
        }
        System.out.println("None");
    }
    public void deleteAtPosition( int pos){
//        if the linkedList is empty or the position is invalid
        if (head == null || pos <= 0){
            throw new IndexOutOfBoundsException("position doesn't exist.");
        }
//        if deleting the head (position 1)
        if (pos == 1){
            head = head.next;
            return;
        }
//        Traverse to the position before the one to be deleted

        Node current = head;
        Node prev = null;
        int count = 1;
        while(count < pos && current != null){
            prev = current;
            current = current.next;
            count += 1;
        }
//        if position is beyond the length of the list
        if(current == null){
            throw new IndexOutOfBoundsException("position not found");
        }
//        delete the node at the specified position
        prev.next = current.next;
    }
    public void deleteAfterNode(Node node) {
//      if the given node is null or the next node is null
        if(node == null || node.next == null){
            return;
        }
//        the node to be deleted is the node next to the given node
        Node nodeToBeDeleted = node.next;
//        change the next of the given node to the next of the nodeToBeDeleted
        node.next = nodeToBeDeleted.next;

    }
//    method to search a node with a given value
    public void searchNode(int data){

        Node current = head;
        int count = 1;
        while(current != null){
           if (current.data == data){
               System.out.println("The node exists at position " + count);
               break;
           }
           current = current.next;
           count += 1;

        }
        if (current == null){
            System.out.println("the node doesn't exist.");
        }

    }

    public static void main(String[] args) {
    LinkedList list = new LinkedList();
    list.insertAtPos(20, 1);
    list.insertAtPos(30, 2);
    list.insertAtPos(40, 3);
    list.insertAtPos(50, 4);
    list.insertAtPos(60, 5 );
    list.deleteAtPosition(2);
    list.printList();
    Node thirdNode = list.head.next.next;
    list.deleteAfterNode(thirdNode);
    list.searchNode(60);




    }

}
