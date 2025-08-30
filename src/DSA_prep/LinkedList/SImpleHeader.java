package DSA_prep.LinkedList;

class Noden{
    int data;
    Noden next;
}
public class SImpleHeader {
    public static void main(String[] args) {
        Noden header = new Noden();

        Noden n1 = new Noden();
        Noden n2 = new Noden();

        n1.data = 100;
        n2.data = 200;

        header.next = n1;
        n1.next=n2;
        n2.next=null;

        Noden temp = header.next;

        while (temp != null){
            System.out.print(temp.data+" -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}
