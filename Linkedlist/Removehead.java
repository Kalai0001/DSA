class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}
public class Removehead {
    public static void main(String[] args) {
        
        Node head = new Node(10);

        Node current = head;

        for(int i = 20 ; i <= 50; i += 10){
            current.next = new Node(i);
            current = current.next;
        }

        head = head.next;

        current = head;

        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }
}
