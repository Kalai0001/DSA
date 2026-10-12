import java.util.*;
class Node{
    int data;
    Node next;
    
    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}
public class Insert {
    static Node insert(Node head,Node val){
        val.next = head;
        head = val;

        return head;
    }
    public static void main(String[] args) {
        // Node head = new Node(10);
        // head.next = new Node(20);
        // head.next.next = new Node(30);
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of nodes : ");
        int n = sc.nextInt();

        Node head = null;
        Node tail = null;

        for(int i = 0; i < n; i++){
            System.out.print("Enter node value: ");
            int data = sc.nextInt();

            Node newnode = new Node(data);

            if(head == null){
                head = newnode;
                tail = newnode;
            }
            else{
                tail.next = newnode;
                tail = newnode;
            }
        }
        System.out.print("Enter value to insert at front: ");
        int value = sc.nextInt();
        Node val = new Node(value);

        Node temp1 = head;

        System.out.println();

        System.out.println("BEFORE");
        while(temp1 != null){
            System.out.print(temp1.data + "->");
            temp1 = temp1.next;
        }
        System.out.print("NULL");

        System.out.println();

        Node temp2 = head;

        Node ans = insert(temp2,val);

        System.out.println();

        System.out.println("AFTER");
        while (ans != null) {
            System.out.print(ans.data + "->");
            ans = ans.next;
        }
        System.out.print("NULL");


        sc.close();
    }
}
