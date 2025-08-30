package DSA_prep.LinkedList;


class Node{
    int data;
    Node next;
}
public class SIngleList {

    public static void main(String[] args) {
        Node n1 = new Node();
        Node n2 = new Node();
        Node n3 = new Node();
        Node n4 = new Node();

        n1.data=10;
        n2.data=20;
        n3.data=30;
        n4.data=40;

        Node head = n1;
        n1.next=n2;
        n2.next=n3;
        n3.next=n4;
        n4.next=null;

        Node temp = head;

        while (temp != null){
            System.out.print(temp.data+" -> ");
            temp = temp.next;
        }
        System.out.println("null");



    }
}
